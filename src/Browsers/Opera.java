package Browsers;

import java.util.ArrayList;
import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class Opera {
	static private String arq = "opera.txt";
	public static ArrayList<Comentario> listaOpera = new ArrayList<>();

	public static void preencheArray(){
		Leitor.leArquivo(arq, listaOpera);
	}
}
