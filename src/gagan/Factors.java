package gagan;
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  a number");
		int num = scan.nextInt();
		int count = 0;
		for(int i = 1;i<=num;i++) {
			if(num % i== 0) {
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("the factors of your number :"+count);

	}

}
