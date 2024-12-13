package FileConcept;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamFileReadWriteAppend {

	
	public void readFile() throws IOException
	{
		
		FileReader fr = new FileReader("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\Java Notes.txt");
		int ch;
		while((ch=fr.read()) != -1)
		{
			System.out.print((char)ch);
		}
		
	}
	
	public void writeFile() throws IOException
	{
		
//		FileWriter fw = new FileWriter("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\a.txt");
// above syntax is for only writing to the file 
		//to append content to the already present file 
		FileWriter fw = new FileWriter("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\a.txt", true);
		fw.write(" Demostrating Append Operation");
		fw.flush(); //must be written every time we write using the char stream
		System.out.println("File created successfully....");
	}
	
	public static void main(String[] args)
	{
		CharStreamFileReadWriteAppend c = new CharStreamFileReadWriteAppend();
		try
		{
			c.readFile();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			c.writeFile();
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
	}
}
