import java.util.ArrayList;
import java.util.List;

public class InvestimentoConta extends Conta {
    private double saldoInvestido;
    private double taxaRetorno;
    private List<Double> extratoList;

    public InvestimentoConta(Cliente cliente, double saldoInvestido, double taxaRetorno, List<Double> extrato) {
        super(cliente);
        this.saldoInvestido = saldo;
        this.taxaRetorno = taxaRetorno;
        this.extratoList = new ArrayList<>();
    }

    public double getSaldoInvestido() {
        return saldoInvestido;
    }

    public double getTaxaRetorno() {
        return taxaRetorno;
    }

    public List<Double> getExtrato() {
        return extratoList;
    }

    public void Investir(double saldo){
        saldoInvestido += saldo;
        extratoList.add(-saldo);
    }

    public double calcularRetorno(int prazo) {
        double retorno = saldoInvestido * Math.pow(1 + taxaRetorno, prazo);
        return retorno;
    }

    public double resgatarInvestimento() {
        double saldoResgatado = saldoInvestido;
        saldoInvestido = 0;
        return saldoResgatado;
    } 

    @Override
    public void imprimirExtrato() {
        System.out.println(extratoList);
    }
}
