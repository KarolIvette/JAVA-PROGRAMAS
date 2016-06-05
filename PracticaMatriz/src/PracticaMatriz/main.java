package PracticaMatriz;

public class main {

	public static void main(String[] args) {
		
		int arr[][]={ {1,3,6,7,4,5,2,8} , {11,16,13,10,14,12,15,9} };
		Matriz vec = new Matriz(arr);
		
		vec.getMax(arr);
		vec.getMin(arr);
		vec.getpromedio(arr);
		vec.ordenar_ascendente(arr);
		vec.ordenar_descendente(arr);
	}

}
