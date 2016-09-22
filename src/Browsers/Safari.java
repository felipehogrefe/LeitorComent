package Browsers;

import java.util.ArrayList;
import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class Safari {
	static private String arq = "safari.txt";
	public static ArrayList<Comentario> listaSafari = new ArrayList<>();

	public static void preencheArray(){
		Leitor.leArquivo(arq, listaSafari);
	}
}
