package FileConcept;
import java.io.File;
public class File1 {

	public static void main(String[] args) {
	File f = new File("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\DMDS_practice.R");
	
	System.out.println(f.getName());
	System.out.println(f.getParent());
	System.out.println(f.isDirectory());
	System.out.println(f.isFile());
	System.out.println(f.canRead());
	System.out.println(f.canWrite());
	System.out.println(f.length());
	}
}
