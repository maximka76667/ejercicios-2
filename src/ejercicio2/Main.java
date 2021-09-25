package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Input a, b, c
		System.out.print("a: ");
		int a = input.nextInt();

		System.out.print("b: ");
		int b = input.nextInt();

		System.out.print("c: ");
		int c = input.nextInt();

		// Discriminant
		double D = Math.pow(b, 2) - 4 * a * c;

		// x1, x2
		double x1 = (-b + Math.sqrt(D)) / (2 * a);
		double x2 = (-b - Math.sqrt(D)) / (2 * a);	

		// Output of expression
		String symbol1 = " + ", symbol2 = " + ";

		if(b < 0) {
			symbol1 = " - ";
			b = Math.abs(b);
		}

		if(c < 0) {
			symbol2 = " - ";
			c = Math.abs(c);
		}

		// Final expression
		String exp = a + "x^2" + symbol1 + b + "x" + symbol2 + c;

		// Printing results
		System.out.println('\n' + exp + '\n');
		System.out.println("Discriminant: " + D);
		System.out.println("x1: " + (Double.isNaN(x1) ? "-" : x1));
		System.out.println("x2: " + (Double.isNaN(x1) ? "-" : x2));

		input.close();
	}

}
