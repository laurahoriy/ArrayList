package AulaRevisao_17;

import java.util.ArrayList;
import java.util.Random;

public class ArrayFor {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();

		Random aleatorio = new Random();

		for (int i = 0; i < 2; i++) { //carrega a arraylist
			int numeroAleatorio = aleatorio.nextInt(100);
			numeros.add(numeroAleatorio);
	}
		for (int numero : numeros) { //percorre e mostra o arraylist
			System.out.println(numero);
		}

	}

}
