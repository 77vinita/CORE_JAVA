package mypackage1;

import java.util.Scanner;
public class Operators {
	public static void main(String[] args) 
	{
		int  num;
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter a number: ");
//		num = sc.nextInt();
		
		
//		ans = num1+num2;
//		
//	System.out.println("Addition is: "+ans);
//	
//	System.out.println("Difference is: "+(num1-num2));
//	
//	System.out.println("Product is: "+(num1*num2));
//	
//	System.out.println("Division is: "+(num1/num2));
//	
//	System.out.println("Remainder is: "+(num1%num2));
//  System.out.println("Original value of num1: "+num1);
//  num1++;
//  System.out.println("Value of num1 after incrementing: "+num1);
//  num2--;
//  System.out.println("Original Value of num2: "+num2);
//  System.out.println("Value of num2 after decrementing");
		
		//ternary operator
//		System.out.println((num1==num2)?"equal":"nit equal");
		
		//assignment operator
//		
//		num1+=num2;
//		System.out.println("Value of num1 after adding num2 to it: "+num1);
//		num1-=num2;
//		System.out.println("Value of num1 after subtracting num2 from it: "+num1);
//		num1*=num2;
//		System.out.println("Value of num1 after multiplying num2 to it: "+num1);
		
//		if(age>=18) {
//			System.out.println("Elgible");
//		}
//		else {
//			
//			System.out.println("Not Elgible");
//		}
		
//		
//		if(age<0 || age>150) {
//			
//			System.out.println("Invalid Age...");
//		}
//		else if(age>=18) {
//			System.out.println("Elgible");
//		}
//		else {			
//		System.out.println("Not Elgible");
//		}
		
//		
//		
//		switch(num) {
//		case 1: System.out.println("ONE");
//				break;
//		case 2: System.out.println("TWO");
//		break;
//		case 3: System.out.println("THREE");
//		break;	
//		case 4: System.out.println("FOUR");
//		break;
//		case 5: System.out.println("FIVE");
//		break;
//		case 6: System.out.println("SIX");
//		break;
//		case 7: System.out.println("SEVEN");
//		break;
//		case 8: System.out.println("EIGHT");
//		break;
//		case 9: System.out.println("NINE");
//		break;
//		
//		default:System.out.println("Number out of range");
//		
//		}
		
		
		System.out.println("Enter an alphabet: ");
		char ch = sc.next().charAt(0);
		
		
//		switch(ch) {
//		
//		case 'a':
//		case 'A':
//		case 'e':
//		case 'E':
//		case 'i':
//		case 'I':
//		case 'o':
//		case 'O':
//		case 'u':
//		case 'U': System.out.println("It is a vowel");
//					break;
//		default:if(ch>'A' || ch<'z') {
//			System.out.println("It is a consonant");
//		}	else if(ch>0 || ch<9) {
//			System.out.println("It is a digit(0-9)");
//			}  else {
//				System.out.println("It is a special character");
//			}
//		}
		
//		
//		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
//		{
//			switch(ch) {		
//			case 'a':
//			case 'A':
//			case 'e':
//			case 'E':
//			case 'i':
//			case 'I':
//			case 'o':
//			case 'O':
//			case 'u':
//			case 'U': System.out.println("It is a vowel"); break;
//			default:System.out.println("consonant");
//			}
//		
//		}
//		else
//		{
//			System.out.println("it is digit or special symbol");
//			
//		}
		
		
		if(ch>='A' && ch<='Z') {
			System.out.println("Uppercase Alphabet");
		}	else if(ch>='a' && ch<='z') {
			System.out.println("Lowercase Alphabet");
		}	else if(ch>='0' && ch<='9') {
			System.out.println("Digit");
		}	else {
			System.out.println("Special Character");
		}
		
		
						
	}	
}
