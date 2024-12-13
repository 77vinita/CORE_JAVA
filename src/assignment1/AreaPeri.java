package assignment1;
import java.util.Scanner;
public class AreaPeri {
	public static void main(String[] args) {
		double length, breadth, radius;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length and breadth of rectangle: ");
		length = sc.nextDouble();
		breadth = sc.nextDouble();
		
		System.out.println("Arae of rectangle: "+(length*breadth));
		System.out.println("Perimeter of rectangle: "+(2*(length+breadth)));
		
		System.out.print("Enter radius of circle: ");
		radius = sc.nextDouble();
		
		System.out.println("Area of circle: "+(2*3.14*radius*radius));
		System.out.println("Circumference of circle: "+String.format("%.2f", (2*3.14*radius)));
		
		sc.close();
	}
}
