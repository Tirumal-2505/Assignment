import java.util.Scanner;

public class Staircase_stars {

	public static void main(String[] args) {
		int N;
		
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in);
		N= s.nextInt();
		 
		for(int i=1;i<=N;i++) {     //outer "for loop" - no of columns
			for (int j=1;j<=i;j++) {   // inner "for loop" - no of SPACES
				System.out.print(" ");
			}
			for (int k=N;k>=i;k--){                  //2ND INNER LOOP - NO OF STARS
				System.out.print("* ");
		}
		System.out.println();

	}

}
}