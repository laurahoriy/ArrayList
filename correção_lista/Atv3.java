package correção_lista;

import java.util.Scanner;

public class Atv3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);// interagem com o usuario usando o ler para verificar o que ele escreveu
		int dia; // declara a variavael dia

		System.out.println("Informe um valor referente ao dia da semana"); //interage com o usuario para realizar a pergunta
		dia = ler.nextInt(); //armazena o valor dado pelo usuario

		if (dia == 1) {  //se o dia for igual a 1
			System.out.println("Domingo"); //a máquina irá responder o usuário domingo
		}

		else if (dia == 2) { //se o dia for igual a 2
			System.out.println("Segunda"); //a máquina irá responder o usuário segunda
		}
		else if (dia == 3) { //se o dia for igual a 3
			System.out.println("Terça");//a máquina irá responder o usuário terça
		}
		
		else if (dia == 4) { //se o dia for igual a 4
			System.out.println("Quarta"); //a máquina irá responder o usuário quarta
		}
		
		else if (dia == 5) { //se o dia for igual a 5
			System.out.println("Quinta"); //a máquina irá responder o usuário quinta
		}
		
		
		else if (dia == 6) { //se o dia for igual a 6
			System.out.println("Sexta"); //a máquina irá responder o usuário sexta
		}
		
		else if (dia == 7) { //se o dia for igual a 7
			System.out.println("Sábado"); //a máquina irá responder o usuário sabado
		}
		
		else { //essa condição é para caso o usuario digite um valor que não corresponde a nenhum dia da semana correto
			System.out.println("Esse valor não corresponde a nenhum dia da semana"); //imprime ao usuario o erro
		}

	}

}
