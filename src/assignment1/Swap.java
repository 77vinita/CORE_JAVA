package assignment1;
import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c, d, temp;
		
		System.out.print("Enter num1(C): ");
		c = sc.nextInt();
		
		System.out.print("Enter num2(D): ");
		d = sc.nextInt();
		
		System.out.println("Values of num1 and num2 before swapping is: "+c+" "+d+" respectively");
		
		temp = c;
		c = d;
		d = temp;
		System.out.println("Values of num1 and num2 after swapping is: "+c+" "+d+" respectively");
		
		sc.close();
	}

}
