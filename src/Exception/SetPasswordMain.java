package Exception;
import java.util.Scanner;

public class SetPasswordMain {
	public static void main(String[] args) throws SetPasswordException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password: ");
		String pass = sc.nextLine();
		
		if(pass.length() > 8) {
			System.out.println("Password set successfully !!");
		}
		else {
			throw new SetPasswordException("Passowrd must be 8 char long !!");
			
		}
		System.out.println("Rest of the code");
	}
}
