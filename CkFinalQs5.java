package CKQs5;

public class CkQs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=12;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 || i==n-1 || i+j<=(n-1)/2 || i-j>=(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
