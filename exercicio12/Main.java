package exercicio12;

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
	Descritivo:  Escreva um programa que use herança para criar uma classe Aluno que herda de Pessoa e adiciona um
atributo matricula.
	*******************************************************************************/
	
	
	
	
	
	public static void main(String[] args) {

        // Cria um objeto da classe Pessoa chamado pessoa1
        // Passa "Carlos" como nome e 12345678 como CPF
		Pessoa pessoa1 = new Pessoa("Carlos", 12345678);

        // Cria outro objeto da classe Pessoa chamado pessoa2
        // Passa "Maria" como nome e 87654321 como CPF
		Pessoa pessoa2 = new Pessoa("Maria", 87654321);
		
        // Cria um objeto da classe Aluno chamado aluno1
        // Passa nome, CPF e ID de matrícula
		Aluno aluno1 = new Aluno("fabio", 123487654, 11111);

        // Cria outro objeto da classe Aluno chamado aluno2
		Aluno aluno2 = new Aluno("Aghata", 87651234, 22222);
		
        // Chama o método mostrar() do objeto pessoa1
        // Executa o comportamento definido na classe Pessoa
		pessoa1.mostrar();

        // Chama o método mostrar() do objeto pessoa2
		pessoa2.mostrar();
		
        // Chama o método mostrar() do objeto aluno1
        // Aqui será executada a versão sobrescrita em Aluno (override)
		aluno1.mostrar();

        // Chama o método mostrar() do objeto aluno2
		aluno2.mostrar();

	}

}
