package gagan;

import java.util.Scanner;

public class PrimeNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = scan.nextInt();
		System.out.println("Enter a number ");
		int b = scan.nextInt();
		for (int num = a; num <= b; num++) {
			int fact = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					fact++;
				}
			}
			if (fact == 2) {
				System.out.println(num);
			}
		}

	}
}
  // printing prime numbers btw given numbers 
