<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html>

<head>
	<title>Create Account</title>
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>

<body>

	<h2>Create Account</h2>
	
	<html:errors />

	<html:form action="registerUser">
		<span class="textfield">Username *: </span><html:text property="username" /><p/>
		<span class="textfield">Password *: </span><html:password property="password" /><p/>
		<span class="textfield">Password (repeat for verification)*: </span><html:password property="passwordRepeated" /><p/>
		<span class="textfield">Firstname: </span><html:text property="firstname" /><p/>
		<span class="textfield">Lastname: </span><html:text property="lastname" /><p/>
		<span class="textfield">E-Mail: </span><html:text property="email" /><p/>
		<span class="textfield">E-Mail (repeat for verification): </span><html:text property="emailRepeated" /><p/>
		
		<html:submit>Register</html:submit>
	</html:form>
	
</body>

</html:html>
