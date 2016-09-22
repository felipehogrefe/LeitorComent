package Browsers;

import java.util.ArrayList;
import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class Firefox {
	static private String arq = "firefox.txt";
	public static ArrayList<Comentario> listaFirefox = new ArrayList<>();
	
	public static void preencheArray(){
		Leitor.leArquivo(arq, listaFirefox);
	}
}
