package Lista_hackathon4;

import java.util.Scanner;

public class Ativ_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] treinos = new int[8];
		int total = 0;

		for (int i = 1; i <= 7; i++) {
			System.out.print("Digite a quantidade de treinos no dia " + i + ": ");
			treinos[i] = scanner.nextInt();
			total += treinos[i];
		}

		System.out.println("Total de treinos realizados na semana: " + total);

		scanner.close();

	}

}
