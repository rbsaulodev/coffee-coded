package lab02.bankAccount;

import java.util.Scanner;

public class userBankAccount {
    public static void main(String[] args) {
        bankAccountClass user1 = new bankAccountClass();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        user1.nome = entrada.next();
        System.out.println("Digite o  numero da conta: ");
        user1.conta = entrada.nextInt();
        System.out.println("Digite o saldo da sua conta: ");
        user1.saldo = entrada.nextFloat();
        System.out.println("Digite o valor do saque: ");
        user1.saque = entrada.nextFloat();
        System.out.println("Digite o valor do depostio: ");
        user1.deposito = entrada.nextFloat();
        
        entrada.close();

        user1.FazerDeposito();
        user1.RealizarSaque();
        user1.DeveOuNao();
        user1.Status();
 
    }
}
