package BorrarLetra;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		String cadena;
		int posicion;
		
		cadena = JOptionPane.showInputDialog("INGRESE LA PALABRA:");
		posicion = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA POSICION:"));
		
		JOptionPane.showMessageDialog(null, deleteChar(cadena, posicion));
	}
	
	public static String deleteChar(String cadena, int posicion) {
	      return cadena.substring(0, posicion) + cadena.substring(posicion + 1);
	   }

	/*public static String deleteChar(String cadena, int posicion) {
		StringBuffer buf = new StringBuffer( cadena.length() - 1 );
		buf.append( cadena.substring(0,posicion) ).append( cadena.substring(posicion+1) );
		return buf.toString();
	}*/

}
