package String;
import java.util.Scanner;

public class StirngTrimmethod 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String[] list = s.split(",");
		for(String ls : list) {
			String trimedItem = ls.trim();
			if(trimedItem.contains("ab") && trimedItem.length() > 4 ) {
				System.out.print(trimedItem);
			}
		}
		
		sc.close();
	
	}
}
