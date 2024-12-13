package FileConcept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public void copyFile() throws IOException
	{
		FileInputStream fin = new FileInputStream("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\Java Notes.txt");
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\a.txt");
		
		int ch;
		while((ch = fin.read()) != -1)
		{
			fout.write(ch);
		}
		System.out.println("File Copied Successfully..........");
		fin.close();
		fout.close(); //recommended to free the space allocated to the objects at the end
	}
	
	public static void main(String[] args)
	{
		FileCopy f = new FileCopy();
		
		try {
			f.copyFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
