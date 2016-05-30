package CaracteresMayuscula;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
	
		Mayuscula camb = new Mayuscula();
		
		camb.set_cadena (JOptionPane.showInputDialog("INGRESE LA PALABRA:"));
		
		System.gc();
		
		JOptionPane.showMessageDialog(null, camb.nueva());
			
		
	}	
}
