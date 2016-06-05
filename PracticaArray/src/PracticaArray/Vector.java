package PracticaArray;

public class Vector {
	//int num[] = new int [5];
	
	//int []num = new int [5];
	
	//int array[][] = new int [10][10];
	 
	 public Vector(int[] arr) {
		 int vector[] = new int [8];
	}

	public void getMax(int[] arr){
		 int mayor = arr[0];
		 for(int i=0;i<arr.length; i++)
		 {
			 if(mayor < arr[i])
				 mayor = arr[i];
		 }
		 System.out.println("EL MAYOR ES: " +mayor);
	 }
	
	public void getMin(int[] arr){
		 int menor = arr[0];
		 for(int i=0;i<arr.length; i++)
		 {
			 if(menor > arr[i])
				 menor = arr[i];
		 }
		 System.out.println("EL MENOR ES: " +menor);
	 }
	
	 static void ordenar(int[] arr){
		 System.out.print("EL ARREGLO QUEDA ORDENADO ASCENDENTE: \n");
	        for(int i = 0; i < arr.length - 1; i++)
	        {
	            for(int j = 0; j < arr.length - 1; j++)
	            {
	                if (arr[j] > arr[j + 1])
	                {
	                    int tmp = arr[j+1];
	                    arr[j+1] = arr[j];
	                    arr[j] = tmp;
	                }
	            }
	        }
	        for(int i = 0;i < arr.length; i++)
	        {
	            System.out.print(arr[i]+" ");
	        }
	 }
	 
	 public void getpromedio(int[] arr)
	 {
		 float s=0, p=0;
		 for(int i=0;i<arr.length; i++)
		 {
				 s+=arr[i];
				 p++;
		 }
		 System.out.print("\nEL PROMEDIO ES: " +(s/p));
	 }
}
