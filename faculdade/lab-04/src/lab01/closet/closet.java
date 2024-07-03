package lab01.closet;

import java.util.Scanner;

public class closet {
    
    public static void main(String[] args) {
        closetClass gr1 = new closetClass();   
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a marca do guarda roupa: ");
        gr1.marca = entrada.next();
        System.out.print("Digite o nome da madeira do guarda roupa: ");
        gr1.madeira = entrada.next();
        System.out.print("Digite a cor do guarda roupa: ");
        gr1.cor = entrada.next();
        System.out.print("Digite o valor do guarda roupa: ");
        gr1.valor = entrada.nextFloat();
        System.out.print("Tem espelho no guarda roupa? (responda com: true ou false): ");
        gr1.espelho = entrada.nextBoolean();

        entrada.close();

        gr1.BooleanEspelho();
        gr1.Status();
    }
}
