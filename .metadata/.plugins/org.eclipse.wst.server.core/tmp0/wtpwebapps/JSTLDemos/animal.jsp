<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="animal_name" value="${param.animal }"></c:set>
<c:choose>
<c:when test="${animal_name =='TIGER' }">
it is a tiger
</c:when>
<c:when test="${animal_name=='LION' }">
it is a lion
</c:when>
<c:when test="${animal_name=='ELEPHANT' }">
it is a elephant
</c:when>
<c:otherwise>
invalid choice
</c:otherwise>
</c:choose>









</body>
</html>