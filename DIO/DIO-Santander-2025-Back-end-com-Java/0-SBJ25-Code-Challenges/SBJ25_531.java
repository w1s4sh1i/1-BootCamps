/*
TODO:
    - [X] 1 Leia a linha de entrada:
    - [X] 2 Exiba o primeiro elemento (método HTTP):
    - [X] 3 Divida a string usando espaço como delimitador:
*/
import java.util.Scanner;

public class SBJ_531 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// [1]
		String requisicao = scanner.nextLine();

		scanner.close();

		// [2]
		String[] informacao = requisicao.split(" ");

		String metodo = informacao[0];
		String rota = informacao[1];
		String status_code = informacao[2];

		// [3]
		System.out.println(metodo);
	}
}
