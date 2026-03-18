/**************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Componentes:
25001459-2 - Eduardo Gritten dos santos spohr
25044068-2 - Legiane Cristina de Souza Oliveira Chagas
25164713-2 - Luan Enrico Santana Peça
25182011-2 - Miguel Felipe Gazola
Data: 18 de Março de 2026
Descritivo: Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.
***************************/
// Importa a classe Scanner para ler dados digitados pelo usuário
import java.util.Scanner;

public class ContarVogais {

    public static void main(String[] args) {

        // Cria o objeto Scanner para ler o que o usuário digitar
        Scanner teclado = new Scanner(System.in);

        // Variável para guardar a frase digitada
        String frase;

        // Variável para contar as vogais
        int contador = 0;

        // Pede ao usuário para digitar uma frase
        System.out.println("Digite uma frase:");

        // Lê a frase digitada
        frase = teclado.nextLine();

        // Converte a frase para minúsculas para facilitar a comparação
        frase = frase.toLowerCase();

        // Percorre cada letra da frase
        for (int i = 0; i < frase.length(); i++) {

            // Pega um caractere da frase
            char letra = frase.charAt(i);

            // Verifica se a letra é uma vogal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {

                // Se for vogal, aumenta o contador
                contador++;
            }
        }

        // Mostra o número de vogais encontradas
        System.out.println("Número de vogais: " + contador);

        // Fecha o Scanner
        teclado.close();
    }
}
