<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>List of bills</h2>
<table>
<tr>
  <th>id</th>
  <th>first Name</th>
  <th>last Name</th>
 <th>email</th>
 
 <th>Mobile</th>
  <th>productName</th>
   <th>amount</th>
 
 </tr>
 <c:forEach items="${bills}" var="bills">
 <tr>
 <td>${bills.id}</td>
  <td>${bills.firstName}</td>
   <td>${bills.lastName}</td>
    <td>${bills.email}</td>
    <td>${bills.mobile}</td>
    <td>${bills.productName}</td>
    <td>${bills.amount}</td>

 
 </tr> 

 
 </c:forEach>
 

</table>

${msg}
</body>
</html>