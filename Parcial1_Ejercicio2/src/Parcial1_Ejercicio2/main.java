package Parcial1_Ejercicio2;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		String cadena;
		
		cadena = JOptionPane.showInputDialog("INGRESE LA PALABRA:");
		
		FiguraCadena fig = new FiguraCadena(cadena);
		fig.figura(cadena);
	}
		
}