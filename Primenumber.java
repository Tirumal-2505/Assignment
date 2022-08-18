import java.util.*;
public class Primenumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	     
		int i = s.nextInt();

		int count=0;
		int j;
	     for(i=1;i<=100;i++) {
	    	 for ( j=1;j<=i;j++){
	    		count=0; 
	    	 if (i%j==0){
	    		 count++;
	    	 }
	    	 }
	     }if (count==2) {
			System.out.println(i);
		}
	     //else {
			//System.out.println("N is not a prime number");
		//}
	}

}
