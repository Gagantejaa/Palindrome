package gagan;
import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st Number :");
		int a = scan.nextInt();
		System.out.println("Enter the 2nd Number :");
		int b = scan.nextInt();
		System.out.println("Orginal values : a = "+ a + "b = "+b);
		 
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("Swapped  values : a = "+ a + "b = "+b);
		

		
	}

}
