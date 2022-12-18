package poo.heranca;

import java.time.LocalDate;

import poo.heranca.enums.Setor;
import poo.inteface.BonusEmFolha;
import poo.inteface.DescontoEmFolha;

public class Funcionario extends Pessoa implements DescontoEmFolha, BonusEmFolha{

	private Long matricula;
	private Setor setor;
	private String funcao;
	private Double salario;
	
	public Funcionario(Long matricula,String nome, LocalDate dataDeNascimento, String endereco, Setor setor,
			String funcao, Double salario) {
		super(nome, dataDeNascimento, endereco);
		this.matricula = matricula;
		this.setor = setor;
		this.funcao = funcao;
		this.salario = salario;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Funcionario [matricula: " + matricula + " nome: " + getNome() + " data de nascimento: "
				+ getDataDeNascimento() + " endereço: " + getEndereco() + " setor: " + setor.getNome() + " funcao: " + funcao+" salario: " + salario+"]";
	}
	
	@Override
	public double fgts(double salario) {
		// TODO Auto-generated method stub
		return salario * 0.08;
	}

	@Override
	public double valeAlimentacao(double salario) {
		return salario * 0.1;
	}

	@Override
	public double valeTransporte(double salario) {
		// TODO Auto-generated method stub
		return salario * 0.1;
	}
	
	@Override
	public double comissao(double salario) {
		boolean condicao = true;
		return condicao? salario * 0.15 : 0;
	}

	@Override
	public double periculosidade(double salario) {
		return salario * 0.3;
	}

}
