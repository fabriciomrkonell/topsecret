package org.catolicasc.beer.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class Pedido {	

	private String numero;
	private Cliente cliente;
	private List<Beer> produtos;
	private float valorTotal;
	@XmlJavaTypeAdapter(AdaptadorDate.class)
	private Date dataDeCriacao = new Date();
	
	public Pedido() {
		super();	
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Beer> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Beer> produtos) {
		this.produtos = produtos;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
