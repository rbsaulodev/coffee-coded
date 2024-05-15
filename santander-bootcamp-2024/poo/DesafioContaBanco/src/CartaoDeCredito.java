import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito extends Conta{
    private double saldoAtual;
    private int limite;
    private double faturaAtual;
    private List<Double> extratoList;

    public CartaoDeCredito(Cliente cliente, double saldoAtual, int limite, double faturaAtual, List<Double> extratoList) {
        super(cliente);
        this.saldoAtual = saldoAtual;
        this.limite = limite;
        this.faturaAtual = faturaAtual;
        this.extratoList = new ArrayList<>();
    }

    public double consultarSaldo(){
        return saldoAtual;
    }

    public int consultarLimite(){
        return limite;
    }

    public void consultarExtrato(){
        System.out.println(extratoList);
    }

    public void realizarCompra(double valor) {
        if (valor <= saldoAtual + limite) {
            saldoAtual -= valor;
            faturaAtual += valor;
            extratoList.add(-valor);
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar a compra!");
        }
    }

    public void pagarFatura(double valor) {
        if (valor <= faturaAtual) {
            faturaAtual -= valor;
            System.out.println("Fatura paga com sucesso!");
        } else {
            System.out.println("Valor excede o saldo da fatura!");
        }
    }

    @Override
    public void imprimirExtrato() {
        throw new UnsupportedOperationException("Unimplemented method 'imprimirExtrato'");
    }
}
