package br.univel.modelo;

import java.io.Serializable;

public class Aluno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5661248245272540585L;
	private long matricula;
	private String nome;

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + "]";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
