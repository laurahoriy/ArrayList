package Aula_15;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo_02 {

	public static void main(String[] args) {
		String[] disciplinas = {"matemática", "filosofia", "história", "física"}; //Cria um vetor (uma fila de lugares) chamado disciplinas, que guarda 4 matérias escolares.
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas)); //Cria uma nova lista que pode crescer (ArrayList) com os mesmos elementos do vetor disciplinas.
		//Arrays.asList(disciplinas) transforma o vetor em uma lista
		novaLista.add("Língua Inglesa"); //Adiciona a disciplina "Língua Inglesa" à nova lista.
		novaLista.add("Geografia"); //Adiciona a disciplina "Geografia" no final da lista.
		
		for (String i : novaLista) { //Esse é um laço de repetição (for-each). Ele vai pegar um item por vez da lista novaLista e mostrar na tela com a frase "Disciplina: ..."
			System.out.println("Disciplina: " + i);
		}

	}

}
