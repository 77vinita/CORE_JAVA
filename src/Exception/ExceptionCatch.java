/*
No, after an exception occurs in the try block, the rest of the code in that 
try block is not executed. The control immediately jumps to the corresponding
 catch block that handles the exception. Once the exception is caught and handled, 
 the program continues execution after the try-catch-finally block*/

package Exception;

public class ExceptionCatch {

		public static void main(String[] args) {
			
			try {
				int[] a = {1,2,3,4};
				System.out.println(a[5]); // Throws ArrayIndexOutOfBound Exception
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Array index out of bounds");
			}
			
			try {
				int div = 10/0; //Throws ArithmeticException
				int mod = 10%0;//Throws ArithmeticException
			}
			catch(ArithmeticException e1) {
				System.out.println("Cannot divide by zero");
			}
			
			try {
				String s = null; //s is not initialized its set to null
				System.out.println(s.length()); //Throws NullPointerException
				System.out.println(s.toUpperCase()); //Throws NullPointerException
			}
			catch(NullPointerException e3) {
				System.out.println("Null value encountered");
			}


			finally {
				System.out.println("This block is always executed");
			}
		}
}
