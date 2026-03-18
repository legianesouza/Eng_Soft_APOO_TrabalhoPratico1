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
Descritivo: Escreva um programa que solicite um número inteiro e exiba sua tabuada de 1 a 10.
*******************************************************************************/
//O programa pede um número ao usuário, e o atribui à variável numBase com o Scanner. Então, é printado "Tabuada do número {número digitado}:"
//e se entra em um looping, que começa com o i em 1 e termina com ele em 10, igual a uma tabuada tradicional. Para cada vez que o looping roda,
//ele printa no console uma nova linha da tabuada, usando i como base para multiplicar o número escolhido. Foram utilizadas máscaras para a
//formatação correta do texto.

import java.util.Scanner;

public class exercicio14{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numBase;
		
		System.out.print("Digite um número: ");
		numBase = sc.nextInt();
		
		System.out.printf("Tabuada do número %d:", numBase);
		for(int i=1; i<11; i++){
			System.out.printf("\n%d X %d = %d", numBase, i, numBase*i);
		}
	}
}
