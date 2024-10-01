package bankAccount;

public class userBankAccount {
    public static void main(String[] args) {
        bankAccountClass user1 = new bankAccountClass();
        bankAccountClass user2 = new bankAccountClass();
        bankAccountClass user3 = new bankAccountClass();

        //User 1
        user1.nome = "Ricardo Ribeiro";
        user1.conta = 050437;
        user1.saldo = 1800;
        user1.saque = 500;
        user1.deposito = 300;

        user2.FazerDeposito();
        user2.RealizarSaque();
        user2.DeveOuNao();
        user2.Status();
        System.out.println("");

        //User 2
        user2.nome = "Daniel Victor";
        user2.conta = 2262347;
        user2.saldo = 2500;
        user2.saque = 1000;
        user2.deposito = 50;

        user2.FazerDeposito();
        user2.RealizarSaque();
        user2.DeveOuNao();
        user2.Status();
        System.out.println("");

        //User 3
        user3.nome = "Laura Lobo";
        user3.conta = 2968207;
        user3.saldo = 800;
        user3.saque = 900;
        user3.deposito = 80;

        user3.FazerDeposito();
        user3.RealizarSaque();
        user3.DeveOuNao();
        user3.Status();
    }
}
