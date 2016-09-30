package Browsers;

public class ArrayCaracteristicas {
	public long caracteristicas[]= {0,0,0,0,0,0,0,0,0,0};
	public int contador[]= {0,0,0,0,0,0,0,0,0,0};
	
//	public ArrayCaracteristicas(){
//		long ca[] = {0,0,0,0,0,0,0,0,0,0};
//		caracteristicas = ca;
//		int co[] = {0,0,0,0,0,0,0,0,0,0};
//		contador = co;
//		
//	}
	
	public void incrementaArray(int pos, long nota){
		this.caracteristicas[pos]+=nota;
		this.contador[pos]++;
	}
}
