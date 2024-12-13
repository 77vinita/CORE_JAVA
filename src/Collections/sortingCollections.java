package Collections;
import java.util.*;
public class sortingCollections {

	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(5);
		l.add(9);
		l.add(7);
		l.add(2);
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println(l);
		
		Iterator<Integer> it = l.iterator();
		while(it.hasNext())
		{
			
		}
}
	
	
}
