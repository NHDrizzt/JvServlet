package com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listaEmpresa")
public class ListaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	String a;
	Banco banco = new Banco();
	List<Empresa> list = banco.getEmpresas();

	RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresa.jsp");
	request.setAttribute("lista", list);
	rd.forward(request, response);
	}

}