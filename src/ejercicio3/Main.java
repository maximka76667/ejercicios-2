package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Altura: ");
		double altura = entrada.nextDouble();

		System.out.print("Edad: ");
		int edad = entrada.nextInt();

		char k_char = '\0';

		double k = 1;
		boolean is_valid_letra = true;

		do {
			System.out.println("Homres o mujeres (H/M)");
			k_char = Character.toLowerCase(entrada.next().charAt(0));
			if(k_char == 'h') {
				k = 4;
				is_valid_letra = true;
			} else if(k_char == 'm') {
				k = 2.5;
				is_valid_letra = true;
			} else {
				System.out.println("Not valid letra");
				is_valid_letra = false;
			}
		} while(!is_valid_letra);

		double loren = altura - 100 - ((altura - 150) / 4) + ((edad - 20) / k); 
		double pero = altura - 100 + (edad * 9 / 10);
		double broc = altura - 100;
		double MLIC = 50 + 0.75 * (altura - 150);
		
		
		System.out.println("A: " + altura);
		System.out.println("E: " + edad);
		System.out.println("k: " + k);
		
		System.out.println("Lorenzt: " + loren);
		System.out.println("Perroult: " + pero);
		System.out.println("Brocca: " + broc);
		System.out.println("MLIC: " + MLIC);



		entrada.close();
	}

}
