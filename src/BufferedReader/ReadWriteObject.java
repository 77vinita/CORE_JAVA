package BufferedReader;
import java.io.*;

public class ReadWriteObject
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{	
		//Serialisation object to byte
		UserObjectIOStream u = new UserObjectIOStream();
		u.setUid(102);
		u.setUnmae("Eva");
		u.setPassword("eva123");
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\a.txt");
		ObjectOutputStream o = new ObjectOutputStream(fout);
		o.writeObject(u);
		System.out.println("File written successfully...........");
		
		
		//Deserialisation byte to object
		FileInputStream fin = new FileInputStream("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\a.txt");
		ObjectInputStream o2 = new ObjectInputStream(fin);
		UserObjectIOStream u1 = (UserObjectIOStream)o2.readObject(); //object typecasting
		System.out.println(u.getUid());
		System.out.println(u.getUnmae());
		System.out.println(u.getPassword());
		
		
		
	}
	
}
