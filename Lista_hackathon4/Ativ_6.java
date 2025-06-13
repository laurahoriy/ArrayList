package Lista_hackathon4;

import java.util.Scanner;

public class Ativ_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] pontos = new int[6];
		int soma = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite os pontos da partida " + i + ": ");
			pontos[i] = scanner.nextInt();
			soma += pontos[i];
		}

		System.out.println("Soma total dos pontos nas 5 partidas: " + soma);

	}

}
