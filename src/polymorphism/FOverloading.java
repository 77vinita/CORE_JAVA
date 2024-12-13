package polymorphism;

public class FOverloading {
	public FOverloading() {
		System.out.println("Default Constructor");
	}
	
	public FOverloading( String msg) {
		System.out.println("Parameterized Constructor");
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		FOverloading c1 = new FOverloading();
		FOverloading c2 = new FOverloading("Hello World");
	}

}
