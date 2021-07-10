package com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empresaServlet")
public class EmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	System.out.println("Cadastrando empresa: ");
	 	Banco banco = new Banco();
	 	
	 	PrintWriter out = response.getWriter();
	 	String nomeEmpresa = request.getParameter("nome");
	 	String dataEmpresa = request.getParameter("data");
	 	Date dataAbertura = null;
	 	try {
	 		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 		dataAbertura= sdf.parse(dataEmpresa);
	 	}catch(Exception e) {
	 		throw new ServletException(e);
	 	}
	 	
	 	Empresa emp = new Empresa();
	 	emp.setNome(nomeEmpresa);
	 	emp.setDataAbertura(dataAbertura);

	 	banco.adiciona(emp);
	 	request.setAttribute("empresa", emp.getNome());
	 	
	 	response.sendRedirect("listaEmpresa");

//	 	RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresa");
//
//	 	rd.forward(request, response);
	}

}