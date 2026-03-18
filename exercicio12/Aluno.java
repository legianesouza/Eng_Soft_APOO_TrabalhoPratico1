package exercicio12;

// Declaração da classe Aluno, que herda (extends) da classe Pessoa
public class Aluno extends Pessoa {

    // Declara um atributo inteiro que representa o ID de matrícula do aluno
	int id_matricula;
	
	// Construtor da classe Aluno
	// Recebe como parâmetros: nome, cpf e id de matrícula
	public Aluno(String nome, int cpf, int id_matricula) {

        // Chama o construtor da classe pai (Pessoa)
		super(nome, cpf);

        // Atribui o valor recebido ao atributo id_matricula do objeto atual
		this.id_matricula = id_matricula;
	}
	
	// Indica que este método está sobrescrevendo (override)
    // um método que já existe na classe Pessoa
	@Override
	public void mostrar() {

        // Exibe uma mensagem no console com:
        // - o nome da pessoa (herdado da classe Pessoa)
        // - o fato de ser estudante
        // - o ID de matrícula
		System.out.println(this.nome + " é uma pessoa e é um(a) estudante, com um id de matricula de: " + this.id_matricula);
	}

}
