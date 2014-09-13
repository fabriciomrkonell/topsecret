package org.catolicasc.beer.model;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Stateless
public class Beer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String descrição;
	private String unidademedida;
	private String volume;
	private int quantidade;
	private float preço;
	
	public Beer(Long id, String nome, String descrição, String unidademedida,
			String volume, int quantidade, float preço) {
		super();
		this.id = id;
		this.nome = nome;
		this.descrição = descrição;
		this.unidademedida = unidademedida;
		this.volume = volume;
		this.quantidade = quantidade;
		this.preço = preço;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Beer() {
		super();		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public String getUnidademedida() {
		return unidademedida;
	}
	public void setUnidademedida(String unidademedida) {
		this.unidademedida = unidademedida;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getPreço() {
		return preço;
	}
	public void setPreço(float preço) {
		this.preço = preço;
	}
	
	
}
