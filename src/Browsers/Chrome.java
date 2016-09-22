package Browsers;

import java.util.ArrayList;

import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class Chrome {
	static private String arq = "chrome.txt";
	static public ArrayList<Comentario> listaChrome = new ArrayList<>();
	
	public static void preencheArray(){
		Leitor.leArquivo(arq, listaChrome);
	}
	
}
