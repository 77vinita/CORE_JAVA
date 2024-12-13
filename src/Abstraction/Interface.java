package Abstraction;

interface IntDemo {
	int a = 10; //final,static,public variable
	void show(); //abstract method
	default void msg1() {
		msg2();
		System.out.println("Default message of Interface");
	}
	private void msg2() {
		System.out.println("Private method of Interface");
	}
}

public class Interface implements IntDemo {
	 public void show() {
		 System.out.println("Abstract method of the Interface");
	 }
	public static void main(String[] args) {
		 Interface i = new Interface();
		 i.show();
		 i.msg1();//default method with implementation in interface
		// i.msg2();
		 //msg2() being a private method is not accessible outside its block i.e outside the interface hence it is invoked indirectly using the default method
	}
	
}

