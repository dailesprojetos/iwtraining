package programacaoEstruturada.poo;

public class Banco {

	public static void main(String[] args) {
		
		ClienteBanco a = new ClienteBanco(1L,"Francisco","01/01/1990",500);
		ClienteBanco b = new ClienteBanco(10L,"Marcos","01/01/1978",800);
		
		System.out.println("============Saldos Iniciais===============");
		a.verSaldo();
		b.verSaldo();
		
		a.depositar(100);
		b.depositar(50);
		
		a.sacar(200);
		b.sacar(300);
		
		a.transferir(b, 25);
		
		System.out.println("============Saldos Finais===============");
		a.verSaldo();
		b.verSaldo();
		
	}

}
