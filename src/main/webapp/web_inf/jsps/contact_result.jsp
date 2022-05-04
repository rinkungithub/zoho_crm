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

<h2>List of contacts</h2>
<table>
<tr>
  <th>id</th>
  <th>first Name</th>
  <th>last Name</th>
 <th>Email</th>
 <th>Lead source</th>
 <th>Mobile</th>
 <th>Billing</th>
 </tr>
 <c:forEach items="${contacts}" var="contact">
 <tr>
 <td>${lead.id}</td>
  <td><a href="getcontactById?id=${lead.id}">${contact.firstName}</a></td>
   <td>${contact.lastName}</td>
    <td>${contact.email}</td>
    <td>${contact.leadsource}</td>
    <td>${contact.mobile}</td>
<td><a href="getcontactById?id=${contact.id}">Generate Bill</a></td>
 
 </tr> 
 
 </c:forEach>

</table>


</body>
</html>