package exercicio04;

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
	Descritivo: Faça um programa que converta uma temperatura em graus Celsius para Fahrenheit, utilizando a fórmula:
	F = (C × 9/5) + 32.
	*******************************************************************************/
	
	
	

    // Declara uma variável estática inteira com valor 30 
    static int temp_celsius1 = 30;

    // Declara uma variável estática inteira com valor 0 
    static int temp_celsius2 = 0;

    // Declara uma variável estática inteira com valor 100 
    static int temp_celsius3 = 100;

    
    public static void main(String[] args) {

        // Chama o método mostrar_resul passando:
        // - a temperatura em Celsius (temp_celsius1)
        // - o resultado da conversão para Fahrenheit (calculado pelo método calc_temp)
        mostrar_resul(temp_celsius1, calc_temp(temp_celsius1));

        // Faz o mesmo processo para a segunda temperatura (0°C)
        mostrar_resul(temp_celsius2, calc_temp(temp_celsius2));

        // Faz o mesmo processo para a terceira temperatura (100°C)
        mostrar_resul(temp_celsius3, calc_temp(temp_celsius3));
    }

    // Método responsável por converter temperatura de Celsius para Fahrenheit
    static float calc_temp(int temp) {

        // Fórmula de conversão:
        // Fahrenheit = (Celsius * 9/5) + 32
        // O 9.0f garante que o cálculo seja feito com número decimal (float)
        return (temp * 9.0f / 5 + 32);
    }

    // Método responsável por mostrar o resultado no console
    static void mostrar_resul(int temp, float resul) {

        // Exibe a mensagem formatada:
        // %d → inteiro (temperatura em Celsius)
        // %.2f → número decimal com 2 casas (temperatura em Fahrenheit)
        // %n → quebra de linha
        System.out.printf("%d em Celsius é equivalente a %.2f em Fahrenheit%n", temp, resul);
    }
}
