/*
TODO
    - [X1 Pegue as três primeiras letras do nome e convertendo para maiúsculas:
    - [X] 2 Pegue o último dígito do ano:
    - [X] 3 Construa o código promocional:
    - [X] 4 Exibinda o código promocional gerado:
*/

import java.util.Scanner;

public class SBJ_551 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Lendo a linha inteira e dividindo em partes pelo ", "
		String entrada = scanner.nextLine();
		String[] partes = entrada.split(", ");

		// Capturando os valores a partir da divisão
		String nome = partes[0]; 
		int ano = Integer.parseInt(partes[1]);
		int id = Integer.parseInt(partes[2]); 

		// Fechando o Scanner para evitar vazamento de recurso
		scanner.close();

		// [1]
		String inicial_nome = nome.substring(0,3).toUpperCase();

		// [2]
		int ultimo_digito_ano = ano % 10;

		// [3]
		String codigo_promocional = inicial_nome + Integer.toString(ultimo_digito_ano) + Integer.toString(id);

		// [4]
		System.out.println(codigo_promocional);
	}
}
