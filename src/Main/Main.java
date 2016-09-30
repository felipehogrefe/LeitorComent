package Main;

import Browsers.*;
import LeitorComent.Comentario;
import Palavra.ListasPalavra;
import Palavra.Palavra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		preencheArrays();

		System.out.print("Chrome: ");
		Chrome.printaNotas();
		System.out.print("\nIE: ");
		IE.printaNotas();
		System.out.print("\nFirefox: ");
		Firefox.printaNotas();
		System.out.print("\nOpera: ");
		Opera.printaNotas();
		System.out.print("\nSafari: ");
		Safari.printaNotas();


//		discriminaPalavras();
//		ListasPalavra.selecionaPrincipais();
//		ListasPalavra.printaPrincipais();
//		
//		System.out.println(Palavra.total);
		
//		PalavraHash.printTable();
	}

	private static void discriminaPalavras() {
		for(Comentario c : Firefox.listaFirefox){
			Palavra.discriminaPalavra(c);
		}
		for(Comentario c : IE.listaIE){
			Palavra.discriminaPalavra(c);
		}
		for(Comentario c : Opera.listaOpera){
			Palavra.discriminaPalavra(c);
		}
		for(Comentario c : Safari.listaSafari){
			Palavra.discriminaPalavra(c);
		}
		for(Comentario c : Chrome.listaChrome){
			Palavra.discriminaPalavra(c);
		}
	}

	private static void preencheArrays() {
		Chrome.preencheArray();
		Safari.preencheArray();
		Opera.preencheArray();
		Firefox.preencheArray();
		IE.preencheArray();
	}

}
