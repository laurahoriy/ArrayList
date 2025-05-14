package Aula_15;

import java.util.ArrayList;

public class Exemplo_03 {

	public static void main(String[] args) {
		//Criando um ArrayList de números inteiros
		
		ArrayList<Integer> numeros = new ArrayList<>(); //Cria uma lista de números inteiros que pode crescer e diminuir.
		
		numeros.add(10);//Adiciona os números 10 e 20 à lista.
		numeros.add(20);
		
		System.out.println(numeros.get(0)); //Mostra o número na posição 0 (primeira posição):
		System.out.println(numeros.get(1)); //Mostra o número na posição 1 (segunda posição):
		
		numeros.set(1, 25); //Muda o valor na posição 1 para 25.
		System.out.println(numeros.get(1)); // Mostra o novo valor na posição 1:
		
		numeros.remove(0); //Remove o número da posição 0 (o 10)
		System.out.println(numeros.get(0)); //Mostra o número que sobrou na posição 0:
		
		System.out.println(numeros.size()); //Mostra quantos itens tem na lista agora:

	}

}

/*
 
Cria uma lista e coloca 10 e 20.

Mostra os dois.

Troca o 20 por 25.

Remove o 10.

Mostra o que sobrou (25).

Diz que agora só tem 1 número na lista.

*/
