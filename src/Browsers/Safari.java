package Browsers;

import java.util.ArrayList;
import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class Safari {
	static private String arq = "safari";
	static private String saida = "saidaSafari.txt";
	public static ArrayList<Comentario> listaSafari = new ArrayList<>();
	public int caracteristicas[] = {0,0,0,0,0,0,0,0,0,0,0};

	public static void preencheArray(){
		Leitor.leArquivo(arq, listaSafari);
	}
}
