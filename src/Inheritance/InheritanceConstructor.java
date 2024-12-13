package Inheritance;

class Parent3 {
	
	public Parent3() {
		System.out.println("This is parent constructor");
	}
}

public class InheritanceConstructor extends Parent3 {
	public InheritanceConstructor() {
		super();//without this too the parent constructor will be called/invokde by default 
		System.out.println("This is child Constructor");
	}
	
	public static void main(String[] args) {
		
		InheritanceConstructor i = new InheritanceConstructor();
	}
}
