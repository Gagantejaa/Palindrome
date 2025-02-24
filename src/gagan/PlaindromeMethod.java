package gagan;
import java.util.Scanner;

public class PlaindromeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int reverse = 0;
		int k = num;
		while(num > 0) {
			int rem = num%10;
			num = num/10;
			reverse = reverse*10+rem;
		}
		System.out.println("the revsere number is "+reverse);
		System.out.println("the orginal number is "+ k);
		if(k == reverse) {
			System.out.println("the number is palindrome "); 
		}
		else {
			System.out.println("the number is Not a palindrome "); 
		}
	}

}
