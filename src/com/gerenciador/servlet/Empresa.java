package com.gerenciador.servlet;

import java.util.Date;

public class Empresa {
	
	private int id;
	private String nome;
	private Date dataAbertura = new Date();
	
	public Empresa() {
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Empresa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
}