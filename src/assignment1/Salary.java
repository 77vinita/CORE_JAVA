package assignment1;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		double bsalary, dallowance, hrallowance, grossSalary;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter basic salary of Ramesh: ");
		bsalary = sc.nextDouble();
		dallowance = (0.4*bsalary);
		hrallowance = (0.2*bsalary);
		
		grossSalary = bsalary + dallowance + hrallowance;
		System.out.println("Gross Salary: "+grossSalary);
		sc.close();
	}
}
