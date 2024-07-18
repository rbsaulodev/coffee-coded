import java.util.Scanner;

public class HandBag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ClassHandBag bolsa = new ClassHandBag();

        int i = 1;

        while (i < 3) {
            System.out.println("Digite a cor da bolsa número " + i + ": ");
            bolsa.cor[i] = scan.nextLine();

            System.out.println("Digite a marca da bolsa número " + i + ": ");
            bolsa.marca[i] = scan.nextLine();

            System.out.println("Digite o material da bolsa número " + i + ": ");
            bolsa.material[i] = scan.nextLine();

            System.out.println("A bolsa número " + i + " tem zíper? (true/false): ");
            bolsa.ziper[i] = scan.nextBoolean();
            scan.nextLine(); // Limpa o buffer

            System.out.println("Digite o valor da bolsa " + i + ": ");
            bolsa.valor[i] = scan.nextFloat();
            scan.nextLine(); // Limpa o buffer
            i++;
        }

        scan.close();
        bolsa.status();
    }
}