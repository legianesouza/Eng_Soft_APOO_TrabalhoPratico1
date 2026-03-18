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
Descritivo: Escreva um programa que leia um número inteiro e informe se ele é par ou ímpar.
*******************************************************************************/
//O programa solicita um input de número (int) para o usuário. Então, ele lê o input com o Scanner e atribui o 
//valor à variável num. Por fim, ele verifica se o resto da divisão do número determinado é igual a 0. Se sim, isso
//significa que ele é par, então é printado no console que o número é par. Se não, o número é ímpar, e é printado no
//console que o número é ímpar.

import java.util.Scanner;

public class exercicio02{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		if(num%2 == 0){
		    System.out.println("O número " + num + " é par!");
		}else{
		    System.out.println("O número " + num + " é ímpar!");
		}
	}
}
