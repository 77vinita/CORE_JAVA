package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentList {

	public static void main(String[] args)
	{
//		List<Student> slist = new ArrayList<>();
//		Student s1 = new Student(101,"Abc",12,89);
//		slist.add(s1);
//		slist.add(new Student(102,"xyz",11,86));
//		slist.add(new Student(103,"abc",20,78));
//		slist.add(new Student(104,"pqr",9,56));
//		slist.add(new Student(105,"fgh",7,72));
//		slist.add(new Student(106,"uvw",12,56));
//		
//		System.out.println(slist);
//		Collections.sort(slist);

		List<StudentDetailsComparator> slist = new ArrayList<>();
		StudentDetailsComparator s1 = new StudentDetailsComparator(101,"Abc",12,89);
		slist.add(s1);
		slist.add(new StudentDetailsComparator(102,"xyz",11,86));
		slist.add(new StudentDetailsComparator(103,"abc",20,78));
		slist.add(new StudentDetailsComparator(104,"pqr",9,56));
		slist.add(new StudentDetailsComparator(105,"fgh",7,72));
		slist.add(new StudentDetailsComparator(106,"uvw",12,56));
		
		Collections.sort(slist, new SortByAge2());
		
		Iterator<StudentDetailsComparator> s = slist.iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
	}
}
