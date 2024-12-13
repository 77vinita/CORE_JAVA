package Abstraction;

abstract class Demo {
	int a= 20;
	
	public void display() {
		System.out.println("Value of a is "+a);
	}
	 public abstract void show();
}

public class Abstract1 extends Demo {

	public static void main(String[] args) {
		Abstract1 a = new Abstract1();
		a.show();
		a.display();
	}
	
	public void  show() {
		System.out.println("This is abstarct method");
	}
}
