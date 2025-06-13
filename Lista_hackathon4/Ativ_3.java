package Lista_hackathon4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ativ_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Double> corrida = new ArrayList<>();
		Double metros = 0.0;

		for (int i = 1; i <= 4; i++) {
			System.out.println("Informe a metragem do corredor " + i + " :");
			Double metragem = ler.nextDouble();
			corrida.add(metragem);
			metros += metragem;
		}

		System.out.println("A soma total das distâncias dos 4 corredores é: " + metros);

	}

}

/*
 * 
 * 03. Leia a distância (em metros) percorrida por 4 corredores de uma equipe de
 * revezamento e armazene em um ArrayList<Double>. Apresente a soma total das
 * distâncias.
 * 
 */