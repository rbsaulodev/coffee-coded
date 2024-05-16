public class Main {
	public static void main(String[] args) {
		Cliente saulo = new Cliente();
		saulo.setNome("Saulo");
		
		Conta cc = new ContaCorrente(saulo);
		Conta poupanca = new ContaPoupanca(saulo);
        InvestimentoConta SauloInvestimento = new InvestimentoConta(saulo, 1000, 100, null);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

        SauloInvestimento.Investir(100);
        SauloInvestimento.imprimirExtrato();
	}

}