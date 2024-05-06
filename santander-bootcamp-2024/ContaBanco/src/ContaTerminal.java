import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número do cartão: ");
        numero = scan.nextInt();        

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scan.next();

        System.out.println("Por favor, digite o nome do usuário: ");
        nomeCliente = scan.next();

        System.out.println("Por favor, digite o saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Olá "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é, "+agencia+" conta "+numero+" e seu saldo "+saldo+" já está disponível para saque!");
        scan.close();
    }
}
