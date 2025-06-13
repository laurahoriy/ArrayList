package Aula_15;

import java.util.ArrayList;
import java.util.Random;

public class Ativ_2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int numA = random.nextInt(1, 10); //para fazer negativo usar (-10,10)
			numeros.add(numA);
			System.out.println("Numeros sem multiplicar " + numA);
		}

		for (int recebeValor : numeros) { //trabalha com o tamanho inteiro da lista e só pode ser usado no arraylist.
			System.out.println("Números multiplicados " + recebeValor * 2);
		}

	}
}
