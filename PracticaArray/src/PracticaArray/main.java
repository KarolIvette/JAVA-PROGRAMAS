package PracticaArray;

public class main {

	public static void main(String[] args) {
		
		int arr[] = {1,3,6,7,4,5,2,8};
		Vector vec = new Vector(arr);
		
		vec.getMax(arr);
		vec.getMin(arr);
		vec.ordenar(arr);
		vec.getpromedio(arr);

	}

}
