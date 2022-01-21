abstract class Conta{
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta: " + this.numero);
		Conta.total++;
	}
		
	public void deposita(double valor) {
			this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
		this.saldo -= valor;
		return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta destino) {
		if(this.saca(valor)) {
			//this.saldo -= valor; //poderia ser do dois jeitos.
			destino.deposita(valor);
			return true;
		}
			return false;
	}
	
	public double getSaldo() {	//Mostrar o saldo chamado
		return this.saldo;
	}
	
	public int getNumero() {	//Mostrar o numero chamado
		return this.numero;
	}
	
	public void setNumero(int numero) {	//Adiciona um numero
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {	//Mostrar a agencia chamada
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {	//Adiciona numero da agencia
		if(agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
}