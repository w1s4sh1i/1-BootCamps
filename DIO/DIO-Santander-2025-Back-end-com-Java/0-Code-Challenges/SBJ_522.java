/*
TODO
- [X] 1 Verifique se o saldo inicial é negativo e encerra o programa:
- [X] 2 Retorne a condição para informar que o saldo nao pode ser negativo:
- [X] 3 Crie um objeto ContaBancaria com os valores lidos:
- [X] 4 Crie o método para exibir as informações da conta:

*/

import java.util.Scanner;

class ContaBancaria {
    private int numero;      
    private String titular;  
    private double saldo;    

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para realizar depósito
    public void depositar(double valor) {
        this.saldo += valor; // Atualiza o saldo apenas se o depósito for válido
    }

    // [4]
    public void exibirSaldo(){
        System.out.printf("Conta #%d - Titular: %s - Saldo: R$%.2f", this.numero, this.titular, this.saldo);
    }

}

public class SBJ_522 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        int numero = scanner.nextInt();
        scanner.nextLine(); 

        String titular = scanner.nextLine();

        double saldo = scanner.nextDouble();

        // [1]
        if (saldo <= 0) { // Verifica se o valor do depósito é inválido

            // [2] 
            System.out.println("Erro: O saldo nao pode ser negativo.");
            return; // Interrompe a execução e não realiza o depósito
        }

        double deposito = scanner.nextDouble();

        // Verificação se o depósito é inválido e encerra o programa
        if (deposito <= 0) {
            System.out.println("Erro: O valor do deposito deve ser positivo.");
            return;
        }

        // [3] 
        ContaBancaria conta = new ContaBancaria(numero, titular, saldo);

        conta.depositar(deposito);

        conta.exibirSaldo();

        scanner.close();
    }
}
