package keyword;

public class StaticVariable {
	int rno;
	String name;
	static String course = "JAVA";
	
	public StaticVariable(int rno, String name) {
		this.rno=rno;
		this.name=name;
	}
	static {
		System.out.println("static block");
	}
	public void showData() {
		System.out.println("Roll No."+rno);
		System.out.println("Name:"+name);
		System.out.println("Course:"+course);
	}
	
	public static void main(String[] args) {
		StaticVariable s = new StaticVariable(101,"Rishi");
		s.showData();
		course="PYTHON";
		s.showData();
		
	}
}
