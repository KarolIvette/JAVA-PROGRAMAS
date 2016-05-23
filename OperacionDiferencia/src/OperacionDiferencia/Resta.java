package OperacionDiferencia;

public class Resta{
	int n;
	int operacion;

    public Resta(int n){
    	this.n = n;
    }
	
	public float get_n(){
		return n; 
	}
	
	public void set_num1(int n){
		this.n = n; 
	}
	
	public int operacion(){
		if(this.n<21){
			operacion = (Math.abs(this.n-21));
			return operacion;
		}
		else{
			operacion = ((this.n-21)*2);
			return operacion;
		}
	}
}
