package Exception;

import java.util.Scanner;

class InsufficientBalance extends Exception {
	public InsufficientBalance(String msg) {
		super(msg);
	}
}

public class WithdrawAmount {
	
	void withdraw() throws InsufficientBalance {
		int amt=500;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn: ");
		int withdraw = sc.nextInt();
		
		if(amt>=withdraw) {
			System.out.println("Amount withdrawn successfully.....");
		}
	else {
		throw new InsufficientBalance("Balance not enough to be withdrawn");
	}
		sc.close();
	}
	
	public static void main(String[] args) {
		WithdrawAmount w = new WithdrawAmount();
		try {
			w.withdraw();
		}
		catch (InsufficientBalance e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Thank you for visiting..........");
		}
	}
	
	

}
