/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Componentes:
 25001459-2 - Eduardo Gritten dos Santos Spohr
 25044068-2 - Legiane Cristina de Souza Oliveira Chagas
 25164713-2 - Luan Enrico Santana Peça
 25182011-2 - Miguel Felipe Gazola
Data: 17 de Março de 2026
Descritivo: Desenvolva um programa que conte quantas palavras existem em uma string fornecida pelo usuário.
*******************************************************************************/
//O programa pede um texto (String) ao usuário e o atribui à variável texto por meio do Scanner. O programa usa o método .trim() para
//retirar espaços extras ao início e ao final do texto. Depois de retirar esses espaços, verifica se a string está vazia, se sim, não
//foi digitada nenhuma palavra. Caso não esteja vazia, separa a string (.split()) usando os espaços como base (\\s+) e pega a quantidade
//de itens após essa separação (.length) e então imprime essa informação no console. Foram utilizadas máscaras para a formatação correta
//do texto.

import java.util.Scanner;

public class exercicio18{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		
		System.out.print("Digite um texto: ");
		texto = sc.nextLine();
		texto = texto.trim();
		
		if(texto.isEmpty()) System.out.println("Você não digitou nenhuma palavra!");
		else System.out.printf("\nVocê digitou %d palavras!", texto.split("\\s+").length);
	}
}
