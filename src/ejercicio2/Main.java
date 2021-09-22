package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = input.nextInt();
		
		System.out.print("b: ");
		int b = input.nextInt();
		
		System.out.print("c: ");
		int c = input.nextInt();
		
		String exp = a + "x^2+" + b + "x+" + c;
		
		double D = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(D)) / 2 * a;
		
		double x2 = (-b - Math.sqrt(D)) / 2 * a;
		
		System.out.println(exp);
		System.out.println(x1);
		System.out.println(x2);
		
		input.close();
	}

}
