package Browsers;

import java.util.ArrayList;
import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class Firefox {
	static private String arq = "firefox";
	static private String saida = "saidaFirefox.txt";
	public static ArrayList<Comentario> listaFirefox = new ArrayList<>();
	public int caracteristicas[] = {0,0,0,0,0,0,0,0,0,0,0};
	
	public static void preencheArray(){
		Leitor.leArquivo(arq, listaFirefox);
	}
}
