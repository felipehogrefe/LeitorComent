package LeitorComent;

public class Comentario {
	private int nota;
	public int totalPalavras=0;
	private String titulo;
	private String comentario;
	
	
	public Comentario(String nota, String titulo, String comentario){
		this.nota=Integer.valueOf(nota);
		this.titulo=titulo;
		this.comentario=comentario;
	}
	
	public void print(){
		System.out.println(nota+"\n"+totalPalavras+"\n"+titulo+"\n"+comentario+"\n");
	}
	
	public String getComentario(){
		return this.comentario;
	}
}
