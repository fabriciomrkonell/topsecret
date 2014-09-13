package org.catolicasc.beer.model;


public class ClienteFisico extends Cliente {

	private String cpf;

	public ClienteFisico() {
		super();		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ClienteFisico(String cpf) {
		super();
		this.cpf = cpf;
	}
	
}
