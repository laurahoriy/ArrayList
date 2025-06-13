package AulaRevisao_17;

import java.util.Scanner;

public class VetorFor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor[] = new int[2];

		for (int i = 0; i < 2; i++) {
			System.out.println("Informe um valor");
			valor[i] = ler.nextInt();
		}

		for (int i = 0; i < 2; i++) {
			System.out.println(valor[i]);
		}
		ler.close();
	}
	}


/*
i | i<2 | a[i]

0   0<2   3

1   1<2   3

2   2<2F

*/