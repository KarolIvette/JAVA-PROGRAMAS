package Calculadora;
import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) 
	{
		float num1;
		float num2;
		
		num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "INGRESE EL PRIMER NUMERO:"));
		num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "INGRESE EL SEGUNDO NUMERO:"));
		
		calculadora cal = new calculadora(num1, num2);
		
		cal.suma();
		cal.resta();
		cal.multiplicacion();
		cal.division();
		
		cal.raizcuadrada(cal.get_num1());
		cal.raizcuadrada(cal.get_num2());
		
		cal.seno(cal.get_num1());
		cal.seno(cal.get_num2());
		
		cal.coseno(cal.get_num1());
		cal.coseno(cal.get_num2());
		
		cal.tangente(cal.get_num1());
		cal.tangente(cal.get_num2());
	}
}
