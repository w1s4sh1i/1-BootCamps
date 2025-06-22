/*
TODO
// TODO: Crie uma estrutura condicional para determinar o valor do frete:
    - [X] 1 Se o peso for até 1kg, o frete é R$5,00
    - [X] 2 Se o peso for entre 1kg e 5kg, o frete é R$10,00
    - [X] 3 Se o peso for acima de 5kg, o frete é R$20,00
    - [X] 4 Exiba o valor do frete formatado (com duas casas decimais):
*/
import java.util.Scanner;

public class SBJ_542 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double peso = scanner.nextDouble();

		double frete = 0f;

		// [1]
		if (peso <= 1){ frete = 5f; }

		// [2]
		else if (peso > 1 && peso <= 5){ frete = 10f; }  

		// [3]
		else if (peso > 5) { frete = 20f; }

		// [4]
		System.out.printf("R$%.2f%n", frete);

		// Fechando o Scanner para evitar vazamento de recursos
		scanner.close();
	}
}
