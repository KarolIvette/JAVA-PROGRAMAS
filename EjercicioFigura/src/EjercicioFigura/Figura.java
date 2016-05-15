package EjercicioFigura;

public class Figura 
{
	int alto; 
	int ancho; 
	
	public int get_alto(){
		return this.alto; 
	}
	
	public void set_altura(int alto){
		this.alto=alto; 
	}
	
	public int get_ancho(){
		return this.ancho; 
	}
	
	public void set_ancho(int ancho){
		this.ancho=ancho; 
	}
	
	public void dibujarfigura ( int alto , int ancho){
		for (int fila=0; fila<alto; fila++){
			for(int columna=0; columna<ancho;  columna++){
				if ((fila==0 || columna==ancho-1) || (columna==0 || fila==alto-1))
					System.out.print( "* " );
				else
					System.out.print( "  " );
				}
			System.out.println(); 
		}
	}
}
