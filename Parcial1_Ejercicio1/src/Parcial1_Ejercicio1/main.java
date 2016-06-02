package Parcial1_Ejercicio1;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UN NUMERO:"));
		
		TablaMultiplicar cal = new TablaMultiplicar(n);
		
		cal.tabla(n);

	}

}
