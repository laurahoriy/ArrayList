package Aula_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ativ_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numero = new ArrayList<Integer>();
		
		for (int i=1; i<6; i++) {
			System.out.print("Informe o " + i + " número: ");
			int numUser = scanner.nextInt();
			numero.add(numUser);
		}
		
		System.out.println("Números positivos");
		
		for (int numeros: numero) {
			if (numeros > 0) {
				System.out.println(numeros);
			}
		}

	}

}
