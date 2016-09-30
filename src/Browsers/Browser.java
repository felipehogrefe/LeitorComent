package Browsers;

import java.util.ArrayList;

import Caracteristica.Caracteristica;
import LeitorComent.Comentario;
import LeitorComent.Leitor;

public class Browser {
	public String arq;
	private String saida;
	public ArrayList<Comentario> lista;
	public ArrayCaracteristicas contador = new ArrayCaracteristicas();
	
	public Browser(String arq, String saida){
		this.arq=arq;
		this.saida=saida;
		this.lista = new ArrayList<>();
	}
	
	public void preencheArray(){
		Leitor.leArquivo(arq, lista);
		Caracteristica.setaCaracteristicas(this);
	}
	
	public void printaNotas(){
		for(int i = 0; i<10;i++){
			double h = (double)contador.caracteristicas[i]/(double)contador.contador[i];
			long j = (long)(contador.caracteristicas[i]/h);
			System.out.printf("%.1f",h);
			System.out.print(",");
		}
	}
	

}
