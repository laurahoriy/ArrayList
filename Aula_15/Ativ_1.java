package Aula_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ativ_1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int numA = random.nextInt(1, 10);
			numeros.add(numA);
		}

		numeros.remove(3);
		for (int numA : numeros) {
			System.out.println(numA);
		}

	}
}

/*
 
 i | i<10 | numA
 
 0    V      9
 
 1    V      6
 
 2    V      6
 
 3    V      
 
 4    V      5
 
 5    V      4
 
 6    V      8
 
 7    V      5
 
 8    V      8
 
 9    V      5
 
 
 
 
*/