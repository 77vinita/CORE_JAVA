package Collections;

public class Student implements Comparable<Student> 
{
	int rollno;
	String name;
	int age;
	int marks;
	public Student(int rollno, String name, int age, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
//	public int compareTo(Student o)
//	{
//	 return Integer.compare(this.age, o.age);	
//	}
//	
	
	public int compareTo(Student o)
	{
	 return this.name.compareTo(o.name);	
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}
