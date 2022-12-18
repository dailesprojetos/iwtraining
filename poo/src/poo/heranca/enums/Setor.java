package poo.heranca.enums;

public enum Setor {

	ADMINISTRACAO("administracao"), CORPO_DISCENTE("corpo discente"), CORPO_DOSCENTE("corpo doscente");

	private String nome;

	Setor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
