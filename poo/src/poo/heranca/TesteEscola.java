package poo.heranca;

import java.time.LocalDate;
import java.time.Month;

import poo.heranca.enums.Curso;
import poo.heranca.enums.Setor;

public class TesteEscola {

	public static void main(String[] args) {

		Aluno a01 = new Aluno(12354L,"Roberto",LocalDate.of(1995, Month.JUNE, 5),"Meireles",Curso.JAVA);
		System.out.println(a01);
		
		Funcionario f01 = new Funcionario(34564L,"Mario", LocalDate.of(1995, Month.JUNE, 5), "Aldeota", Setor.ADMINISTRACAO, "supervisor", 1500.0);
		System.out.println(f01);
		
		a01.atribuirNota(1, 2);
		a01.atribuirNota(2, 7);
		a01.atribuirNota(3, 6);
		
		double media = a01.calcularMedia();
		System.out.println(media);
		
		String resultado = a01.verificarAprovacao(media);
		
		System.out.println(resultado);
		
	}

}
