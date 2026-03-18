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
Descritivo: Escreva um programa que exiba apenas os números pares de 1 a 20.
*******************************************************************************/

public class atividade5 {
    public static void main(String[] args) {

        System.out.println("=== Numeros pares de 1 a 20 =");
        for (int numero = 1; numero <= 20; numero++) {  // Loop de 1 até 20
            if (numero % 2 == 0) {  // Verifica se o resto da divisão por 2 é 0 (par)
                System.out.println(numero);  // Exibe apenas números pares
            }
        }
        
        System.out.println();  // Linha em branco para separar
        
    }
}