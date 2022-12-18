package poo.introducao;

public class TestaProduto {

	public static void main(String[] args) {
		
		Produto prod = new Produto("Carne",100.0,15,"Perecivel");
		
		System.out.println(prod.preco);
		
		prod.acrescimo(10);
		System.out.println(prod.preco);
		
		prod.desconto(5);
		System.out.println(prod.preco);
		
		prod.retornaPreco();
		
		System.out.println(prod);
		
		System.out.println("==============================");
		
		System.out.println(prod.compra(10));

	}

}
