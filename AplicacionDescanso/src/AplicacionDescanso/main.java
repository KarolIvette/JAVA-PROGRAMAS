package AplicacionDescanso;
import javax.swing.JOptionPane;

import AplicacionDescanso.Vacaciones;

public class main {
	public static void main(String[] args) {
		int vacaciones=0, semana=0;
		Vacaciones descanso;
		
		descanso = new Vacaciones(vacaciones,semana);
		descanso.opciones(vacaciones,semana);
	}
}
