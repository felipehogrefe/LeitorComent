package Browsers;

import java.util.ArrayList;

import Caracteristica.Caracteristica;
import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class IE {
	static private String arq = "IE";
	static private String saida = "saidaIE.txt";
	public static ArrayList<Comentario> listaIE = new ArrayList<>();
	public static int caracteristicas[] = {0,0,0,0,0,0,0,0,0,0};

	public static void preencheArray(){
		Leitor.leArquivo(arq, listaIE);
		Caracteristica.setaCaracteristicas(listaIE, caracteristicas);
	}
	
	public static void printaNotas(){
		for(int i : caracteristicas){
			System.out.print(i+" ");
		}
	}
}
