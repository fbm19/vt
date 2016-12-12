<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First player</title>
</head>
<body>
<h4>Player 1</h4>
<form action="FirstServlet" method="get">
<table>

<tr>
<td>Enter the secret word</td>
<td><input type="password" name="trueText"/></td>
<td><input type="submit" value="Start the challenge"/></td>
</tr>
</table>
</form>
</body>
</html>