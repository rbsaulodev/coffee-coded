import java.util.Scanner;

public class HandBag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ClassHandBagEx5 bolsa1 = new ClassHandBagEx5();
        ClassHandBagEx5 bolsa2 = new ClassHandBagEx5();
        ClassHandBagEx5 bolsa3 = new ClassHandBagEx5();

        System.out.println("Digite a cor da primeira bolsa: ");
        bolsa1.cor = scan.nextLine();
        System.out.println("Digite a cor da segunda bolsa: ");
        bolsa2.cor = scan.nextLine();
        System.out.println("Digite a cor da segunda bolsa: ");
        bolsa3.cor = scan.nextLine();
        
        System.out.println("Digite a marca da primeira bolsa: ");
        bolsa1.marca = scan.nextLine();
        System.out.println("Digite a marca da segunda bolsa: ");
        bolsa2.marca = scan.nextLine();
        System.out.println("Digite a marca da segunda bolsa: ");
        bolsa3.marca = scan.nextLine();

        System.out.println("Digite a material da primeira bolsa: ");
        bolsa1.material = scan.nextLine();
        System.out.println("Digite a material da segunda bolsa: ");
        bolsa2.material = scan.nextLine();
        System.out.println("Digite a cor da segunda bolsa: ");
        bolsa3.material = scan.nextLine();

        System.out.println("Tem ziper (true/false): ");
        bolsa1.ziper = scan.nextBoolean();
        System.out.println("Tem ziper (true/false): ");
        bolsa2.ziper = scan.nextBoolean();
        System.out.println("Tem ziper (true/false): ");
        bolsa3.ziper = scan.nextBoolean();

        System.out.println("Digite o valor da primeira bolsa: ");
        bolsa1.valor = scan.nextFloat();
        System.out.println("Digite o valor da primeira bolsa: ");
        bolsa2.valor = scan.nextFloat();
        System.out.println("Digite o valor da primeira bolsa: ");
        bolsa3.valor = scan.nextFloat();

        scan.close();
        bolsa1.status();
        bolsa2.status();
        bolsa3.status();
    }
}