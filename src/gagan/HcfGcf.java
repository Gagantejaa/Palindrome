package gagan;
import java.util.*;
public class HcfGcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = scan.nextInt();
		System.out.println("Enter 2nd number");
		int b = scan.nextInt();
		while (true) {
			if(b%a == 0) {
				System.out.println("gcd"+a);
				break;
			}
			int temp = b ;
			b = a ;
			a = temp%a;
			
		}

	}

}
