package AplicacionDescanso;
import javax.swing.JOptionPane;

public class Vacaciones {
	int vacaciones, semana;
	
	public Vacaciones(int vacaciones, int semana){
		this.vacaciones = vacaciones;
		this.semana = semana;
	}
	
	public int get_vac(){
		return this.vacaciones; 
	}
	
	public void set_vacaciones(int vacaciones){
		this.vacaciones =  vacaciones; 
	}
	
	public int get_semana(){
		return this.semana; 
	}
	
	public void set_semana(int semana){
		this.semana =  semana; 
	}
	
	public boolean opciones(int vacaciones, int semana){
		int resp1, resp2;
		resp1=JOptionPane.showConfirmDialog(null,"¿ESTAS EN DIA DE SEMANA?");
		resp2=JOptionPane.showConfirmDialog(null,"ESTAS DE VACACIONES?");
		if(resp1== 1 && resp2==0){
			JOptionPane.showMessageDialog(null, "¡PUEDE DESCANSAR!");
			return true;
		}
		else{
			JOptionPane.showMessageDialog(null, "¡NO PUEDE DESCANSAR!");
			return false;
		}
	}
}
