package correção_lista;

import java.util.Scanner;

public class Atv2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in); //interage com o usuario, usando o ler para verificar o que ele escreveu.
        double area; //declara a variável "area"
		
		
		System.out.println("INFORME VALORES PARA CALCULAR A AREA DO TRIANGULO");
		
		System.out.println("Informe o valor da base"); //interage com o usuário para receber o valor da base
		double b = ler.nextDouble(); //armazena o valor da base
		
		System.out.println("Informe o valor da altura "); //interage com o usuário para receber o valor da altura
		double h = ler.nextDouble(); //armazena o valor da altura
		
		area = ((b*h)/2); //realiza a conta para o cálculo da base do triângulo
		
		System.out.println("O valor da área é " + area); //soma o valor da área e apresenta como resposta para o usuário

	}

}
