/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Componentes:
2500
1459-2 - Eduardo Gritten dos Santos Spohr
25044068-2 - Legiane Cristina de Souza Oliveira Chagas
25164713-2 - Miguel Felipe Gazola
25182011-2 - Lauana Prado de Andrade
Data: 05 de Março de 2026
Descritivo: Criar uma calculadora simples de quatro operações (+ - * /).
*******************************************************************************/

import java.util.Scanner;  // Importa Scanner para entrada de dados

public class atividade9 {
    public static void main(
        String[] args) {
        // Cabeçalho da calculadora
        try (Scanner scanner = new Scanner(System.in) // Cria objeto Scanner para ler input
        ) {
            // Cabeçalho da calculadora
            System.out.println("=== CALCULADORA SIMPLES ===");
            System.out.println("Operações disponíveis: +, -, *, /");
            System.out.println("Digite 'sair' para encerrar\n");
            String operacao;  // Variável para armazenar a operação
            double numero1, numero2, resultado;  // Variáveis para números e resultado
            // Loop principal da calculadora
            while (true) {
                // Solicita o primeiro número
                System.out.print("Digite o primeiro número: ");
                numero1 = scanner.nextDouble();
                
                // Solicita a operação
                System.out.print("Digite a operação (+, -, *, /): ");
                operacao = scanner.next();
                
                // Verifica se usuário quer sair
                if (operacao.equalsIgnoreCase("sair")) {
                    System.out.println("Calculadora encerrada. Até logo!");
                    break;
                }
                
                // Solicita o segundo número
                System.out.print("Digite o segundo número: ");
                numero2 = scanner.nextDouble();
                
                // Realiza a operação escolhida
                switch (operacao) {
                    case "+" -> {
                        resultado = numero1 + numero2;
                        System.out.printf("%.2f + %.2f = %.2f\n", numero1, numero2, resultado);
                    }
                        
                    case "-" -> {
                        resultado = numero1 - numero2;
                        System.out.printf("%.2f - %.2f = %.2f\n", numero1, numero2, resultado);
                    }
                        
                    case "*" -> {
                        resultado = numero1 * numero2;
                        System.out.printf("%.2f * %.2f = %.2f\n", numero1, numero2, resultado);
                    }
                        
                    case "/" -> {
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                            System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, resultado);
                        } else {
                            System.out.println("ERRO: Divisão por zero não é permitida!");
                        }
                    }
                        
                    default -> System.out.println("ERRO: Operação inválida! Use +, -, * ou /");
                }
                
                System.out.println();  // Linha em branco
            }
            // Fecha o Scanner
        }
    }
}