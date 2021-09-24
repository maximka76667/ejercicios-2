package ejercicio2;

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
		
		String symbol1 = "\0+\0", symbol2 = "\0+\0";
		
		if(b < 0) {
			symbol1 = "\0-\0";
			b = Math.abs(b);
		}
		
		if(c < 0) {
			symbol2 = "\0-\0";
			c = Math.abs(c);
		}
		
		String exp = a + "x^2" + symbol1 + b + "x" + symbol2 + c;
		
		double D = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(D)) / 2 * a;
		double x2 = (-b - Math.sqrt(D)) / 2 * a;
		
		System.out.println('\n' + exp + '\n');
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		
		input.close();
	}

}
