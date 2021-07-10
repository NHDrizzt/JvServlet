<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<c:url value="/empresaServlet" var="linkEmpresaServlet"/>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="${linkEmpresaServlet}" method="post">
	
	Nome: <input type="text" name="nome"></input>
	Data: <input type="text" name="data"></input>
	<input type="submit"></input>
	</form>

</body>
</html>