package lab03.phone;

import java.util.Scanner;

public class userPhone {
    public static void main(String[] args) {
        phoneClass galaxy = new phoneClass();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a cor do seu celular: ");
        galaxy.cor = entrada.next();
        System.out.println("Digite a marca do seu celular: ");
        galaxy.marca = entrada.next();
        System.out.println("Digite o modelo do seu celular: ");
        galaxy.modelo = entrada.next();
        System.out.println("Digite o valor do seu celular: ");
        galaxy.valor = entrada.nextFloat();
        System.out.println("Digite a memoria RAM do seu celular: ");
        galaxy.ram = entrada.nextInt();
        System.out.println("DIgite a memoria Interna do seu ceular: ");
        galaxy.memoriaInterna = entrada.nextInt();
        System.out.println("Digite quantos pixel tem a sua camera frontal: ");
        galaxy.pixelCameraFrontal = entrada.nextInt();
        System.out.println("Digite quantos pixels tem a sua camera traseira: ");
        galaxy.pixelCameraTraseira = entrada.nextInt();
        System.out.println("Digite o tamanho da tela do seu ceular: ");
        galaxy.tamanhoTela = entrada.nextFloat();
        System.out.println("Digite qual SO é do seu telefone: ");
        galaxy.sistemaOperacional = entrada.next();
        System.out.println("Seu telefone tem camera frontal? (Responda com true ou false): ");
        galaxy.temCameraFrontalOuNao = entrada.nextBoolean();

        entrada.close();

        galaxy.calcularParcelas();
    }
}
