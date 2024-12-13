package Inheritance;

class Parent4 {
	int a = 10;
	public Parent4() {
		System.out.println("This is parent class constrcutor");
	}
	
	public void show() {
		System.out.println("Value of a in parent class"+a);
	}
}
public class SuperKeyword extends Parent4 {
	int a = 20;
	public SuperKeyword() {
		System.out.println("This is child class constructor");
	}
	
	public void show() {
		super.show();
		System.out.println("Value of a in child class: "+a);
		System.out.println("Value of a in parent class using super keyword: "+super.a);
	}
	
	public static void main(String[] args) {
		
		SuperKeyword s = new SuperKeyword();
		s.show();
	}
}
