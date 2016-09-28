package LeitorComent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Leitor {
	static private String caminho = "/home/laccan/workspace/LeitorComent/src/LeitorComent/";
	
	static public void leArquivo(String arquivo, ArrayList lista){
		//discrimina os comentarios de um certo navegador, irá evidencia nota, 
		//navegador, titulo e comentario
		
		String nota="";
		String titulo="";
		String comentario="";
		String navegador=arquivo.substring(0, arquivo.length());
		BufferedReader r;
        String concat="";
        int contador=0;
		
		try{
            //abre novo arquivo
            r = new BufferedReader(new FileReader(caminho+arquivo));
            
            int i=0;
            
            //temos um while que ira ler ate o fim do arquivo, e cada vez que encontrar 
            //certa flag ira entrar em um seletor que coletara info de cada comentario
            while(i>=0){
            	i=r.read();
                concat+=(char)i;
                //coleta nota
                if(concat.contains("notas/25/")){
                	concat="";
                    nota="";
                	while(!concat.contains(".png")){
                        concat+=(char)r.read();                	
                	}
                	if(concat.charAt(1)=='0'){
                		nota = "10";
                	}else{
                		nota = concat.substring(0,1);
                	}
                }
                //coleta titulo
                if(concat.contains("<strong>")){
                	concat="";
                	while(!concat.contains("</strong>")){
                        concat+=(char)r.read();                	
                	}
                	titulo = concat.substring(0, concat.length()-9);
                }
                //coleta comentario
                if(concat.contains("<span>")){
                	concat="";
                	while(!concat.contains("</span>")){
                        concat+=(char)r.read();                	
                	}
                	comentario = concat.substring(0, concat.length()-7);
                	//cria novo comentario e adiciona na lista do navegador
                    Comentario novoComentario = new Comentario(nota,titulo,comentario,navegador);
                    lista.add(novoComentario);
                    contador++;
                }                
            }
            r.close();
            System.out.println(contador);
        }catch(Exception e){
            e.printStackTrace();
        }
	}

}
