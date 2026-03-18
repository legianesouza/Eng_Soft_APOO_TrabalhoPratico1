package exercico17;


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
	Descritivo:   Desenvolva um jogo onde o computador sorteie um número entre 1 e 100, e o usuário tente adivinhá-lo.
	O programa deve dar dicas ("maior" ou "menor") até o acerto.
	*******************************************************************************/
	
	
	public static void main(String[] args) {
			
	    // Cria um objeto da classe Loop
	    // Esse objeto controla a lógica do jogo (chutes e repetição)
		Loop loop = new Loop();

	    // Cria um objeto da classe Criar_nun
	    // Esse objeto será responsável por gerar o número aleatório
		Criar_nun randon = new Criar_nun();
			
	    // Chama o método criar() para gerar um número aleatório
	    // O número será armazenado na variável nun_randon
		int nun_randon = randon.criar();
			
	    // Executa o primeiro chute do jogador
	    // Passa o número aleatório como parâmetro
		loop.prime_chute(nun_randon);

	    // Inicia o loop de tentativas até o jogador acertar
	    // Continua pedindo números até acertar o valor gerado
		loop.criar_loop(nun_randon);
	}
}
