package assignment1;
import java.util.Scanner;

public class DistanceConversion {
	public static void main(String[] args) {
		double distance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in kilometer: ");
		distance = sc.nextDouble();
		
		System.out.println("Distance in meters: "+(distance*1000)+"meters");
		System.out.println("Distance in feet: "+(distance*3280.84)+"feet");
		System.out.println("Distance in inches: "+(distance*39370.1)+"inches");
		System.out.println("Distance in centimeter: "+(distance*1000*100)+"centimeter");
		
		sc.close();
	}
}
