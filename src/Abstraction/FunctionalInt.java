package Abstraction;

@FunctionalInterface
interface Int3 {
	public void showMsg();
}

public class FunctionalInt {
	public void showMsg() {
		
		System.out.println("This is functional inteface method");
	}
	public static void main(String[] args) {
		FunctionalInt i4 = new FunctionalInt();
		i4.showMsg();
	}
}
