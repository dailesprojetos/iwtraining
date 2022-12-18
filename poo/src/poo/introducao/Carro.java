package poo.introducao;

public class Carro {

	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	private int quantidadeDePortas;
	private String motor;
	private double valor;
	private boolean novo;

	double velocidade = 0;

	public void acelerar() {
		this.velocidade += 10;
	}
	
	public void nitro(double velocidade) {
		this.velocidade += velocidade;
	}

	public void desacelarar() {
		this.velocidade -= 10;
		if (this.velocidade > 0) {
			this.velocidade = 0;
		}
	}

	public void parar() {
		this.velocidade = 0;
	}
	
	public void buzinar() {
		System.out.println("biiiiiiii");
	}
	
	public double velocimentro() {
		
		return this.velocidade;
		
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", ano=" + ano
				+ ", quantidadeDePortas=" + quantidadeDePortas + ", motor=" + motor + ", valor=" + valor
				+ ", velocidade=" + velocidade + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}

	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isNovo() {
		return novo;
	}

	public void setNovo(boolean novo) {
		this.novo = novo;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	
}
