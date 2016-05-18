package Calculadora;
import javax.swing.JOptionPane;

public class calculadora {
	float num1;
	float num2;

    public calculadora(float num1, float num2){
    	this.num1 = num1;
    	this.num2 = num2;
    }
	
	public float get_num1(){
		return num1; 
	}
	
	public void set_num1(float num1){
		this.num1 =  num1 ; 
	}
	
	public float get_num2(){
		return num2; 
	}
	
	public void set_num2(float num2){
		this.num2 =  num2 ; 
	}
	
	public void suma(){
		float suma = this.num1 + this.num2;
		JOptionPane.showMessageDialog(null, "LA SUMA ES : "+Float.toString(suma));
	}
	
	public void resta(){
		float resta = this.num1 - this.num2;
		JOptionPane.showMessageDialog(null, "LA RESTA ES : "+Float.toString(resta));
	}
	
	public void multiplicacion(){
		float multiplicacion = this.num1 * this.num2;
		JOptionPane.showMessageDialog(null, "LA MULTIPLICACION ES : "+Float.toString(multiplicacion));
	}
	
	public void division(){
		float division = this.num1 / this.num2;
		JOptionPane.showMessageDialog(null, "LA DIVISION ES : "+Float.toString(division));
	}
	
	public void raizcuadrada(float num){
		float raiz = (float) Math.sqrt(num);
		JOptionPane.showMessageDialog(null, "LA RAIZ CUADRADA DE : "
		+Float.toString(num)+" es = "+Float.toString(raiz));
	}
	
	public void seno(float num){
		float seno = (float) Math.sin(Math.toRadians(num));
		JOptionPane.showMessageDialog(null, "EL SENO DE : "
		+Float.toString(num)+" es = "+Float.toString(seno));
	}
	
	public void coseno(float num){
		float coseno = (float) Math.cos(Math.toRadians(num));
		JOptionPane.showMessageDialog(null, "EL COSENO DE : "
		+Float.toString(num)+" es = "+Float.toString(coseno));
	}
	
	public void tangente(float num){
		float tangente = (float) Math.tan(Math.toRadians(num));
		JOptionPane.showMessageDialog(null, "LA TANGENTE DE : "
		+Float.toString(num)+" es = "+Float.toString(tangente));
	}
}
