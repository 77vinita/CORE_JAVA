package keyword;

public class FinalVariable {
	final int a =10; //must be assigned value ar the time of declaration
	int b=15;
	public void showData() {
		System.out.println("Value of a  is: "+a);
		System.out.println("Value of b is:"+b);
	}
	
	public void increment() {
		//a++;
		b++;
		System.out.println("Value of a after ++ is: "+a);
		System.out.println("Value of b after ++ is:"+b);
	}
	
	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		f.showData();
		f.increment();
	}
}
