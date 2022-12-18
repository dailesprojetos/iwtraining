package poo.introducao;

public class Cliente {

	long codigo;
	String nome;
	String dataDeNascimento;
	private double saldo;

	// Bloco de Inicialização
	{
		this.codigo = (long) (Math.random() * 1000) + 10;
	}

	public Cliente(String nome, String dataDeNascimento, double saldo) {
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.saldo = saldo;
	}

	public void verSaldo() {
		System.out.println("Cliente: " + this.nome + " - Saldo Atual: " + this.saldo);
	}

	public void saque(double valor) {
		if (this.saldo <= 0) {
			System.out.println("Conta sem saldo para saque!");
		} else {
			this.saldo -= valor;
		}
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public void transferir(Cliente cliente, double valor) {
		this.saque(valor);
		cliente.deposito(valor);
	}

}
