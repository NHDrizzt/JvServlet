<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.gerenciador.servlet.Empresa" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<c:if test="${not empty empresa}">
		Empresa ${ empresa } cadastrado.
	</c:if>

	<c:if test="${empty empresa}">
		Vazio.
	</c:if>
	
	<br/>

	Lista de empresas: <br/>
	
	<ul>
		<c:forEach items="${lista}" var="empresa">
			<li> ${empresa.nome}</li> - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
			<a href="/gerenciador/mostraEmpresa?id=${empresa.id }"> editar </a>
			<a href="/gerenciador/removeEmpresa?id=${empresa.id }"> remove </a>
		</c:forEach>
	</ul>
	
	Aqui

</body>
</html>