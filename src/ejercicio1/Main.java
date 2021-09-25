package ejercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entra temperatura en Kelvin: ");
		int K = entrada.nextInt();
		
		System.out.println("Celsius: " + (K - 273));
		
		entrada.close();
	}
}
