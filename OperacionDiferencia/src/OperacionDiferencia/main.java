package OperacionDiferencia;
import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) 
	{
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO:"));
		
		Resta cal = new Resta(n);	
		System.out.println("LA DIFERENCIA ES: "+cal.operacion());
	}
}
