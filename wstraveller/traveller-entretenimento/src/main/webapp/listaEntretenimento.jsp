<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List, br.com.fiap.traveller.entretenimento.servlet.Entretenimento" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<c:forEach items="${entretenimentos}" var ="entretenimento">
			 <li>${entrentenimento.nome}</li>
		
		</c:forEach>	 	
	</ul>
</body>
</html>