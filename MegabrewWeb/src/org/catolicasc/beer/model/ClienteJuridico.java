package org.catolicasc.beer.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

public class ClienteJuridico extends Cliente {
	private String cnpj;

	public ClienteJuridico() {
		super(); 
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public ClienteJuridico(String cnpj) {
		super();
		this.cnpj = cnpj;
	}
	
	@XmlEnum
	@XmlType(name = "formato")
	public enum FormatoArquivo {
		
		@XmlEnumValue("bares")
		BAR,
		
		@XmlEnumValue("pubs")
		PUB,
		
		@XmlEnumValue("restaurantes")
		RESTAURANTE,
		
		@XmlEnumValue("lanchonetes")
		LANCHONETE,	
	}

	
	 
}
