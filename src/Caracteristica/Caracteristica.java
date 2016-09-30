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
	private static final String[] memoria = {"MEMORIA", "RAM", "ESPACO"};											// 8
	private static final String[] social = {"REDES", "SOCIAIS", "FACEBOOK", "TWITTER", "EMAIL", "E-MAIL"};			// 9
	private static ArrayList<String[]> listaCarac = new ArrayList<>();
	
	private static void criaLista(){
		if(listaCarac.size()==0){
			listaCarac.add(complemento);
			listaCarac.add(recurso);
			listaCarac.add(bug);
			listaCarac.add(visual);
			listaCarac.add(download);
			listaCarac.add(video);
			listaCarac.add(seguranca);
			listaCarac.add(velocidade);
			listaCarac.add(memoria);
			listaCarac.add(social);
		}
		
	}
				
	public static void setaCaracteristicas(Browser b){
		criaLista();	
		
		long nota;
		int i;
		String comentario;
		ArrayList<Comentario> coment = b.lista;
		ArrayCaracteristicas ac = b.contador;
				
		for(Comentario c : coment){
			nota =c.getNota();
			comentario = c.getComentario();
			i=0;
			for(String[] s : listaCarac){
				for(String cc : s){
					if(comentario.contains(cc)){
						ac.incrementaArray(i, nota);
						break;
					}
				}
				i++;
			}
		}
	}
}
