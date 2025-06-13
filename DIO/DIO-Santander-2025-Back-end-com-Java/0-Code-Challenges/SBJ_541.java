/*
TODO
    - [ ] 1 Verifique se a senha é válida e imprime o resultado:
    - [ ] 2 Verifique se a senha tem pelo menos 8 caracteres. Se não tiver, retornar false.    
    - [ ] 3 Percorra cada caractere da senha e verifique se há pelo menos uma letra maiúscula e um número:
        - DICA: Use um loop para analisar cada caractere e marcar se é maiúscula ou número.
*/
import java.util.Scanner; 

public class SBJ_541 {

    public static boolean validarSenha(String senha) {

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

       // [2]
        if (senha.length() >= 8) {

            // [3]
            if(senha.matches(".*[0-9]")) temNumero = true;

            if(senha.matches(".*(?=.*[a-z]).*")) temMinuscula = true;
    
            if(senha.matches(".*(?=.*[A-Z]).*")) temMaiuscula = true;

            // Se já encontramos uma letra maiúscula e um número, podemos parar a verificação
            if (temMaiuscula && temMinuscula && temNumero) {

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        String senha = scanner.nextLine(); 

        scanner.close();

        // [1] 
        boolean confirmacao = validarSenha(senha);

        if (confirmacao) {
            System.out.println("senha valida");
        }else{
            System.out.println("senha invalida");
        }
    }
}

