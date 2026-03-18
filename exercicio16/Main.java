package exercicio16;

import java.util.Scanner;

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
	Descritivo:  Escreva um programa que valide uma senha
	*******************************************************************************/
	
	
	
	public static void main(String[] args) {

	    // Cria um objeto da classe Verif_senha
	    // Esse objeto será usado para validar a senha digitada
	    Verif_senha verif = new Verif_senha();

	    // Cria um objeto Scanner para ler dados do teclado
	    Scanner sc = new Scanner(System.in);

	    // Declara uma variável para armazenar a senha digitada pelo usuário
	    String senha;
	    
	    // Exibe uma mensagem pedindo que o usuário digite uma senha
	    System.out.println("Digite uma senha: ");

	    // Lê a linha digitada pelo usuário e armazena na variável senha
	    senha = sc.nextLine();
	    
	    // Verifica se a senha NÃO atende ao requisito de tamanho mínimo
	    // O operador ! significa "negação" (ou seja, se for falso, entra no if)
	    if(!verif.verif_lenth(senha)) {

	        // Mensagem exibida se a senha tiver menos de 8 caracteres
	        System.out.println("A senha deve ter no minimo 8 caracteres");
	    }

	    // Verifica se a senha NÃO possui letra maiúscula
	    else if(!verif.verif_mausc(senha)) {

	        // Mensagem exibida se não houver letra maiúscula
	        System.out.println("A senha deve ter no minimo uma letra maiuscula");
	    }

	    // Verifica se a senha NÃO possui letra minúscula
	    else if(!verif.verif_minus(senha)) {

	        // Mensagem exibida se não houver letra minúscula
	        System.out.println("A senha deve ter no minimo uma letra minuscula");
	    }

	    // Verifica se a senha NÃO possui dígito (número)
	    else if(!verif.verif_digt(senha)) {

	        // Mensagem exibida se não houver número
	        System.out.println("A senha deve ter no minimo um digito");
	    }

	    // Caso todas as verificações sejam atendidas
	    else {

	        // Mensagem indicando que a senha é válida
	        System.out.println("Nova senha registrada!");
	    }
	}
}
