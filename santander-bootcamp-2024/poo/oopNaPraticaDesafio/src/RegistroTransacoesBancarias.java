import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<String> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            if (tipoTransacao == 'D' || tipoTransacao == 'd') {
                saldo += valorTransacao;
                transacoes.add(i + ". Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S' || tipoTransacao == 's') {
                saldo -= valorTransacao;
                transacoes.add(i + ". Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }
        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
        scanner.close();
    }
}