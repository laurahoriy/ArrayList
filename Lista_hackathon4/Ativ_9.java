package Lista_hackathon4;

import java.util.Scanner;

public class Ativ_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] voltas = new int[7];
		int totalVoltas = 0;

		for (int i = 1; i <= 6; i++) {
			System.out.print("Digite a quantidade de voltas no treino " + i + ": ");
			voltas[i] = scanner.nextInt();
			totalVoltas += voltas[i];
		}

		System.out.println("Total de voltas concluídas nos 6 treinos: " + totalVoltas);

	}

}
