class Funcionario {
    String nome;
    String rg;
    String cpf;
    String cargo;
    double salario;

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println();
    }
}
