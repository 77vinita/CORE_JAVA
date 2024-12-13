package Collections;
import java.util.*;

public class Basics 
{

	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<Integer> ();
		
		//add elements to the list
		l.add(12);
		l.add(23);
		l.add(35);
		l.add(47);
		System.out.println("Array List is : "+l);
//		
//		l.add(0,5);
//		System.out.println("List after adding element at 0th index: "+l);
//		
//		l.addFirst(4);
//		System.out.println("List after adding element at first place: "+l);
//		
//		l.addLast(58);
//		System.out.println("List after adding element at last place: "+l);
//		
//		System.out.println("List contains 52: "+l.contains(52));
//		System.out.println("List contains 23: "+l.contains(23));
//		
//		System.out.println("Size of the list is: "+l.size());
//		System.out.println("List is empty: "+l.isEmpty());
//		System.out.println("Hash code: "+l.hashCode());
//		//A hash code in Java is a unique number that represents an object, helping to quickly find it in collections like `HashMap`.
//		
//		System.out.println("Element 23 is stored at index: "+l.indexOf(23));
//		System.out.println("Element stored at index 2 is: "+l.get(2));
//		
//		System.out.println("We are replacing 23 with 24: "+l.set(3, 24));
//		System.out.println("List after replacing 23 with 24 is: "+l);
//		l.getFirst();
		
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(12);
		ll.add(25);
		ll.add(47);
		ll.add(46);
		ll.add(26);
		System.out.println("Linked List : "+ll);
//		
//		ll.getFirst();
//		ll.getLast();
//		ll.addAll(l); //adds all elements of l to ll
//		System.out.println(ll);
//		
//		ll.removeAll(l); //removes all elements common in l and ll;
//		System.out.println(ll);
//		
//		ll.retainAll(l); //only keeps the elements common in ll and l and removes  the rest
//		System.out.println(ll);
//		
//		Iterator<Integer> it = ll.listIterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println("Vector: "+v);
	}
}
