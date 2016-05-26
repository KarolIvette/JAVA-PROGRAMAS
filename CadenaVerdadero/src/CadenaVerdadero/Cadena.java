package CadenaVerdadero;

public class Cadena {
	String cadena;

    public Cadena(){
    	System.out.println("INICIO DEL CONSTRUCTOR");
    }
	
	public String get_cadena(){
		return this.cadena; 
	}
	
	public void set_cadena(String cadena){
		this.cadena =  cadena ; 
	}
	
	public boolean testCad(){
		if(this.cadena.length()<2)
			return false;
		String new_ca = this.cadena.substring(0,2);
		if(new_ca.equals("ca"))
			return true;
		return false;
	}
	
	protected void finalize(){
		System.out.println("FIN DEL CONSTRUCTOR");
    }
}
