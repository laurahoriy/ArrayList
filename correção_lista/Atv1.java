package correção_lista;

import java.util.Scanner;

public class Atv1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in); // Interage com o usuário
		 int num1, num2, resul; //declara as variáveis 
		 
		 System.out.println("Informe o primeiro número: "); //pede ao usuário o 1º numero
		 num1 = ler.nextInt(); //armazena o numero que o usuário deu
		 
		 System.out.println("Informe o segundo número: "); //pede ao usuario o 2º numero
		 num2 = ler.nextInt(); //armazena o valor dado
		 
		 resul = num1 + num2; //realiza a soma dos valores
		 
		 System.out.println("O resultado da operação: " + resul); //imprime para o usuario a resposta com o resultado da soma

	}

}
