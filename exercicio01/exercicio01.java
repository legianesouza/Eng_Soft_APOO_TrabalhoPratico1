/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Componentes:
25001459-2 - Eduardo Gritten dos Santos Spohr
25044068-2 - Legiane Cristina de Souza Oliveira Chagas
25164713-2 - Miguel Felipe Gazola
25182011-2 - Lauana Prado de Andrade
Data: 05 de Março de 2026
Descritivo: Escreva um programa que receba dois números inteiros e exiba a soma deles.
*******************************************************************************/

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        // Solicitando o primeiro número
        try ( // Criando o objeto Scanner para ler a entrada do usuário
                Scanner scanner = new Scanner(System.in)) {
            // Solicitando o primeiro número
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();
            // Solicitando o segundo número
            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();
            // Calculando a soma
            int soma = numero1 + numero2;
            // Exibindo o resultado
            System.out.println("A soma de " + numero1 + " + " + numero2 + " é: " + soma);
            // Fechando o Scanner
        }
    }
}
