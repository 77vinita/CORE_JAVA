package ObjectClass;

public class WrapperClass {

	public static void main(String[] args) {
		int a = 20;
		Integer x = 10;
		
		System.out.println("Value of a :"+a);
		System.out.println("Value of x :"+x);
		
		x = a; //autoboxing: primitive to non primitive
		System.out.println("Value of x after swapping: "+x);
		
		x = a; //unboxing: non primitive to primitve
		System.out.println("Value of a after swapping: "+a);
		
		System.out.println(x.doubleValue());
		
	}
}
