package FiguraPiramide;

public class PIRAMIDE
{
		int tama�o;
		
		public int get_tama�o(){
			return this.tama�o; 
		}
		
		public void set_tama�o(int tama�o){
			this.tama�o=tama�o; 
		}
		
		
		public void dibujarombo ( int tama�o ) {
			for (int i = 0; i < tama�o; ++i) {
				System.out.println();
	            System.out.print(" ");
	           
	            for (int j = 0; j < tama�o-i-1; ++j){
	            	System.out.print(" ");           
	            }
	            
	            for (int j = 0; j < 2*i+1; ++j){
	            	if ((i==0)||(j==0)||(j==2*i)){
	                    System.out.print("*");
	                } else {
	                    	System.out.print(" ");
	                  }
	            }
	        }
	        
			System.out.println();
			
			for (int i = 1; i <= tama�o*2+1; i++) {
				//if ((i>1 && i<tama�o*2+1 ))
					//System.out.print( " " );
				//else
					System.out.print( "*" );
			}
	        System.out.println();
	    }
}
