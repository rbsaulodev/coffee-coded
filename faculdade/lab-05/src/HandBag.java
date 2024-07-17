import java.util.Scanner;

public class HandBag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ClassHandBag bolsa = new ClassHandBag();
        
        System.out.println("Digite a cor da bolsa: ");
        bolsa.cor = scan.nextLine();
        System.out.println("Digite a marca da bolsa: ");
        bolsa.marca = scan.nextLine();
        System.out.println("Digite o primeiro valor da bolsa: ");
        bolsa.valores[0] = scan.nextFloat();
        System.out.println("Digite o segundo valor da bolsa: ");
        bolsa.valores[1] = scan.nextFloat();
        System.out.println("Digite o terceiro valor da bolsa: ");
        bolsa.valores[2] = scan.nextFloat();
        
        scan.close();
        bolsa.status();
    }
}