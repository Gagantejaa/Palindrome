package gagan;
import java.util.*;
public class SumofNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = scan.nextInt();
		int sum =(n*(n+1)/2);
//		int sum = 0;
//		for(int i=1;i<=n;i++) {
//			sum = sum+i;
//		}
		System.out.println("the sum of natural numbers is =" +sum);

	}

}
