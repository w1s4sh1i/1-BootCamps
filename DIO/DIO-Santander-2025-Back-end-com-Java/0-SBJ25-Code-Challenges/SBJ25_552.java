/*
Platform: DIO
BootCamp: Santander 2025 Back-End Java
Developer: André Bezerra
Module: Desenvolvendo Lógica para Aplicações Escaláveis  
Challenge: 2 / 2 - Controle de Acessos em um Sistema
 
TODO
- [X] 1 Crie um objeto Scanner para ler a entrada do usuário;
- [X] 2 Leia um número inteiro que representa o ID do usuário:
- [X] 3 Verifica se o ID do usuário está dentro do intervalo permitido (1000 a 9999)

*/

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class SBJ_552 {

    public static void main(String[] args) {

        // [1]
        Scanner scanner = new Scanner(System.in);   

        // [2]
        int id_usuario = scanner.nextInt();

        // [3]
        if (id_usuario < 1000 || id_usuario > 9999){
			System.out.println("acesso negado");
        
        }else{
			System.out.println("acesso permitido");
        
        }
        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
