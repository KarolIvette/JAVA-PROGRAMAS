package AplicacionDescanso;
import javax.swing.JOptionPane;

public class Vacaciones {
	int vacaciones, semana;
	
	public Vacaciones(int vac, int sem){
		this.vacaciones = vac;
		this.semana = sem;
	}
	
	public int get_vac(){
		return vacaciones; 
	}
	
	public void set_vac(int vac){
		this.vacaciones =  vac ; 
	}
	
	public int get_sem(){
		return vacaciones; 
	}
	
	public void set_sem(int sem){
		this.semana =  sem ; 
	}
	
	public void opciones(int vac, int sem){
		int resp;
		int resp2;
		resp = JOptionPane.showConfirmDialog(null, "¿ESTAS EN DIA DE SEMANA?");
		if(JOptionPane.OK_OPTION == resp){
			boolean r1 = (resp != 0);
			r1 = true;
		}
		else{
			boolean r1 = (resp == 0);
			r1 = false;
		}
		
		resp = JOptionPane.showConfirmDialog(null, "¿ESTAS EN VACACIONES?");
		if(JOptionPane.OK_OPTION == resp){
			boolean r2 = (resp != 0);
			r2 = true;
		}
		else{
			boolean r2 = (resp == 0);
			r2 = false;
		}
		
		boolean r1 = true && false;
		boolean r2 = true && false;
		
		if(r1==false && r2==true){
			JOptionPane.showMessageDialog(null, "¡PUEDE DESCANSAR!");
		}
		else{
			JOptionPane.showMessageDialog(null, "¡NO PUEDE DESCANSAR!");
		}
	}
}
