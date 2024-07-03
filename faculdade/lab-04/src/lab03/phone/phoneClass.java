package lab03.phone;

public class phoneClass {
    String cor;
    String marca;
    String modelo;
    double valor;
    int ram;
    int memoriaInterna;
    int pixelCameraFrontal;
    int pixelCameraTraseira;
    double tamanhoTela;
    String sistemaOperacional;
    boolean temCameraFrontalOuNao;

    void calcularParcelas() {
        double parcelas = 12; 
        double juros = 0.018;
        double valorTotalComJuros = this.valor * juros * parcelas;
        double valorUnitarioParcela = valorTotalComJuros/parcelas;

        System.out.println("O valor total com juros: " + valorTotalComJuros);
        System.out.println("O valo unitario de cada parcelas: " + valorUnitarioParcela);
    }
}
