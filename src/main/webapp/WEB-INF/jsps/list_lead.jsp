<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list all leads</title>
</head>
<body>
<h2>My World...</h2>
<table>
<tr>
<th>FirstName</th>
<th>Actions</th>
</tr>
<c:forEach var="lead" items="${leads }" >
<tr>
<td>${lead.firstname }
<td>
<a href="delete?id=${lead.id }">Delete</a>
<a href="update?id=${lead.id }">Update</a>
</td>
</tr>
</c:forEach>

</table>
</body>
</html>