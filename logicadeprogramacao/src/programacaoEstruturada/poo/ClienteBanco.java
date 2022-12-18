package programacaoEstruturada.poo;

public class ClienteBanco {

	Long codigo;
	String nome;
	String dataDeNascimento;
	private double saldo;
	
	public ClienteBanco(Long codigo, String nome, String dataDeNascimento, double saldo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.saldo = saldo;
	}

	public void verSaldo() {
		System.out.println("Cliente: "+this.nome+" - Saldo Atual: "+this.saldo);
	}

	public void sacar(double valor) {
		if (this.saldo <= 0) {
			System.out.println("Conta sem saldo para saque!");
		} else {
			this.saldo -= valor;
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void transferir(ClienteBanco conta, double valor) {
		this.sacar(valor);
		conta.depositar(valor);
	}

}
