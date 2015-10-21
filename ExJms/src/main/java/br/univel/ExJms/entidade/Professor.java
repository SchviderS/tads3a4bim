package br.univel.ExJms.entidade;

import java.io.Serializable;

public class Professor implements Serializable {
	
	private String nome;
	private Long matricula;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(long l) {
		this.matricula = l;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
	}
	
	
}
