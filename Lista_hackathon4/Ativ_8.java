package Lista_hackathon4;

import java.util.Scanner;

public class Ativ_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] tempos = new double[6];
		double tempoTotal = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o tempo da corrida " + i + " (em segundos): ");
			tempos[i] = scanner.nextDouble();
			tempoTotal += tempos[i];
		}

		System.out.println("Tempo total gasto nas 5 corridas: " + tempoTotal + " segundos");

	}

}
