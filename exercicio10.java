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
Descritivo: Escreva um programa que ordene um array de números em ordem crescente.
*******************************************************************************/
//O programa declara um array com 5 posições, inicialmente sem nenhum valor atribuído. Então, entra em um looping for (roda 5 vezes) para pedir
//5 números ao usuário. Como o valor de i aumenta com cada vez que o looping ocorre, ele é utilizado como índice para possibilitar a atribuição
//dos valores em diferentes posições do array. Terminado esse primeiro looping, o array é ordenado em ordem crescente pela função Arrays.sort().
//Para finalizar, o sistema printa "Números digitados: [", ai entra em mais um looping for para printar os valores do array um por um, na mesma 
//linha. Esse looping também checa se é a última vez que o looping irá rodar, caso seja,ele não printa a vírgula após o número. Por fim, é 
//printado um "]" para finalizar a formatação do array no console.

import java.util.Scanner;
import java.util.Arrays;

public class exercicio10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums;
		nums = new int[5];
		
		for(int i=0; i<nums.length; i++){
		    System.out.print("Digite um número: ");
		    nums[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		System.out.print("Números ordenados: [");
		for(int i=0; i<nums.length; i++){
			if(i<nums.length - 1) System.out.print(nums[i] + ", ");
			else System.out.print(nums[i]);
		}
		System.out.print("]");
	}
}
