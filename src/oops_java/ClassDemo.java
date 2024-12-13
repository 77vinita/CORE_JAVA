package oops_java;
import java.util.Scanner;
public class ClassDemo {
	
	int eid;
	double salary;
	String name;
	String address;
	
	Scanner sc = new Scanner (System.in);
	
	public void getData() {
		System.out.print("Enter employee id: ");
		eid = sc.nextInt();
		
		System.out.println("Enter employyee salary: ");
		salary = sc.nextDouble();
		
		System.out.println("Enter employee name: ");
		name = sc.next();
		
		System.out.println("Enter address:");
		address = sc.next();
	}
	
	public void display() {
		System.out.println("Employee Details: ");
		System.out.println("Id: "+eid);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Address: "+address);
	}
	
	public static void main(String[] args) {
		ClassDemo cd = new ClassDemo();
		cd.getData();
		cd.display();
	}
	

}
