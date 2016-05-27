package ValoresSuma;

import javax.swing.JOptionPane;

public class Suma {
	String a, b, c, d;
	
	private int[]num=new int [5];

	public Suma(String a,String b,String c,String d)
	 {
		 num[0]=Integer.parseInt(a);
		 num[1]=Integer.parseInt(b);
		 num[2]=Integer.parseInt(c);
		 num[3]=Integer.parseInt(d);
	 }
	 
	 public void diferencia_numeros()
	 {
		 int d=0, nv=0;
		 while(d<num.length)
		 {
			 nv=0;
			 for(int i=d+1; i<num.length; i++)
			 {
				 if(num[d]==num[i])
				 {
					 nv=1;
					 num[i]=0;
				 }
			 }
			 if(nv==1)
				 num[d]=0;
			 d++;
		 }
	 }
	 
	 public int suma()
	 {
		 int s=0;
		 for(int i=0;i<num.length; i++)
		 {
			 if(num[i]!=0)
				 s+=num[i];
		 }
		 return s;
	 }
	
/*
	public int get_A(){
		return this.a; 
	}
	
	public void set_A(int a){
		this.a =  a; 
	}
	
	public int get_B(){
		return this.a; 
	}
	
	public void set_B(int b){
		this.b =  b; 
	}
	
	public int get_C(){
		return this.c; 
	}
	
	public void set_C(int c){
		this.c =  c; 
	}
	
	public int get_D(){
		return this.a; 
	}
	
	public void set_D(int d){
		this.d =  d; 
	}
*/
	 
}
