package Inheritance;

class ParentClass {
	int a = 10;
}

class Child1 extends Parent{
	int b = 20;
	void sum() {
		System.out.println("Sum is: "+(a+b));
	}
}

public class MultilevelInheritance extends Child1 {
	int c = 30;
	void mult() {
		System.out.println("Product is:"+(a*b*c));
	}
	
	public static void main(String[] args) {
		MultilevelInheritance m = new MultilevelInheritance();
		m.sum();
		m.mult();
	}
}
