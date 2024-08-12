class Vendedor extends Funcionario {
    void calcularSalario(double salarioMinimo, double valorVendas) {
        cargo = "Vendedor";
        salario = salarioMinimo + (0.10 * valorVendas);
    }
}

class AuxiliarAdministrativo extends Funcionario {
    void calcularSalario(double salarioMinimo) {
        cargo = "Auxiliar Administrativo";
        salario = salarioMinimo;
    }
}

class SupervisorAdministrativo extends Funcionario {
    void calcularSalario(double salarioMinimo) {
        cargo = "Supervisor Administrativo";
        salario = 4 * salarioMinimo;
    }
}

class GerenteAdministrativo extends Funcionario {
    void calcularSalario(double salarioMinimo) {
        cargo = "Gerente Administrativo";
        salario = 7 * salarioMinimo;
    }
}
