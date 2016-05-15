package EjercicioFigura;
import javax.swing.JOptionPane;

public class main 
{
	public static void main(String[] args) {
		Figura rectangulo =  new Figura();
		rectangulo.set_altura(Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL ALTO:")));
		rectangulo.set_ancho(Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL ANCHO:")));
		
		rectangulo.dibujarfigura(rectangulo.get_alto(), rectangulo.get_ancho());		
	}

}
