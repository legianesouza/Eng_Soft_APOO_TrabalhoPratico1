package exercico15;

import java.util.Scanner;

public class Main {

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
	Data: 05 de Março de 2026
	Descritivo:  Implemente uma calculadora de Índice de Massa Corporal (IMC) que receba peso (kg) e altura (m) e
	exiba o resultado com a classificação correspondente (ex: abaixo do peso, normal, etc.).
	*******************************************************************************/
	
	
	
		public static void main(String[] args) {

	        // Cria um objeto Scanner para ler dados do teclado
			Scanner sc = new Scanner(System.in);

	        // Declara uma variável para armazenar o peso
			float peso;

	        // Declara uma variável para armazenar a altura
			float altura;
			
	        // Exibe uma mensagem pedindo o peso ao usuário
			System.out.println("digite um peso: ");

	        // Lê o valor digitado pelo usuário e armazena na variável peso
			peso = sc.nextFloat();
			
	        // Exibe uma mensagem pedindo a altura ao usuário
			System.out.println("digite uma altura(com virgula): ");

	        // Lê o valor digitado pelo usuário e armazena na variável altura
			altura = sc.nextFloat();
			
	        // Chama o método imc, passando altura e peso como parâmetros
			imc(altura, peso);

		}

	    // Método que calcula o IMC (Índice de Massa Corporal)
		static void imc(float altura, float peso) {

	        // Calcula o IMC usando a fórmula:
	        // IMC = peso / (altura * altura)
			float imc = peso / (altura * altura);

	        // Exibe o resultado formatado com 2 casas decimais
			System.out.printf("O imc é: %.2f%n", imc);
		}
	}