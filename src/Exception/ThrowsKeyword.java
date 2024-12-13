package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword
{

	void read() throws FileNotFoundException{
		FileInputStream fin = new FileInputStream("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\DMDS_practice.R");
		System.out.println("File found");
	}
	
	void write() {
		System.out.println("File written successfully");
	}
	public static void main(String[] args) 
	{
		ThrowsKeyword t = new ThrowsKeyword();
		try {
			
			t.read();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

//HW checked vs unchecked 
//throw vs throws
