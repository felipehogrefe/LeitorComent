package Palavra;

import java.awt.RenderingHints.Key;

import LeitorComent.Comentario;

public class Palavra {
	public String palavra;
	public int contador=0;
	public static int total=0;
	
	public Palavra(String palavra){
		this.palavra=palavra;
	}
	
	static public void discriminaPalavra(Comentario c){
		String comentario = c.getComentario();
		int tamanho = comentario.length();
		int posicao=0, posicaoAtual, posicaoAnterior;	
		String concatenacao="";
		char atual;
		
		while(posicao<tamanho){
			atual=comentario.charAt(posicao);
			if(atual == ' '){
				concatenacao = addPalavra(concatenacao,c);
			}else if(atual == '.'){
				concatenacao = addPalavra(concatenacao,c);			
			}else if(atual == ','){
				concatenacao = addPalavra(concatenacao,c);			
			}else if(atual == '!'){
				concatenacao = addPalavra(concatenacao,c);			
			}else if(atual == '/'){
				concatenacao = addPalavra(concatenacao,c);			
			}else if(atual == '+'){
				concatenacao = addPalavra(concatenacao,c);			
			}else if(atual == '('){
				concatenacao = addPalavra(concatenacao,c);			
			}else if(atual == ')'){
				concatenacao = addPalavra(concatenacao,c);			
			}else if(atual == '?'){
				concatenacao = addPalavra(concatenacao,c);			
			}else if(atual == ';'){
				concatenacao = addPalavra(concatenacao,c);			
			}else if(atual == '	'){
				concatenacao = addPalavra(concatenacao,c);			
			}else{
				concatenacao += atual;
			}		
			posicao++;
		}
	}

	private static String addPalavra(String concatenacao, Comentario c) {
		Palavra novaPalavra = new Palavra(concatenacao);
		ListasPalavra.addToHash(novaPalavra);
		c.totalPalavras++;
		concatenacao="";
		total++;
		return concatenacao;
	}
	
	int hash() { 
	    return (this.palavra.hashCode() & 0x7fffffff) % 5001; 
	}
	

}
