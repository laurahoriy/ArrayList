package Aula_15;

import java.util.ArrayList;
import java.util.Random;

public class Exemplo_4 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		Random random = new Random(); //Está criando uma máquina de fazer números aleatórios.
		
		for (int i = 0; i < 5; i++) { //Está dizendo: "Repita o que está dentro dessas chaves 5 vezes".
			int numeroAleatorio = random.nextInt(100); //Gera um número aleatório entre 0 e 99 (o 100 não entra!).
			numeros.add(numeroAleatorio);//Está colocando o número aleatório dentro de uma lista chamada numeros.
		}
		
		for (int numero : numeros) { //Ele diz: "Para cada número que está dentro da lista numeros, faça alguma coisa com ele"
			System.out.println(numero); //Mostra o número na tela. Escreve ele no console.
		}
		
	}

}

/*
 
i | i<5 | numeroAletorio
 
o    V         57 

1    V         8

2    V         29

3    V         69

4    V         22

5    V         
 
*/