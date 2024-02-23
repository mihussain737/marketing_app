<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Lead here</title>
</head>
<body>

	<h2>Update your Lead Here</h2>
	<pre>
<form action="/updateLead" method="post">

<input type="hidden" name="id" value="${lead.id}" />
FirstName<input type="text" name="firstName" value="${lead.firstName}" />
LastName<input type="text" name="lastName" value="${lead.lastName}" />
Email<input type="text" name="email" value="${lead.email}" />
Mobile<input type="text" name="mobile" value="${lead.mobile}" />
<input type="submit" value="update" />



	</pre>
	</form>
</body>
</html>