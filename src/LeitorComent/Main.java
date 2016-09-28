package LeitorComent;

import Browsers.*;
import Palavra.ListasPalavra;
import Palavra.Palavra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		preencheArrays();
		
		
		
//		discriminaPalavras();
//		ListasPalavra.selecionaPrincipais();
//		ListasPalavra.printaPrincipais();
		
		System.out.println(Palavra.total);
		
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
//		Safari.preencheArray();
//		Opera.preencheArray();
//		Firefox.preencheArray();
//		IE.preencheArray();
	}

}
