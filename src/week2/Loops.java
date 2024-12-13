package week2;

public class Loops {
	public static void main(String[] args) {
		int i;
		for(i=50;i>=1;i--) {
			System.out.println("Value of i is: "+i);
		}
		
		for(i=1;i<=10;i++) {
			System.out.println("Puneri Pattern");
		}
		
		for(i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		int num=1;
		while(num<=10) {
			if(num%2!=0) {
			System.out.println(num);
			}
			num++;
		}
	}
}
