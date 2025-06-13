package Lista_hackathon4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ativ_4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> acertos = new ArrayList<>();
		int totalAcertos = 0;

		for (int i = 1; i <= 7; i++) {
			System.out.println("Informe a quantdade de acertos do " + i + " atleta :");
			int pontos = ler.nextInt();
			acertos.add(pontos);
			totalAcertos += pontos;
		}

		double media = totalAcertos / 5;
		System.out.println("A media de acertos dos jogadores é :" + media);

	}

}

/*
 * 
 * 04. Em um treinamento de arremesso, registre a quantidade de acertos de 7
 * atletas. Armazene os valores em um ArrayList<Integer> e exiba a média dos
 * acertos.
 * 
 */