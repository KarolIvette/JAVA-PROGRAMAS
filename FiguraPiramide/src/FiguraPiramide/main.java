package FiguraPiramide;
import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		PIRAMIDE figura =  new PIRAMIDE();
		figura.set_tamaño(Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL TAMAÑO:")));
		
		figura.dibujarombo(figura.get_tamaño());		
	}

}
