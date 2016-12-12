<%@page import="tn.enis.model.Expression"%>
<%@page import="tn.enis.model.ExpressionForm"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Second Player</title>
</head>
<body>
<h4>Player 2</h4>

The word 's length =<%=session.getAttribute("trueText").toString().length() %>
	<form action="ServletMain" method="get">
		<table>
			<tr>
				<td>Enter the proposition</td>
				<td><input type="text" name="textToTest" /></td>
				<td><input type="submit" value="test" /></td>
			</tr>
		</table>
	</form>

	<table border="1">
		<tr>
			<td>N°</td>
			<td>Value</td>
			<td>Resultt</td>
		</tr>
		<%
			if(session.getAttribute("expressionForm") !=null){
		ExpressionForm expressionForm=(ExpressionForm)session.getAttribute("expressionForm");
		if(expressionForm.getExpressionList().size()!=0) {
			ArrayList<Expression> listExpression=expressionForm.getExpressionList();
		 
		for(int i=0;i<listExpression.size();i++){
		%>

		<tr>
			<td><%=i+1%></td>
			<td><%=listExpression.get(i).getValue()%></td>
			<td><%=listExpression.get(i).getResult()%></td>

		</tr>
		<%
			}}}
		%>
	</table>
	<%
		if(session.getAttribute("status")!=null)
	{%>
	<%=session.getAttribute("status")%><br>
	
	The sollution is <B><%= session.getAttribute("trueText")%></B><br>
	
	<a href="Page2.jsp">Start again</a>
<%} %>
</body>
</html>