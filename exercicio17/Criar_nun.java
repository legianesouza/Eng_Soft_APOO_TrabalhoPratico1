package exercicio17;

// Importa a classe Random, usada para gerar números aleatórios
import java.util.Random;

// Declaração da classe responsável por criar números aleatórios
public class Criar_nun {
	
    // Cria outro objeto da classe Random que será usado para gerar números
	Random nun = new Random();
	
    // Método que gera e retorna um número aleatório
	int criar() {
		
        // Gera um número inteiro aleatório entre 0 e 100
        // nextInt(101) gera valores de 0 até 100 (inclusive)
		return nun.nextInt(101);
	}
}


