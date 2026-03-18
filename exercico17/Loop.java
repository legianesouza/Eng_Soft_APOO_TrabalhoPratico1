package exercico17;

import java.util.Scanner;

public class Loop {

    // Cria um objeto Scanner para leitura de dados do usuário
	Scanner sc = new Scanner(System.in);

    // Variável que armazena os próximos chutes do usuário
	int novo_chute;

    // Variável que armazena o primeiro chute do usuário
	int chute;
	
	
    // Método responsável por repetir as tentativas até o usuário acertar
	void criar_loop(int nun) {
		
        // Loop infinito que só será interrompido com o comando "break"
		while(true) {

            // Solicita ao usuário um novo número
			System.out.println("digite um novo número: ");

            // Lê o número digitado
			novo_chute = sc.nextInt();
			
            // Verifica se o chute é menor que o número correto
			if (novo_chute < nun) {

                // Informa que o usuário errou
				System.out.println("não é o número");

                // Dá a dica de que o número correto é maior
				System.out.println("O número é maior!");
			}

            // Verifica se o chute é maior que o número correto
			else if (novo_chute > nun) {

                // Informa que o usuário errou
				System.out.println("não é o número");

                // Dá a dica de que o número correto é menor
				System.out.println("O número é menor!");
			}

            // Caso o número esteja correto
			else {

                // Mensagem de acerto
				System.out.println("É o número!");
				System.out.println("Você ganhou!!!");
				System.out.println("---------------------");

                // Encerra o loop
				break;
			}
		}
	}
	
    // Método responsável pelo primeiro chute do jogador
	void prime_chute(int nun) {

        // Exibe uma separação visual
		System.out.println("---------------------");

        // Apresenta o jogo ao usuário
		System.out.println("Vamos jogar um jogo!!!");

        // Solicita o primeiro número
		System.out.println("digite um número entre 1 e 100: ");

        // Lê o primeiro chute
		chute = sc.nextInt();
		
        // Verifica se o chute é menor que o número correto
		if (chute < nun) {
			System.out.println("não é o número");
			System.out.println("O número é maior!");
		}

        // Verifica se o chute é maior que o número correto
		else if (chute > nun) {
			System.out.println("não é o número");
			System.out.println("O número é menor!");
		}

        // Caso o usuário acerte já no primeiro chute
		else {
			System.out.println("É o número!");
			System.out.println("Você ganhou!!!");
			System.out.println("---------------------");
		}
	}
}	


