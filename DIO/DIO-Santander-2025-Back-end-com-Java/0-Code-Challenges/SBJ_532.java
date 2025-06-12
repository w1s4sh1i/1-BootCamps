/*
TODO:

- [X] 1 Divida a string IP pelo caractere "." e armazenar as partes em um array
    - DICA: Use o método split(".")

- [X] 2 Verificque se o array contém exatamente 4 partes
    - DICA: Se não tiver 4 partes, o IP é inválido (retorne false)

- [X] 3 Percorra cada parte do array e verificar se é um número válido:
    - DICA: Use um loop for para percorrer todas as partes do IP;
    - DICA: Para verificar se a parte é válida, chame o método ehNumeroValido(parte).
 
- [X] 4 Verifique se o IP é válido e imprima o resultado

- [X] 5 Chame o método validarIP passando o IP como parâmetro e imprimir "ip valido" ou "ip invalido"
    - DICA: Use um if-else para verificar o retorno do método validarIP.    
*/
import java.util.Scanner; 

public class Main {

    // Método auxiliar para verificar se uma string representa um número válido entre 0 e 255
    private static boolean ehNumeroValido(String str) {

        try {

            int num = Integer.parseInt(str); 
            return num >= 0 && num <= 255; 

        } catch (NumberFormatException e) {

            return false; 

        }
    }

    // Método para validar um endereço IP
    public static boolean validarIP(String ip) {
        // [1]
        String[] codigos = ip.split("\\.");

        // [2]
        if (codigos.length == 4){

        // [3]
            for (String codigo : codigos){

                if (! ehNumeroValido(codigo.trim())) {

                    return false;

                }    
            }

            return true;

        }else{

            return false;

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        String ip = scanner.nextLine(); 
        scanner.close(); 

        // [4] e [5]
        if (validarIP(ip)) {
            System.out.println("ip valido");    
        }
        else {
            System.out.println("ip invalido");
        }
    }

}

