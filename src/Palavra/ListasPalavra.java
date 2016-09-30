package Palavra;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class ListasPalavra {
	static Hashtable<Integer,Palavra> palavras = new Hashtable<Integer,Palavra>();
	static ArrayList<Palavra> principais = new ArrayList<Palavra>();
	private static int tamanhoLista=300;
	
	static public void printTable(){
		int contador=0;
		Enumeration<Integer> ep = palavras.keys();
		while(ep.hasMoreElements()){
			contador++;
			Palavra p = palavras.get(ep.nextElement());
			System.out.println(p.palavra+" "+p.contador);
		}
		System.out.println(contador);
	}
	
	static public void selecionaPrincipais(){
		Enumeration ep = palavras.keys();
		while(ep.hasMoreElements()){
			Palavra p = palavras.get(ep.nextElement());
			if(principais.size()<tamanhoLista){
				principais.add(p);
				sort();
			}else if(p.contador>principais.get(0).contador){
				principais.set(0, p);
				sort();
			}
		}
	}
	
	public static void sort() {
        int length;
        if (principais == null || principais.size() == 0) {
            return;
        }
        length = principais.size();
        quickSort(0, length - 1);
    }
	
	private static void quickSort(int lowerIndex, int higherIndex) {
        
        int i = lowerIndex;
        int j = higherIndex;
        Palavra pivot = principais.get(lowerIndex+(higherIndex-lowerIndex)/2);
        while (i <= j) {
            while (principais.get(i).contador < pivot.contador) {
                i++;
            }
            while (principais.get(j).contador > pivot.contador) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
	
	private static void exchangeNumbers(int i, int j) {
		Palavra temp = principais.get(i);
		principais.set(i, principais.get(j));
		principais.set(j, temp);
    }
	
	public static void printaPrincipais(){
		for(Palavra p : principais){
			System.out.println(p.palavra+" "+p.contador);
		}
	}
	
	static public void addToHash(Palavra p){
		if(p.palavra.equals("")){
		}else if(palavras.get(p.hash())!=null){
			palavras.get(p.hash()).contador++;
		}else{
			palavras.put(p.hash(), p);
			palavras.get(p.hash()).contador++;
		}
	}

}
