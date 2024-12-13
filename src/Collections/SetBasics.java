package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetBasics 
{
	public static void main(String[] args)
	{
//		Set<String> s = new HashSet<String>();
//		s.add("abc");
//		s.add("def");
//		s.add("ghi");
//		s.add("jkl");
//		s.add("aaa");
//		System.out.println("Set is: "+s);
//		
//		s.add("abc");//no error but duplicate element won't be stored in the set
//		System.out.println("After adding duplicate element: "+s);
//		
//		System.out.println("Set contains abc: "+s.contains("abc"));
//		System.out.println("Size of set: "+s.size());
//		System.out.println("Set hashcode: "+s.hashCode());
//		System.out.println("Is the set empty: "+s.isEmpty());
//		s.remove("def");
//		System.out.println("Set after removing def: "+s);
//		s.clear();//removes all elements from the set
//		
		Set<String> s1 = new HashSet<String>();
//		s1.add("aaa");
//		s1.add("bbb");
//		s1.add("ccc");
//		s1.add("ddd");
//		System.out.println("Set s1 is: "+s1);
//		
//		s.addAll(s1);//adds all elements of set s to set s1;
//		System.out.println("Set s after adding all elements of set s1 to it: "+s);
		
//		s.retainAll(s1); //removes all uncommon elements between s and s1 and only gives the common elements as output
//		System.out.println("Intersection of s and s1 i.e elements common in s and s1"+s);
//		
//		s.removeAll(s1);//removes all elements from set s that are also present in set s1
//		System.out.println("Set s after removing the common elements: "+s);

		Set<Integer> hs = new LinkedHashSet<Integer>();
		//it maintains order of insertion
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		System.out.println("Linked Hash Set: "+hs);
		
		Iterator<Integer> i  = hs.iterator();
		System.out.println("Using iterator");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//or alternative to iterate the set only when no null value is present in it 
		System.out.println("Using for loop:");
		for(Integer a : hs)
		{
			System.out.println(a);
		}
		
		
	}
}
