package Browsers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Caracteristica.Caracteristica;
import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class Chrome{
	static private String arq = "chrome";
	static private String saida = "saidaChrome.txt";
	static public ArrayList<Comentario> listaChrome = new ArrayList<>();
	public static int caracteristicas[] = {0,0,0,0,0,0,0,0,0,0};
	
	public static void preencheArray(){
		Leitor.leArquivo(arq, listaChrome);
		Caracteristica.setaCaracteristicas(listaChrome, caracteristicas);
	}
	
	public static void printaNotas(){
		for(int i : caracteristicas){
			System.out.print(i+" ");
		}
	}
}
