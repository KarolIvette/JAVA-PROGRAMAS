package PracticaMatriz;

public class Matriz {

	public Matriz(int[][] arr) {
		int matriz[][] = new int [8][8];
	}
	
	public void getMax(int[][] arr){
		 int mayor = arr[0][0];
		 for(int i=0;i<arr.length; i++)
		 {
			 for(int j=0;j<arr.length; j++){
			 if(mayor < arr[i][j])
				 mayor = arr[i][j];
			 }
		 }
		 System.out.println("EL MAYOR ES: " +mayor);
	 }
	
	public void getMin(int[][] arr){
		 int menor = arr[0][0];
		 for(int i=0;i<arr.length; i++)
		 {
			 for(int j=0;j<arr.length; j++){
			 if(menor > arr[i][j])
				 menor = arr[i][j];
			 }
		 }
		 System.out.println("EL MENOR ES: " +menor);
	 }
	
	public void getpromedio(int[][] arr){
		float s=0, n=0;
		for (int i = 0; i < arr.length; i ++) {
			for( int j = 0; j < arr[i].length; j++) 
			{
				s+= arr[i][j]; 
				n++;
		} 
		} 

		System.out.println("EL PROMEDIO DE LA MATRIZ ES: " +(s/(n)));
	}
	
	public void ordenar_ascendente(int[][] arr){
		for(int i=0; i < arr.length; i++){
			for(int j=0; j < arr[i].length; j++){
				for(int x=0; x < arr.length; x++){
					for(int y=0; y < arr[x].length; y++){
						if(arr[i][j] > arr[x][y]){
							int t = arr[i][j];
							arr[i][j] = arr[x][y];
							arr[x][y] = t;
						}
					}
				}
			}
		}
		System.out.println("\nMATRIZ ASCENDENTE: ");
		for(int i=arr.length-1; i >= 0; i--){
			for(int j=arr[i].length-1; j >= 0; j--){
				System.out.print(arr[i][j]+"	");
			}
			System.out.println("");
		}
	}
	
	public void ordenar_descendente(int[][] arr){
		for(int i=0; i < arr.length; i++){
			for(int j=0; j < arr[i].length; j++){
				for(int x=0; x < arr.length; x++){
					for(int y=0; y < arr[x].length; y++){
						if(arr[i][j] > arr[x][y]){
							int t = arr[i][j];
							arr[i][j] = arr[x][y];
							arr[x][y] = t;
						}
					}
				}
			}
		}
		System.out.println("\nMATRIZ DESCENDENTE: ");
		for(int i=0; i < arr.length; i++){
			for(int j=0; j < arr[i].length; j++){
				System.out.print(arr[i][j]+"	");
			}
			System.out.println("");
		}
	}
}
