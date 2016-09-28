package Browsers;

import java.util.ArrayList;
import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class Opera {
	static private String arq = "opera";
	static private String saida = "saidaOpera.txt";
	public static ArrayList<Comentario> listaOpera = new ArrayList<>();
	public int caracteristicas[] = {0,0,0,0,0,0,0,0,0,0,0};

	public static void preencheArray(){
		Leitor.leArquivo(arq, listaOpera);
	}
}
