package assignment1;
import java.util.Scanner;
public class Marks {
	public static void main(String[] args) {
		double m1, m2, m3, m4, m5, percentage, total;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks  scored in English: ");
		m1 = sc.nextDouble();
		
		System.out.println("Enter marks  scored in Biology: ");
		m2 = sc.nextDouble();
		
		System.out.println("Enter marks  scored in Physics: ");
		m3 = sc.nextDouble();
		
		System.out.println("Enter marks  scored in Chemistry: ");
		m4 = sc.nextDouble();
		
		System.out.println("Enter marks  scored in Mathematics: ");
		m5 = sc.nextDouble();
		
		total = m1+m2+m3+m4+m5;
		System.out.println("Total marks: "+total);
		
		percentage = (total)/500 * 100;
		System.out.println("Perecntage: "+percentage+"%");
		
		sc.close();
	}

}
