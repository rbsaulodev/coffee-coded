import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario;

        for (; ;) {
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            if (valorSaque > limiteRestante) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            limiteRestante -= valorSaque;
            System.out.println("Saque realizado. Limite restante:" + limiteRestante);
        }

        scanner.close();
    }
}
