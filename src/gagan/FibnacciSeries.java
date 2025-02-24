package gagan;
import java.util.*;
public class FibnacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0; int b=1 ;int sum = 0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number ");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(a +" ");
			sum=a+b;
			a=b;
			b=sum;
		}

	}

}
