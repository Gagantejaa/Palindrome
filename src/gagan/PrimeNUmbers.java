package gagan;
import java.util.*;
public class PrimeNUmbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		int fact = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				fact ++;
			}
		}
		if(fact == 2) {
			System.out.println("the number is prime number");
		}
		else {
			 System.out.println("the number is composite number");
		}

	}

}
