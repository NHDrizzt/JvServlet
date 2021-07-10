<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>     

<c:url value="/alteraEmpresa" var="linkEmpresaServlet"/>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="${linkEmpresaServlet}" method="post">
	
	Nome: <input type="text" name="nome" value="${empresa.nome }"></input>
	Data: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>"></input>
	<input type="hidden" name="id" value="${empresa.id}" />
	<input type="submit"></input>
	</form>

</body>
</html>