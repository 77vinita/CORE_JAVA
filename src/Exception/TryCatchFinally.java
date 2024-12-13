package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = 1.0;
		try {
		System.out.print("Enter num1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter num2: ");
		int n2 = sc.nextInt();
		 d = n1/n2;
		}
//		catch(InputMismatchException e) {
//			System.out.println(e);
//		}
//		catch(ArithmeticException e1) {
//			// System.out.println(e1);
//			e1.printStackTrace();
//		}
		
		//OR
		
		catch(InputMismatchException | ArithmeticException e) {
			System.out.println(e);
		} 
		
		finally {
		System.out.print("Division is :"+d);

		}
		sc.close();
		
	}
}

//HW handle null pointer exception and various other exceptions using the try catch block
