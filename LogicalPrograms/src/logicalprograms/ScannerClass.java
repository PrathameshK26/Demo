package logicalprograms;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int a = sc.nextInt();
		System.out.println("Enter Number 2");
		int b = sc.nextInt();
		System.out.println("Enter Number 3");
		float c = sc.nextFloat();
		//boolean b1 = sc.hasNextFloat();
		
		float sum = a+b+c;
		System.out.println("Sum of Numbers");
		System.out.println(sum);
		
		
	}
}
