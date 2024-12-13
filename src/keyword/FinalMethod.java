package keyword;


class Demo {
	public void nonFinal() {
		System.out.println("This is Parent Class");
	}
	
	public final void Final() {
		System.out.println("This is final method");
	}
	
}
public class FinalMethod extends Demo {
	public void nonFinal() {
		System.out.println("Inside FinalMethod class");
	}
	
	public static void main(String[] args) {
		FinalMethod m = new FinalMethod();
		m.nonFinal();
		m.Final();
	}
}


