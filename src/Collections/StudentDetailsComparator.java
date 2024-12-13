package Collections;

import java.util.Comparator;

public class StudentDetailsComparator {
	int rollno;
	String name;
	int age;
	int marks;
	public StudentDetailsComparator(int rollno, String name, int age, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentDetailsComparator [rollno=" + rollno + ", name=" + name + ", age=" + age + ", marks=" + marks
				+ "]";
	}
}

class SortByAge implements Comparator<StudentDetailsComparator>
{
	public int compare(StudentDetailsComparator o1, StudentDetailsComparator o2)
	{
		if(o1.age == o2.age)
		{
			return 0;
		}
		else if(o1.age > o2.age)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}

class SortByAge2 implements Comparator<StudentDetailsComparator>
{
	public int compare(StudentDetailsComparator o1, StudentDetailsComparator o2)
	{
		if(o1.age == o2.age)
		{
			return 0;
		}
		else if(o1.age > o2.age)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}