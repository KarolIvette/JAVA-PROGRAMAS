package FiguraPiramide;
import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		PIRAMIDE figura =  new PIRAMIDE();
		figura.set_tama�o(Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL TAMA�O:")));
		
		figura.dibujarombo(figura.get_tama�o());		
	}

}
