package assignment1;
import java.util.Scanner;
public class ProfitLoss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sp,cp;
		System.out.print("Enter selling price of 1 notebook:");
		sp = sc.nextDouble();
		
		System.out.print("Enter cost price of 1 notebook: ");
		cp = sc.nextDouble();
		
		if(sp>cp) {
			double profit = sp - cp;
			System.out.println("Profit made on selling one notebook is: "+profit);
		}	else {
				double loss = cp - sp;
				System.out.println("Loss incred on selling 1 notebook: "+loss);
		}
		sc.close();
	}

}
