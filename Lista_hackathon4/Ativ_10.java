package Lista_hackathon4;

import java.util.Scanner;

public class Ativ_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] defesas = new int[9];
        int totalDefesas = 0;

        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite a quantidade de defesas na partida " + i + ": ");
            defesas[i] = scanner.nextInt();
            totalDefesas += defesas[i];
        }
        
        System.out.println("Total de defesas nas 8 partidas: " + totalDefesas);

	}

}
