<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
<h2>Create | Lead</h2>
<form action="saveLead" method="post">
<pre>
FirstName<input type="text" name="firstname"/>
<input type="submit" value="save"/>
</pre>
</form>
${msg }
</body>
</html>