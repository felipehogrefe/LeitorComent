package Caracteristica;

import java.util.ArrayList;

import Browsers.ArrayCaracteristicas;
import Browsers.Browser;
import LeitorComent.Comentario;

public class Caracteristica {
	private static final String[] complemento = {"COMPLEMENTO","EXTENSOES","EXTENSAO"}; 							// 0
	private static final String[] recurso = {"RECURSO"};															// 1	
	private static final String[] bug = {"BUGS", "PROBLEMA", "TRAVANDO", "TRAVA", "TRAVOU", "TRAVADA", "TRAVADO"};	// 2
	private static final String[] visual = {"BONITO", "VISUAL", "INTERFACE", "FEIO"};								// 3
	private static final String[] download = {"DOWNLOAD"};															// 4
	private static final String[] video = {"VIDEO", "MUSICA", "MIDIA", "YOUTUBE"};									// 5
	private static final String[] seguranca = {"SEGURA", "SEGURANCA", "PROTECAO", "SEGURO"};						// 6
	private static final String[] velocidade = {"PESADO", "LENTO", "LEVE", "RAPIDO", "VELOCIDADE"};					// 7
	private static final String[] update = {"ATUALIZACAO", "ATUALIZACOES", "UPDATE"};								// 8
	private static final String[] memoria = {"MEMORIA", "RAM", "ESPACO"};											// 9
	private static final String[] social = {"REDES", "SOCIAIS", "FACEBOOK", "TWITTER", "EMAIL", "E-MAIL"};			// 10
	private static final ArrayList<String[]> listaCarac = new ArrayList<>();
				
	public static void setaCaracteristicas(Browser b){
		long nota;
		String comentario;
		ArrayList<Comentario> coment = b.lista;
		ArrayCaracteristicas ac = b.contador;
		for(Comentario c : coment){
			nota =c.getNota();
			comentario = c.getComentario();
//			System.out.println(nota);
			for(String cc : complemento){
//				System.out.println(cc);
				if(comentario.contains(cc)){
					ac.incrementaArray(0, nota);
					break;
				}
			}
			for(String cc : recurso){
				if(comentario.contains(cc)){
					ac.incrementaArray(1, nota);
					break;
				}
			}
			for(String cc : bug){
				if(comentario.contains(cc)){
					ac.incrementaArray(2, nota);
					break;
				}
			}
			for(String cc : visual){
				if(comentario.contains(cc)){
					ac.incrementaArray(3, nota);
					break;
				}
			}
			for(String cc : download){
				if(comentario.contains(cc)){
					ac.incrementaArray(4, nota);
					break;
				}
			}
			for(String cc : video){
				if(comentario.contains(cc)){
					ac.incrementaArray(5, nota);
					break;
				}
			}
			for(String cc : seguranca){
				if(comentario.contains(cc)){
					ac.incrementaArray(6, nota);
					break;
				}
			}
			for(String cc : velocidade){
				if(comentario.contains(cc)){
					ac.incrementaArray(7, nota);
					break;
				}
			}
			for(String cc : memoria){
				if(comentario.contains(cc)){
					ac.incrementaArray(8, nota);
					break;
				}
			}
			for(String cc : social){
				if(comentario.contains(cc)){
					ac.incrementaArray(9, nota);
					break;
				}
			}	
		}		
	}
	
}
