package correção_lista;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int somador=0,num;
		
		for (int i = 1; i <=10; i++) {
			System.out.println("Informe um número");
			num = ler.nextInt();
			somador = somador + num;
		}
		System.out.println("a soma é: "+somador);
	}

}

/*
som | i | i<=10 | somador = somador + num

2     1     V           2 = 0 + 1
      
2     2     V           4 = 2 + 2

2     3     V           6 = 2 + 4

2     4     V           8 = 2 + 6

2     5     V           10 = 2 + 8

2     6     V          12 = 2 + 10

2     7     V           14 = 2 + 12

2     8     V          16 = 2 + 14

2     9     V          18 = 2 + 16

2    10     V          20 = 2 + 18

2    11     F          22 = 2 + 20
 
*/