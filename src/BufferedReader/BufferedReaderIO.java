package BufferedReader;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedReaderIO 
{
	public static void main(String[] args)  throws Exception
	{
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		System.out.println("Enter a number:");
		String n1 = br.readLine();
		
		System.out.println("Enter number 2:");
		String n2 = br.readLine();
		
		System.out.println(n1+n2);
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		System.out.print(num1+num2);
	}

}
