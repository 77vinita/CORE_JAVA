package assignment1;
import java.util.Scanner;
public class TempConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tempF, tempC;
		System.out.print("Wnter temperature in Farenheit degrees: ");
		tempF = sc.nextDouble();
		
		tempC = 5*(tempF-32)/9;
		System.out.println("Temperature in degree celcius: "+tempC);
		
		sc.close();
	}
}
