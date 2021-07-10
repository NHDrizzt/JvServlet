package com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> list = new ArrayList<>();
	private static Integer IdGen =  1;
	
	static {
		Empresa emp = new Empresa();
		Banco banco = new Banco();
		Empresa emp2 = new Empresa();
		emp.setId(IdGen++);
		emp.setNome("KTC");
		banco.adiciona(emp);
		emp.setId(IdGen++);
		emp2.setNome("Trick");
		banco.adiciona(emp2);

	}
	
	public void adiciona(Empresa emp) {
		emp.setId(Banco.IdGen++);
		Banco.list.add(emp);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.list;
	}

	@Override
	public String toString() {
		return "Banco []";
	}

	public void remove(Integer id) {
		Iterator<Empresa> it = list.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaId(Integer id) {
		for (Empresa empresa : list) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	
	
}