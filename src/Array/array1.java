package Array;

import java.util.Scanner;

public class array1 {
	// take an array as input from user search for given number x and print the
	// index at which it occurs
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();

		int[] marks = new int[size];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < size; i++) {
			marks[i] = sc.nextInt();
		}
		System.out.print("Array elements are: [");
		for (int i = 0; i < size; i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.print("]");

		System.out.print("\nEnter number to be searched in the array: ");
		int x = sc.nextInt();

		for (int i = 0; i < marks.length; i++) {
			if (x == marks[i]) {
				System.out.println("X found at index: " + i);
				break;
			}
		}
		sc.close();

	}
}
