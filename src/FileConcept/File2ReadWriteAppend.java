package FileConcept;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File2ReadWriteAppend
{
	public void fileRead() throws IOException {
		FileInputStream fread = new FileInputStream("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\Java Notes.txt");
		int ch;
		while((ch=fread.read()) != -1) {
			System.out.print((char)ch);
		}
	}
	
	public void fileWrite() throws IOException {
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\a.txt");
		String s = "Good morning";
		byte[] b = s.getBytes();
		fo.write(b);//writes to the file over-writing the content already present in it 
		
		FileOutputStream fileAppend = new FileOutputStream("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\a.txt",true);
		//this will append the given content to the file
		String s2 = "Java Programming";
		byte b2[] = s2.getBytes();
		fileAppend.write(b2); 
		System.out.println("File written successfully");
	}
	
	public static void main(String[] args) {
		
		File2ReadWriteAppend f = new File2ReadWriteAppend();
		try 
		{
			f.fileRead();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			f.fileWrite();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		}
	}

