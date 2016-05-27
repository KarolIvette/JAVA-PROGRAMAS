package ValoresSuma;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		Suma num = new Suma(JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO:"),
				            JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO:"),
				            JOptionPane.showInputDialog("INGRESE EL TERCER NUMERO:"),
				            JOptionPane.showInputDialog("INGRESE EL CUARTO NUMERO:"));
		
		num.diferencia_numeros();
		JOptionPane.showMessageDialog(null,"LA SUMA ES: "+ num.suma());
		
	}

}
