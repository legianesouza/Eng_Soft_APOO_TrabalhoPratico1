package exercicio12;

public class Pessoa {

    // Atributo que armazena o nome da pessoa
	String nome;

    // Atributo que armazena o CPF da pessoa
	int cpf;
	
    // Construtor da classe Pessoa
    // Recebe nome e CPF como parâmetros
	public Pessoa(String nome, int cpf) {

        // Atribui o valor do parâmetro nome ao atributo da classe
		this.nome = nome;

        // Atribui o valor do parâmetro cpf ao atributo da classe
		this.cpf = cpf;
	}

    // Método getter para o atributo nome
    // Retorna o nome da pessoa
	public String getNome() {
		return nome;
	}

    // Método setter para o atributo nome
    // Permite alterar o nome da pessoa
	public void setNome(String nome) {
		this.nome = nome;
	}

    // Método getter para o atributo cpf
    // Retorna o CPF da pessoa
	public int getCpf() {
		return cpf;
	}

    // Método setter para o atributo cpf
    // Permite alterar o CPF da pessoa
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
    // Método que exibe informações da pessoa
    // Esse método pode ser sobrescrito (override) em subclasses, como Aluno
	public void mostrar() {

        // Exibe uma mensagem indicando que é uma pessoa comum (não estudante)
		System.out.println(this.nome + " é uma pessoa e não é um(a) estudante");
	}
}
