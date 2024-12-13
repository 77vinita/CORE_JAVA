package ObjectClass;

public class objectClass {
	int a = 10;
	String s = "Asd" ;
	double p = 97.4;
	
	@Override
	public String toString() { //mostly used in bean classs
		return "objectClass [a=" + a + ", s=" + s + ", p=" + p + "]";
	}
	
	public static void main(String[] args ) {
		objectClass o = new objectClass();
		System.out.println(o.toString());
		System.out.println(o.getClass()); //return class name of 'o' object
		System.out.println(o.s.getClass()); //returns class name of the given object variable
		objectClass o2 = new objectClass();
		objectClass o3 = o;
		
		System.out.println("O : "+o.hashCode());
		System.out.println("O2 : "+o2.hashCode());
		System.out.println("O3 : "+o3.hashCode());
		
		System.out.println(o.equals(o3));
		System.out.println(o.equals(o2));
	}
}
