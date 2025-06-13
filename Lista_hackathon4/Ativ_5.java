package Lista_hackathon4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ativ_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> gols = new ArrayList<>();
		int totalGols = 0;

		for (int i = 1; i < 10; i++) {
			System.out.print("Digite a quantidade de gols do jogador " + i + ": ");
			int gol = scanner.nextInt();
			gols.add(gol);
			totalGols += gol;
		}

		System.out.println("Total de gols da equipe na temporada: " + totalGols);

	}

}
