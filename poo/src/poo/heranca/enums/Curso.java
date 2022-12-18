package poo.heranca.enums;

public enum Curso {

	JAVA("java"), JAVASCRIPT("javascript"), PYTHON("python");

	private String nome;

	Curso(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
