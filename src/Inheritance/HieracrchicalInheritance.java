package Inheritance;

import java.util.Scanner;

class ParentMult{
	int a, b;
	Scanner sc = new Scanner(System.in);
}

class AreaCircle extends ParentMult{
	public void cal() {
		System.out.println("Enter raius of circle: ");
		a = sc.nextInt();
		
		System.out.println("Area: "+(3.14*(a*a)));
	}
}

class AreaTriangle extends ParentMult{
	public void cal() {
		System.out.println("Enter base and height of triangle: ");
		a = sc.nextInt();
		b= sc.nextInt();
		
		System.out.println("Area: "+(0.5*(a*b)));
	}
	
}

public class HieracrchicalInheritance {
	public static void main(String[] args) {
		AreaCircle c = new AreaCircle();
		c.cal();
		
		AreaTriangle t = new AreaTriangle();
		t.cal();
	}
}
