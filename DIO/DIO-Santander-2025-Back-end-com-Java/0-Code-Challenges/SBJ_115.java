/* 
TODO: 
    - [x] 1 - Formate o identificador (minúsculas e sem espaços):
    - [x] 2 - Exiba o resultado:
*/

import java.util.Scanner;

public class SBJ_115 { // 

    public static void main(String[] args) {

        // Criando um objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo a string (nome)
        String nome = scanner.nextLine().trim();

        // Lendo o número inteiro (ID)
        int id = scanner.nextInt();

        // [1]        
        String identificador = String.format("%s-%d", nome, id).toLowerCase();

        // [2]
        System.out.println(identificador);

        // Fechando o scanner
        scanner.close();
    }
}
