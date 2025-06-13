package Lista_hackathon4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ativ_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> alturas = new ArrayList<>();
		double soma = 0;

		for (int i = 1; i < 5; i++) {
			System.out.print("Informe a altura do jogador " + i + ": ");
			double altura = scanner.nextDouble();
			alturas.add(altura);
			soma += altura;
		}

		double media = soma / 5;
		System.out.println("Altura média: " + media + " metros");

		scanner.close();
	}
}
