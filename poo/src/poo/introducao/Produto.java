package poo.introducao;

public class Produto {
	
	/* atributos
	 * long código,string nome,double preço, int quantidade, string tipo
	 * métodos
	 * acrescimo: void receber uma porcentagem e modifica o preço
	 * desconto: void receber uma porcentagem e modifica o preço
	 * retornoPreco: double preco
	 * toString: String codigo + nome + tipo
	 */
	
	long codigo;
	String nome;
	double preco;
	int quantidade;
	String tipo;
	
	//Bloco de Inicialização
	{
		this.codigo = (long)( Math.random()*1000)+10;
	}
	
	public Produto(){
		
	}
	
	public Produto(String nome, double preco, int quantidade, String tipo) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.tipo = tipo;
	}

	public void acrescimo(int porcentagem) {
		double porcentagemAcrescimo = (this.preco * (double) porcentagem)/100;
		this.preco += porcentagemAcrescimo;
	}
	
	public void desconto(int porcentagem) {
		double porcentagemAcrescimo = (this.preco * porcentagem)/100.0;
		this.preco -= porcentagemAcrescimo;
	}
	
	public double retornaPreco() {
		return this.preco;
	}
	
	public int estoque() {
		return this.quantidade;
	}
	
	public double compra(int quantidade) {
		
		this.quantidade -= quantidade;
		double precoTotal = this.preco * quantidade;
		System.out.println(this.quantidade);
		return precoTotal;
	}
	
	
	@Override
	public String toString() {
		
		return this.codigo + " "+this.nome+" "+this.tipo;
		
	}

}
