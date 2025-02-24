package gagan;
import java.util.*;
public class SumOfAllNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num =scan.nextInt();
        int sum = 0;
        while(num>0) {
        	int rem =num%10;
        	num=num/10;
        	sum=sum+rem;
        }
        System.out.println("The sum of All Numbers:"+sum);
	}

}
