import java.util.*;
public class Strings {

	public static void main(String[] args) {
		int k,a=1,b=1;
		k=0;
		int num;
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in);
		num= s.nextInt();
		System.out.println("1 1");
		while(k<num) {
			k=a+b;
			System.out.println(k+ " ");
			a=b;
			b=k;
		}

	}

}
