////code to input info from the user and write it to the file 
//
//package FileConcept;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class UserDetails {
//
//	public void fileWrite() throws IOException 
//	{
//		FileOutputStream fout = new FileOutputStream("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\student.txt");
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter student id: ");
//		String s = sc.next();
//		String sN = s.concat("\n");
//		byte b[] = sN.getBytes();
//		fout.write(b);
//		
//		System.out.print("Enter student Gender: ");
//		String s4 = sc.next();
//		String s4N = s4.concat("\n");
//		byte b4[] = s4N.getBytes();
//		fout.write(b4);
//		
//		System.out.print("Enter student name: ");
//		String s1 = sc.next();
//		String s1N = s1.concat("\n");
//		byte b1[] = s1N.getBytes();
//		fout.write(b1);
//		
//		System.out.print("Enter student address: ");
//		String s2 = sc.next();
//		String s2N = s2.concat("\n");
//		byte b2[] = s2N.getBytes();
//		fout.write(b2);
//		
//		System.out.print("Enter student course: ");
//		String s3 = sc.next();
//		String s3N = s3.concat("\n");
//		byte b3[] = s3N.getBytes();
//		fout.write(b3);
//		
//		System.out.println("File written successfully........");
//	}
//	
//	public static void main(String[] args)
//	{
//		UserDetails u = new UserDetails();
//		try {
//			u.fileWrite();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}




package FileConcept;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UserDetails {

    public void fileWrite() {
        try (FileOutputStream fout = new FileOutputStream("C:\\Users\\Vinita Lacheta\\OneDrive\\Desktop\\student.txt");
             Scanner sc = new Scanner(System.in)) {

            String[] prompts = {
                "Enter student id: ",
                "Enter student Gender: ",
                "Enter student name: ",
                "Enter student address: ",
                "Enter student course: "
            };

            for (String prompt : prompts) {
                System.out.print(prompt);
                String input = sc.nextLine().trim(); // Use nextLine to capture spaces and trim input
                fout.write((input + System.lineSeparator()).getBytes(StandardCharsets.UTF_8)); // Write the input with a line separator
            }

            System.out.println("File written successfully........");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails();
        userDetails.fileWrite();
    }
}
