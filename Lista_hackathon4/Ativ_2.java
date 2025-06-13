package Lista_hackathon4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ativ_2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> pontos = new ArrayList<>();
		int totalPontos = 0;

		for (int i = 1; i <= 6; i++) {
			System.out.println("Informe a pontuação da " + i + " partida :");
			int partida = ler.nextInt();
			pontos.add(partida);
			totalPontos += partida;
		}

		System.out.println("A pontuação total das partidas é :" + totalPontos);
	}

}
