<%@page import="java.util.List"%>
<%@page import="com.dao.Employee" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

 List<Employee> list = (List<Employee>)request.getAttribute("employees");

%>

<table>

<%
 for(Employee e :list)
 {
 %>
 <tr>
	 
	
	 <td><% out.println(e.getName()); %>  </td>
	 <td><% out.println(e.getEmpId()); %>  </td>
	 
	 <td><% out.println(e.getEmpSalary()); %></td>
</tr>	 
	 
	
<%  
 }


%>





</body>
</html>