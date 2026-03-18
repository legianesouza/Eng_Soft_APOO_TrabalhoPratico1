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
Descritivo: Escreva um programa que leia 5 números do usuário e os armazene em um array, depois exiba todos os números.
*******************************************************************************/
//O programa declara um array com 5 posições, inicialmente sem nenhum valor atribuído. Então, entra em um looping for (roda 5 vezes) para pedir
//5 números ao usuário. Como o valor de i aumenta com cada vez que o looping ocorre, ele é utilizado como índice para possibilitar a atribuição
//dos valores em diferentes posições do array. Terminado esse primeiro looping, o sistema printa "Números digitados: [", ai entra em mais um looping
//for para printar os valores do array um por um, na mesma linha. Esse looping também checa se é a última vez que o looping irá rodar, caso seja,
//ele não printa a vírgula após o número. Por fim, é printado um "]" para finalizar a formatação do array no console.

import java.util.Scanner;

public class exercicio06{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums;
		nums = new int[5];
		
		for(int i=0; i<5; i++){
		    System.out.print("Digite um número: ");
		    nums[i] = sc.nextInt();
		}
		
		System.out.print("Números digitados: [");
		for(int i=0; i<5; i++){
		    if(i<4) System.out.print(nums[i] + ", ");
		    else System.out.print(nums[i]);
		}
		System.out.print("]");
	}
}
