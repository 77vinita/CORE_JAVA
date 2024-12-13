package Abstraction;

interface Int1 {
	public void show();
}

interface Int2 {
	public void show();
}


public class Interface2 implements Int1, Int2 {

	public void show() {
		System.out.println("Hello World");
	}
		public static void main(String[] args) {
			Interface i2 = new Interface();
			i2.show();
		}
}
