package Parcial1_Ejercicio3;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		int cumple, velocidad;
		
		velocidad = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA VELOCIDAD:"));
		cumple = JOptionPane.OK_OPTION;
		
		Multa apl = new Multa(cumple, velocidad);
		apl.multa(cumple, velocidad);
		
	}

}
