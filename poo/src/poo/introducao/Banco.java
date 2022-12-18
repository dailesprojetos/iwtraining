package poo.introducao;


public class Banco {

	public static void main(String[] args) {
		
		Cliente a = new Cliente("Francisco","01/01/1990",500);
		Cliente b = new Cliente("Marcos","01/01/1978",800);
		
		System.out.println("============Saldos Iniciais===============");
		a.verSaldo();
		b.verSaldo();
		
		a.deposito(100);
		b.deposito(50);
		
		a.saque(200);
		b.saque(300);
		
		a.transferir(b, 25);
		
		System.out.println("============Saldos Finais===============");
		a.verSaldo();
		b.verSaldo();
		
	}

}
