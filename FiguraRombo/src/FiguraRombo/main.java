package FiguraRombo;
import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		ROMBO figura =  new ROMBO();
		figura.set_tama�o(Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL TAMA�O:")));
		
		figura.dibujarombo(figura.get_tama�o());		
	}

}
