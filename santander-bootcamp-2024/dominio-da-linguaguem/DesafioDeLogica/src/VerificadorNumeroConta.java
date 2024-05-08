import java.util.Scanner; 
public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        try {
            String numeroConta = scanner.next();
            VerificaNumeroConta(numeroConta);
            System.out.println("Numero de conta valido."); 
        }

        catch (IllegalArgumentException exception) {
            System.out.println("Erro: " + exception.getMessage()); 
        }
        
        finally{
            scanner.close();
        }
        
    }
    public static void VerificaNumeroConta(String numeroConta){
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}

