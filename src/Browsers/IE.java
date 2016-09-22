package Browsers;

import java.util.ArrayList;
import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class IE {
	static private String arq = "IE.txt";
	public static ArrayList<Comentario> listaIE = new ArrayList<>();

	public static void preencheArray(){
		Leitor.leArquivo(arq, listaIE);
	}
}
