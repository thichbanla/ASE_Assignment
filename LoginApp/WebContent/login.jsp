<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login App Using Struts2</title>
</head>
<body bgColor="lightblue">
<s:form action = "login" method="post">
	<s:textfield name="userName" label="User Name"/>
	<s:password name="password" label="Password"/>
	<s:submit value="Login" align="center"/>
</s:form> 
</body>
</html>
 