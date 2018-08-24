<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="e" class="com.pojos.Employee" scope ="application"></jsp:useBean>
<jsp:setProperty property="name" name="e"/>
<jsp:setProperty property="empId" name="e"/>
<jsp:setProperty property="empSalary" name="e"/>

NAME:::: ${e.name }
EMPLOYEE ID :::: ${e.empID} 
EMPLOYEE SALARY :::: ${e.empSalary }


<table>
<c:forEach items="${e }" var="emp">
<tr>
<td>${emp.empId }</td>
<td>${emp.empSalary }</td>
<td>${emp.name }</td>
</tr>
</c:forEach>




</table>

</body>
</html>