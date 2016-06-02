package Parcial1_Ejercicio1;

public class TablaMultiplicar {
	int n;
	
	public TablaMultiplicar(int n){
		this.n = n;
	}
	
	public int get_n(){
		return n; 
	}
	
	public void set_n(int n){
		this.n =  n ; 
	}
	
	public void tabla(int n){
		int mul=0;
		for(int x=1; x<=n; x++){
		for(int i=1; i<=n; i++){
			mul= i*x;
			System.out.println(mul);
		}
		x++;
		}
	}

}
