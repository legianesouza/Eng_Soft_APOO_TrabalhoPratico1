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

// Criamos a classe chamada Pessoa
public class Pessoa {

    // Atributos da classe (informações que cada pessoa terá)
    String nome;
    int idade;

    // Método para exibir os dados da pessoa
    void exibirDados() {

        // Mostra o nome da pessoa
        System.out.println("Nome: " + nome);

        // Mostra a idade da pessoa
        System.out.println("Idade: " + idade);
    }

    // Método principal onde o programa começa a executar
    public static void main(String[] args) {

        // Criamos um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa();

        // Atribuímos valores aos atributos
        pessoa1.nome = "Ana";
        pessoa1.idade = 20;

        // Chamamos o método para mostrar os dados
        pessoa1.exibirDados();
    }
}
