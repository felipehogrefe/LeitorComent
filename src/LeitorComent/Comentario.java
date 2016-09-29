package LeitorComent;

import java.text.Normalizer;

public class Comentario {
	private long nota;
	public int totalPalavras=0;
	private String titulo;
	private String comentario;
	private String navegador;
	
	
	public Comentario(String nota, String titulo, String comentario, String navegador){
		this.nota=Long.valueOf(nota);
		this.titulo=removerAcentos(titulo.toUpperCase());
		this.comentario=removerAcentos(comentario.toUpperCase());
		this.navegador=removerAcentos(navegador.toUpperCase());
	}
	
	public static String removerAcentos(String str) {
		str = Normalizer.normalize(str, Normalizer.Form.NFD);
		str = str.replaceAll("[^\\p{ASCII}]", "");
	    return str;
	}
	
	public void print(){
		System.out.println(navegador+" "+totalPalavras+"\n"+nota+" "+titulo+"\n"+comentario+"\n");
	}
	
	public String getComentario(){
		return this.comentario;
	}
	public long getNota(){
		return this.nota;
	}
}
