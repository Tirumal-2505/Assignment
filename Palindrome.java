import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter a Number: ");
		 Scanner s = new Scanner(System.in);
		  n= s.nextInt();
		  int copyofN=n;
		  int rev=0;
		  while(n!=0) {
			  rev=rev*10+n%10;   //Initial rev value is 0 as per line 11.
			  n=n/10;
		  }if(rev==copyofN) {
			  System.out.println("number is palindrome");
		  }else {
			  System.out.println("number is not a palindrome");
		  }

	}

}
