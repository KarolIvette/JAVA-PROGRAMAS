package PracticaMatriz;

public class main {

	public static void main(String[] args) {
		
		int arr[][]={ {40,15,20,10,5,25,35,30} , {45,75,55,70,80,65,50,60} };
		Matriz vec = new Matriz(arr);
		
		vec.getMax(arr);
		vec.getMin(arr);
		vec.getpromedio(arr);
		vec.ordenar_ascendente(arr);
		vec.ordenar_descendente(arr);
	}

}
