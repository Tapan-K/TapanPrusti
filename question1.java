package pattern01;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		
		for(int i=0;i<n;i++) {
			
			
			// I
			for(int j=0;j<n;j++) {
				
				if(j==0) {
					
			           System.out.print("*");
		            } 
		    	   else {
		    	     System.out.print(" ");
		               
				
			}
		}
			
			
			// N
			for(int j=0;j<n;j++) {
				
				if(j==0 || i==j || j==n-1)  {
					
					 System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
			}
			
			
			// for e
             for(int j=0;j<n;j++) { 
				
				if(i==0 && j<=n-1 || i==(n-1)/2 && j<=n-1 || i==n-1 && j<=n-1 || j==0)  {
					
					 System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
			}
             
             // for u
             
             for(int j=0;j<n;j++) { 
 				
 				if(j==0 && i<n-1 || j==n-1 && i<n-1 || i==n-1 && j>0 && j<n-1)  {
 					
 					 System.out.print("*");
 					
 				}else {
 					System.out.print(" ");
 				}
 			}
             
             // for R
             
             for(int j=0;j<n;j++) { 
  				
  				if(j==0 || i==0 && j<=n-1 || i==(n-1)/2&& j<=n-1 || j==n-1 && i<=(n-1)/2 || i-j==n/2)  {
  					
  					 System.out.print("*");
  					
  				}else {
  					System.out.print(" ");
  				}
  			}
             
             // for O
             
             for(int j=0;j<n;j++) { 
   				
   				if(i==0 && j>0 || i==n-1 && j<n-1 || j==0 || j==n-1)  {
   					
   					 System.out.print("*");
   					
   				}else {
   					System.out.print(" ");
   				}
   			}
             
             // for N
             
             for(int j=0;j<n;j++) { 
    				
    				if(j==0 || i==j || j==n-1)  {
    					
    					 System.out.print("*");
    					
    				}else {
    					System.out.print(" ");
    				}
    			}
             
             
             
             
			
			
			
			
			System.out.println();
		

	}

	}
}
