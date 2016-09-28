package Browsers;

import java.util.ArrayList;
import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class IE {
	static private String arq = "IE";
	static private String saida = "saidaIE.txt";
	public static ArrayList<Comentario> listaIE = new ArrayList<>();
	public int caracteristicas[] = {0,0,0,0,0,0,0,0,0,0,0};

	public static void preencheArray(){
		Leitor.leArquivo(arq, listaIE);
	}
}
