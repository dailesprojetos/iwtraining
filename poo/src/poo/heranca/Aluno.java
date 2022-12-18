package poo.heranca;

import java.time.LocalDate;

import poo.heranca.enums.Curso;
import poo.inteface.GerenciadorDeNotas;

public class Aluno extends Pessoa implements GerenciadorDeNotas{

	private Long matricula;
	private Curso curso;
	private double notas[] = new double[3];
	
	public Aluno(Long matricula,String nome,LocalDate dataDeNascimento,String endereco,Curso curso) {
		super(nome,dataDeNascimento,endereco);
		this.matricula = matricula;
		this.curso = curso;
		
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso.getNome();
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [matricula: " + matricula + " nome: " + getNome() + " data de nascimento: "
				+ getDataDeNascimento() + " endereço: " + getEndereco() + " curso: " + curso.getNome() + "]";
	}

	@Override
	public void atribuirNota(int indice, double nota) {
		
		this.notas[indice-1] = nota;
		
	}

	@Override
	public double calcularMedia() {

		double media = 0;
		for (double nota : notas) {
			media+=nota;
		}
		return media/notas.length;
		
	}

	@Override
	public String verificarAprovacao(double media) {
		return media>=7 ?"Aprovado" : "Reprovado";
	}

}
