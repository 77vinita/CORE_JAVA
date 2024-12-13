package week2;

public class Methods {

	public void method() {
		System.out.println("Method with no arg and no return values");
	}
	
	public void square(int x) {
		System.out.println("Square: "+(x*x));
	}
	
	public String greeting() {
		return "Hello Java";
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Methods m = new Methods();
		m.method();
		m.square(7);
		System.out.println(m.greeting());
		int a = m.add(5, 9);
		System.out.println("Sum: "+a);
	}
}
