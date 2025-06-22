/*
TODO: 
    - [x] 1 Normalize a URL: removendo espaços e convertendo para minúsculas
    - [x] 2 Exiba a URL normalizada
*/        

import java.util.Scanner;

public class SBJ_125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo a entrada do usuário
        String url = scanner.nextLine();

        // [1]
        String url_normalizada = url.trim().toLowerCase();

        // [2]
        System.out.println(url_normalizada);

        scanner.close();
    }
}
