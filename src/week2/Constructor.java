package week2;

public class Constructor {
	int a;
	String b;
	double d;
	public Constructor() {
		System.out.println("This is a default Constructor");
	}
	
	public static void main(String[] args) {
		Constructor c = new Constructor();
		System.out.println(c.a+" "+c.b+" "+c.d);
	}
	
}
