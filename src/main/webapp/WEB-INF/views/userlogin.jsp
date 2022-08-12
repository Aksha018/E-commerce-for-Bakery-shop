<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up</title>
<style type="text/css">
body {
	background: #456;
	background-image:
		url('https://thumbs.dreamstime.com/b/picture-frame-cakes-cookies-cakepops-cupcakes-copy-space-table-pie-tarts-studio-shot-brown-wooden-background-flat-lay-80957100.jpg');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}

h1 {
color:	#ffff ;
}

label {
	color: 	#ffff;
	font-size: 1.3em;
	margin: 5px;
	font-weight: bold;
	cursor: pointer;
	transition: .5s ease-in-out;
}
#email {
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
	border: none;
	border-radius: 3px;
	padding-left: 8px;
}
</style>
</head>
<body>
	<h1 style="text-align:center; margin-top:5%">Login</h1>
	<div class="box" style="text-align:center; margin-top:5%">
		<form:form action="personlogin" method="post" modelAttribute="uselogin">
		<div>
				<label for="email">Email</label>
				<form:input id="email" path="email"/>
			</div>
			<div>
				<label for="password">Password</label>
				<form:input id="password" path="password" type="password" />
			</div>
			<form:button id="log">Sign Up</form:button>
		</form:form>
	</div>
	</body>
</html>