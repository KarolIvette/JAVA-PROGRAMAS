package AplicacionDescanso;
import javax.swing.JOptionPane;

import AplicacionDescanso.Vacaciones;

public class main {
	public static void main(String[] args) {
		int vacaciones, semana;
		vacaciones = JOptionPane.OK_OPTION;
		semana = JOptionPane.OK_OPTION;
		
		Vacaciones apl = new Vacaciones(vacaciones, semana);
		apl.opciones(vacaciones,semana);
	}
}
