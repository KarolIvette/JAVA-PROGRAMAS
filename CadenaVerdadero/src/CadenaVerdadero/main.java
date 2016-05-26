package CadenaVerdadero;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		Cadena ca = new Cadena();
		
		ca.set_cadena (JOptionPane.showInputDialog("INGRESE UNA PALABRA DE MINIMO 2 CARACTERES:"));
		
		if(ca.testCad())
			JOptionPane.showMessageDialog(null, "EL INGRESO ES VERDADERO");
		else
			JOptionPane.showMessageDialog(null, "EL INGRESO ES FALSO");
		
		ca = null;
		System.gc();
		
	}

}
