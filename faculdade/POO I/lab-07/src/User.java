import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tshirt[] camisetas = new Tshirt[20];

        int i = 0;
        while (i < 20) {
            camisetas[i] = new Tshirt();
            System.out.println("Digite os dados da camiseta " + (i + 1) + ":");
            System.out.print("Código: ");
            camisetas[i].codigo = scanner.nextLine();
            System.out.print("Cor: ");
            camisetas[i].cor = scanner.nextLine();
            System.out.print("Marca: ");
            camisetas[i].marca = scanner.nextLine();
            System.out.print("Tipo de Tecido: ");
            camisetas[i].tipoTecido = scanner.nextLine();
            System.out.print("Tamanho: ");
            camisetas[i].tamanho = scanner.nextLine();
            System.out.print("Valor: ");
            camisetas[i].valor = scanner.nextDouble();
            System.out.print("Gola Polo (true/false): ");
            camisetas[i].golaPolo = scanner.nextBoolean();
            scanner.nextLine(); // Consumir a nova linha restante
            i++;
        }

        double valorTotal = 0.0;
        System.out.println("\nLista de camisetas:");
        for (i = 0; i < 20; i++) {
            System.out.println("Camiseta " + (i + 1) + ":");
            System.out.println("Código: " + camisetas[i].codigo);
            System.out.println("Cor: " + camisetas[i].cor);
            System.out.println("Marca: " + camisetas[i].marca);
            System.out.println("Tipo de Tecido: " + camisetas[i].tipoTecido);
            System.out.println("Tamanho: " + camisetas[i].tamanho);
            System.out.println("Valor: " + camisetas[i].valor);
            System.out.println("Gola Polo: " + (camisetas[i].golaPolo ? "Sim" : "Não"));
            System.out.println();
            valorTotal += camisetas[i].valor;
        }

        System.out.println("Valor total à vista: " + valorTotal);
        System.out.print("Digite o número de parcelas (1 a 12): ");
        int parcelas = scanner.nextInt();

        if (parcelas > 1) {
            double valorParcela = valorTotal * Math.pow(1 + 0.02, parcelas) / parcelas;
            System.out.println("Número de parcelas: " + parcelas);
            System.out.println("Valor de cada parcela: " + valorParcela);
        } else if (parcelas == 1) {
            System.out.println("Número de parcelas: 1");
            System.out.println("Valor de cada parcela: " + valorTotal);
        }else if (parcelas < 1) {
            System.out.println("Números de parcelas invalidas");
        }
        scanner.close();
    }
}