package holamundo;
import javax.swing.JOptionPane;

public class main 
{
	public static void main(String[] args) 
	{
		ROBOT walle =  new ROBOT();
		walle.set_nombre(JOptionPane.showInputDialog("INGRESE EL NOMBRE:"));
		walle.set_edad(Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA EDAD:")));
		
		System.out.println("EL NOMBRE INGRESADO ES: ");
		System.out.println(walle.get_nombre());
		
		System.out.println("LA EDAD INGRESADA ES: ");
		System.out.println(walle.get_edad());	
	}
}
