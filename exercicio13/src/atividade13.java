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
Descritivo: Escreva um programa que defina uma interface Veiculo com métodos acelerar() e frear(), e implemente
essa interface em uma classe Carro.
*******************************************************************************/

// Interface Veiculo
interface Veiculo {
    void acelerar();
    void frear();
}

// Classe Carro que implementa a interface Veiculo
class Carro implements Veiculo {
    private final String modelo;
    private int velocidadeAtual;
    
    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }
    
    @Override
    public void acelerar() {
        velocidadeAtual += 20;
        System.out.println("O " + modelo + " acelerou! Velocidade atual: " + velocidadeAtual + " km/h");
    }
    
    @Override
    public void frear() {
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 15;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
        }
        System.out.println("O " + modelo + " freou! Velocidade atual: " + velocidadeAtual + " km/h");
    }
    
    public void mostrarStatus() {
        System.out.println("Carro: " + modelo + " | Velocidade: " + velocidadeAtual + " km/h");
    }
}

// Classe principal para testar
public class atividade13 {
    public static void main(String[] args) {
        // Criando um carro
        Veiculo meuCarro = new Carro("Carro Esportivo");
        
        System.out.println("=== Testando o Carro ===");
        meuCarro.acelerar();  // Acelera
        meuCarro.acelerar();  // Acelera mais
        meuCarro.frear();     // Freia
        meuCarro.frear();     // Freia mais
        
        // Usando polimorfismo
        Carro carro = (Carro) meuCarro;
        carro.mostrarStatus();
    }
}