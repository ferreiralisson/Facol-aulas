<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.facol.bank.domain.Conta"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="xml" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar contas</title>
</head>
<body>
	Listando contas cadastradas:
	<br />
	
	<ul>
		<c:forEach items="${contas}" var="conta">
			<li>${conta.numeroConta}</li>
		</c:forEach>
	
	</ul>

</body>
</html>