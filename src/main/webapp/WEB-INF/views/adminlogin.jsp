<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
body {
	background: #456;
	background-image:
		url('');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}
h1 {
	color: #FFFFFF;
}

label {
	color: #FFFFFF;
	font-size: 1.3em;
	display: flex;
	margin: 5px;
	font-weight: bold;
	cursor: pointer;
	transition: .5s ease-in-out;
}

#username {
	width: 250px;
	height: 30px;
	border-color: black;
	border-radius: 3px;
	padding-left: 8px;
}

#password {
	width: 250px;
	height: 30px;
	border-color: black;
	border-radius: 3px;
	padding-left: 8px;
}
</style>
</head>
<body>
	<h1 align="center">Sign Up</h1>
	<div class="box">
		<form:form action="addperson" method="post" modelAttribute="addperson">
			<div>
				<label for="username">UserName</label>
				<form:input id="username" path="username" />
			</div>
			<div>
				<label for="password">Password</label>
				<form:input id="password" path="password" />
			</div>
			<form:button id="log">Sign Up</form:button>
		</form:form>
	</div>
</body>
</html>