package exercico16;

public class Verif_senha {

    // Método que verifica se a senha tem pelo menos 8 caracteres
	boolean verif_lenth(String senha) {

        // Verifica se o tamanho da senha é menor que 8
		if(senha.length() < 8) {

            // Retorna falso caso não atenda ao requisito
			return false;
		}
		else {

            // Retorna verdadeiro caso a senha tenha 8 ou mais caracteres
			return true;
		}
	}
	
    // Método que verifica se a senha possui pelo menos uma letra maiúscula
	boolean verif_mausc(String senha) {

        // Percorre cada caractere da senha
		for(int i = 0; i < senha.length(); i++) {

            // Obtém o caractere na posição atual
			char m = senha.charAt(i);
			
            // Verifica se o caractere é uma letra maiúscula
			if(Character.isUpperCase(m)) {

                // Se encontrar, retorna verdadeiro imediatamente
				return true;
			}
		}

        // Se não encontrar nenhuma letra maiúscula, retorna falso
		return false;
	}
	
    // Método que verifica se a senha possui pelo menos uma letra minúscula
	boolean verif_minus(String senha) {

        // Percorre cada caractere da senha
		for(int i = 0; i < senha.length(); i++) {

            // Obtém o caractere na posição atual
			char m = senha.charAt(i);
			
            // Verifica se o caractere é uma letra minúscula
			if(Character.isLowerCase(m)) {

                // Se encontrar, retorna verdadeiro
				return true;
			}
		}

        // Se não encontrar nenhuma letra minúscula, retorna falso
		return false;
	}
	
    // Método que verifica se a senha possui pelo menos um dígito (número)
	boolean verif_digt(String senha) {

        // Percorre cada caractere da senha
		for(int i = 0; i < senha.length(); i++) {

            // Obtém o caractere na posição atual
			char m = senha.charAt(i);
			
            // Verifica se o caractere é um número
			if(Character.isDigit(m)) {

                // Se encontrar, retorna verdadeiro
				return true;
			}
		}

        // Se não encontrar nenhum número, retorna falso
		return false;
	}
}
