package Main;

import java.util.ArrayList;

import Browsers.*;
import LeitorComent.Comentario;
import Palavra.ListasPalavra;
import Palavra.Palavra;

public class Main {
	public static ArrayList<Browser> browsers = new ArrayList<>();

	public static void main(String[] args) {	
		criaArraysBrowser();
		preencheArrays();
		
//		for(Browser bw : browsers){
//			bw.printaNotas();
//			System.out.println(bw.arq);
//		}

		discriminaPalavras();
		ListasPalavra.selecionaPrincipais();
		ListasPalavra.printaPrincipais();
//		
//		System.out.println(Palavra.total);
		
//		PalavraHash.printTable();
	}

	private static void discriminaPalavras() {
		for(Browser bw : browsers){
			for(Comentario c : bw.lista){
				Palavra.discriminaPalavra(c);
			}
		}
	}
	
	private static void criaArraysBrowser(){
		Browser b = new Browser("chrome","chromeSaida");
		browsers.add(b);
		b = new Browser("firefox","firefoxSaida");
		browsers.add(b);
		b = new Browser("IE","IESaida");
		browsers.add(b);
		b = new Browser("opera","operaSaida");
		browsers.add(b);
		b = new Browser("safari","safariSaida");
		browsers.add(b);
	}

	private static void preencheArrays() {		
		for(Browser bw : browsers){
			bw.preencheArray();
		}
	}

}
