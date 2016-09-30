package Browsers;

import java.util.ArrayList;

import Caracteristica.Caracteristica;
import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class Firefox {
	static private String arq = "firefox";
	static private String saida = "saidaFirefox.txt";
	public static ArrayList<Comentario> listaFirefox = new ArrayList<>();
	public static int caracteristicas[] = {0,0,0,0,0,0,0,0,0,0};
	
	public static void preencheArray(){
		Leitor.leArquivo(arq, listaFirefox);
		Caracteristica.setaCaracteristicas(listaFirefox, caracteristicas);
	}
	
	public static void printaNotas(){
		for(int i : caracteristicas){
			System.out.print(i+" ");
		}
	}
}
