package poo.inteface;

public interface GerenciadorDeNotas {

	public void atribuirNota(int indice, double nota);
	public double calcularMedia();
	public String verificarAprovacao(double media);
	
}
