public class Main {
	public static void main(String[] args) {
		Cliente Saulo = new Cliente();
		Saulo.setNome("Saulo");
		
		Conta cc = new ContaCorrente(Saulo);
		Conta poupanca = new ContaPoupanca(Saulo);
        InvestimentoConta SauloInvestimento = new InvestimentoConta(Saulo, 1000, 100, null);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

        SauloInvestimento.Investir(100);
        SauloInvestimento.imprimirExtrato();
	}

}