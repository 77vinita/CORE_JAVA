package Collections;
import java.util.*;

public class MapInterface
{
	public static void main(String[] args)
	{
		Map<Integer, Integer> m = new HashMap<Integer,Integer>();
		m.put(1, 101);
		m.put(2,202);
		m.put(3,303);
		m.put(4,404);
		
		System.out.println("Map 1 is: "+m );
//		
//		m.put(4, 505);
//		System.out.println(m);
//		m.putIfAbsent(5, 505);
//		System.out.println(m);
//		System.out.println(m.containsKey(5));
//		System.out.println(m.containsValue(505));
//		System.out.println(m.isEmpty());
//		m.size();
//		m.get(4);
//		m.remove(5);
//		System.out.println(m);
//		m.remove(3,404);
//		
//		m.replace(4, 444);
//		System.out.println(m);
//		m.replace(1, 101, 111);
//		System.out.println(m);
		
		Map<Integer,Integer> lm = new LinkedHashMap<Integer,Integer>();
		lm.put(11, 110);
		lm.put(22,220);
		lm.put(33, 300);
		lm.put(44, 300);
		System.out.println("Map m2: "+lm);
//		
//		System.out.println("Key value pairs of map in set format: "+lm.entrySet());
//		System.out.println("Keys of map m2: "+lm.keySet());
//		System.out.println("Values of map m2: "+lm.values());
		lm.putAll(m);
//		System.out.println(lm);
//		lm.clear();
//		System.out.println(lm);
		
		Iterator<Map.Entry<Integer, Integer>> map = lm.entrySet().iterator();
		while(map.hasNext())
		{
			System.out.println(map.next());
		}
			
	}
}
