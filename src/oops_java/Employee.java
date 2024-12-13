package oops_java;
import java.util.Scanner;

public class Employee {
	int eid;
	String name;
	String address;
	String department;
	double basicSalary;
	int bonus;
	double totalSalary;
	
	public Employee () {
		bonus = 2000;
	}
	
	public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter eid: ");
		eid = sc.nextInt();
		System.out.print("Enter name: ");
		name = sc.next();
		System.out.print("Enter address: ");
		address = sc.next();
		System.out.print("Enter department: ");
		department = sc.next();
		System.out.print("Enter basic salary: ");
		basicSalary = sc.nextDouble();
		sc.close();
	}
	
	public void calSalary() {
		totalSalary = basicSalary + bonus;
	}
	
	public void displayData() {
		System.out.println("");
		System.out.println("Employee Details:");
		System.out.println("Id :"+eid);
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("Department :"+department);
		System.out.println("Total Salary :"+totalSalary);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.getData();
		e1.calSalary();
		e1.displayData();
		
	}
}
