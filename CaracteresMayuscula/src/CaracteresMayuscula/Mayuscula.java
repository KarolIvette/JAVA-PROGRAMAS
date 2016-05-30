package CaracteresMayuscula;
import javax.swing.JOptionPane;

public class Mayuscula<UpdateString> {
	
	static String cadena;
	
	public Mayuscula(){
		JOptionPane.showMessageDialog(null, "INICIO DEL CONSTRUCTOR");
    }
	
	public String get_cadena(){
		return this.cadena; 
	}
	
	public void set_cadena(String cadena){
		this.cadena =  cadena ; 
	}
	
	public static String nueva(){
		String cadena1;
		if(cadena.length()<3)
			return cadena.toUpperCase();
		else{
			cadena1= cadena.substring(cadena.length() -3);
			return cadena.substring(0, cadena.length() -3) + cadena1.toUpperCase();
		}
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "FIN DEL CONSTRUCTOR");
    }
}	
