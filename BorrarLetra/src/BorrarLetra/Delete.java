package BorrarLetra;

public class Delete {
	String cadena;
	int posicion;

    public Delete(String cadena, int posicion){
    	this.cadena = cadena;
    	this.posicion = posicion;
    }
	
	public String get_cadena(){
		return this.cadena; 
	}
	
	public void set_cadena(String cadena){
		this.cadena =  cadena ; 
	}
	
	public int get_posicion(){
		return this.posicion; 
	}
	
	public void set_posicion(int  posicion){
		this.posicion =  posicion ; 
	}
}
