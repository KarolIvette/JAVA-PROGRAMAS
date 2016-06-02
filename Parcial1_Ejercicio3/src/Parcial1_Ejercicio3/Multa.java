package Parcial1_Ejercicio3;
import javax.swing.JOptionPane;

public class Multa {
	int cumple, velocidad;
	
	public Multa(int cumple, int velocidad){
		this.cumple = cumple;
		this.velocidad = velocidad;
	}
	
	public int get_cumple(){
		return cumple; 
	}
	
	public void set_vac(int vac){
		this.cumple =  cumple; 
	}
	

	public int get_velocidad(){
		return velocidad; 
	}
	
	public void set_velocidad(int velocidad){
		this.velocidad =  velocidad; 
	}
	
	public void multa(int cumple, int velocidad){
		int resp, nuevavel;
		resp = Integer.parseInt(JOptionPane.showInputDialog(null, "¿ES TU CUMPLEANIOS HOY ( 1=SI ) ( 2=NO )?"));
		if(resp == 1){
			JOptionPane.showMessageDialog(null, "SU VELOCIDAD SE DUPLICARA");
			nuevavel = velocidad*2;
			if(nuevavel <= 120){
				JOptionPane.showMessageDialog(null, "SU VELOCIDAD ES DE: " +Integer.toString(nuevavel) +" km/h. *NO TIENE MULTA* ");
			}
			else{
				if(nuevavel >= 122 && nuevavel <= 160){
					JOptionPane.showMessageDialog(null, "SU VELOCIDAD ES DE: " +Integer.toString(nuevavel) +" km/h. *USTED TIENE UNA MULTA PEQUEÑA*");
				}
				else{
					if(nuevavel >= 162){
						JOptionPane.showMessageDialog(null, "SU VELOCIDAD ES DE: " +Integer.toString(nuevavel) +" km/h. *USTED TIENE UNA MULTA GRANDE*");
					}
				}
			}
		}
		else{
			if(resp == 2){
				JOptionPane.showMessageDialog(null, "SU VELOCIDAD NO SE DUPLICARA");
				if(velocidad <= 60){
					JOptionPane.showMessageDialog(null, "SU VELOCIDAD ES DE: " +Integer.toString(velocidad) +" km/h. *NO TIENE MULTA*");
				}
				else{
					if(velocidad >= 61 && velocidad <= 80){
						JOptionPane.showMessageDialog(null, "SU VELOCIDAD ES DE: " +Integer.toString(velocidad) +" km/h. *USTED TIENE UNA MULTA PEQUEÑA*");
					}
					else{
						if(velocidad >= 81){
							JOptionPane.showMessageDialog(null, "SU VELOCIDAD ES DE: " +Integer.toString(velocidad) +" km/h. *USTED TIENE UNA MULTA GRANDE*");
						}
					}
				}
			}
		}
	}

}
