
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double ValorSaca = valor + 0.2;
		return super.saca(ValorSaca);
	}
//	@Override
//	 public void deposita(double valor) {
//		 super.saldo += valor;
//	 }
}
