package Browsers;

import java.util.ArrayList;

import Caracteristica.Caracteristica;
import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class Safari {
	static private String arq = "safari";
	static private String saida = "saidaSafari.txt";
	public static ArrayList<Comentario> listaSafari = new ArrayList<>();
	public static int caracteristicas[] = {0,0,0,0,0,0,0,0,0,0,0};

	public static void preencheArray(){
		Leitor.leArquivo(arq, listaSafari);
		Caracteristica.setaCaracteristicas(listaSafari, caracteristicas);
	}
	
	public static void printaNotas(){
		for(int i : caracteristicas){
			System.out.print(i+" ");
		}
	}
}
