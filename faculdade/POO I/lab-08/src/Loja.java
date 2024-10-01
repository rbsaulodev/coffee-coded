import java.util.Scanner;
public class Loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        Funcionario[] funcionarios = new Funcionario[11];

        int i = 0;
        while (i < 5) {
            funcionarios[i] = new Vendedor();
            System.out.print("Digite o nome do vendedor " + (i + 1) + ": ");
            funcionarios[i].nome = scanner.next();
            System.out.print("Digite o RG do vendedor: ");
            funcionarios[i].rg = scanner.next();
            System.out.print("Digite o CPF do vendedor: ");
            funcionarios[i].cpf = scanner.next();
            System.out.print("Digite o valor das vendas do vendedor: ");
            double valorVendas = scanner.nextDouble();
            ((Vendedor) funcionarios[i]).calcularSalario(salarioMinimo, valorVendas);
            i++;
        }

        while (i < 9) {
            funcionarios[i] = new AuxiliarAdministrativo();
            System.out.print("Digite o nome do auxiliar administrativo " + (i - 4) + ": ");
            funcionarios[i].nome = scanner.next();
            System.out.print("Digite o RG do auxiliar administrativo: ");
            funcionarios[i].rg = scanner.next();
            System.out.print("Digite o CPF do auxiliar administrativo: ");
            funcionarios[i].cpf = scanner.next();
            ((AuxiliarAdministrativo) funcionarios[i]).calcularSalario(salarioMinimo);
            i++;
        }

        funcionarios[i] = new SupervisorAdministrativo();
        System.out.print("Digite o nome do supervisor administrativo: ");
        funcionarios[i].nome = scanner.next();
        System.out.print("Digite o RG do supervisor administrativo: ");
        funcionarios[i].rg = scanner.next();
        System.out.print("Digite o CPF do supervisor administrativo: ");
        funcionarios[i].cpf = scanner.next();
        ((SupervisorAdministrativo) funcionarios[i]).calcularSalario(salarioMinimo);
        i++;

        funcionarios[i] = new GerenteAdministrativo();
        System.out.print("Digite o nome do gerente administrativo: ");
        funcionarios[i].nome = scanner.next();
        System.out.print("Digite o RG do gerente administrativo: ");
        funcionarios[i].rg = scanner.next();
        System.out.print("Digite o CPF do gerente administrativo: ");
        funcionarios[i].cpf = scanner.next();
        ((GerenteAdministrativo) funcionarios[i]).calcularSalario(salarioMinimo);

        System.out.println("\nLista de Pagamento:");
        i = 0;
        while (i < funcionarios.length) {
            funcionarios[i].exibirDados();
            i++;
        }

        scanner.close();
    }
}