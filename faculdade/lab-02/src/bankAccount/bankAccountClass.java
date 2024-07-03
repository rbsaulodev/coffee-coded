package bankAccount;

public class bankAccountClass {
    String nome;
    int conta;
    float saldo;
    float saque;
    float deposito;

    void FazerDeposito(){
        saldo += deposito;
    }

    void RealizarSaque(){
        saldo -= saque;
    }

    void Status(){
        System.out.println("Depois de realizar um saque de "+this.saque+" e um deposito de "+this.deposito+" o seu saldo é de: "+this.saldo);
    }

    void DeveOuNao(){
        if(this.saldo < 0){
            System.out.println("Voce esta devendo R$ "+this.saldo);
        }else{
            System.out.println("Parabens voce nao esta devendo! Seu saldo é de: R$"+this.saldo);
        }
    }
}
