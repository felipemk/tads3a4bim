package br.univel.modelo;

import java.io.Serializable;

public class Professor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8723141551228941367L;
	
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Professor [matricula=" + matricula + ", nome=" + nome + "]";
	}

}
