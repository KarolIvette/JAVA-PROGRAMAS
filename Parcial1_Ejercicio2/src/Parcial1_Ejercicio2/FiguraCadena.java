package Parcial1_Ejercicio2;

public class FiguraCadena {
	String cadena;
	
	public FiguraCadena(String cadena){
		this.cadena = cadena;
	}
	
	public String get_cadena(){
		return this.cadena; 
	}
	
	public void set_cadena(String cadena){
		this.cadena =  cadena ; 
	}
	
	public void figura(String cadena){
		int tam = cadena.length();
		int pos1=0, pos2=1;
		for(int i=0; i<=tam; i++){
			System.out.println(cadena.substring(pos1, pos2));
			pos2=pos2+1;
			pos1=pos1+1;
		}
	}

}
