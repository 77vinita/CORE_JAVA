package keyword;

class ParentClass {
	public void show() {
		System.out.println("Final Class");
	}
}

//final class can extend another class 
//cannot extend ParentClass since its a final Class
final public class FinalClass extends ParentClass{
	public static void main(String[] args) {
		ParentClass p = new ParentClass();
		p.show();
	} 
}
