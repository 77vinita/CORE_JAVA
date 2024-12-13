package assignment1;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any integer number: ");
		a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a+" is an even number");
		}	else {
				System.out.println(a+" is an odd number");
		}
		sc.close();
	}

}
