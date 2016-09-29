package Browsers;

import java.util.ArrayList;

import LeitorComent.Comentario;

public class Browser {
	static private String arq;
	static private String saida;
	public static ArrayList<Comentario> lista;
	public static int caracteristicas[]={0,0,0,0,0,0,0,0,0,0,0};
	
	public Browser(String arq, String saida){
		this.arq=arq;
		this.saida=saida;
		this.lista = new ArrayList<>();
	}
	

}
