package Inheritance;

import java.util.Scanner;

class Parent {
	int a;
	Scanner sc = new Scanner(System.in);
	public void square() {
		System.out.println("Square is: "+a*a);
	}
	public void accept() {
		System.out.println("Enter a number: ");
		a = sc.nextInt();
	}
	
	
}
public class SingleInheritance extends Parent {
	public void cube() {
		accept();
		System.out.println("Cube: "+a*a*a);
	}
	
	public static void main(String[] args) {
	SingleInheritance s = new SingleInheritance();
	s.accept();
	s.square();
	s.cube();
	}
}
