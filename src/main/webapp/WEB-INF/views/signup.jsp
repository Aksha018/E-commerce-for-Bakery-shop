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
	display: flex;
	margin: 5px;
	font-weight: bold;
	cursor: pointer;
	transition: .5s ease-in-out;
}

#personId {
	width: 250px;
	height: 30px;
	border-color: black;
	border-radius: 3px;
	padding-left: 8px;
}

#personName {
	width: 250px;
	height: 30px;
	border-color: black;
	border-radius: 3px;
	padding-left: 8px;
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

#mobileNumber {
	width: 250px;
	height: 30px;
	border-color: black;
	border: none;
	border-radius: 3px;
	padding-left: 8px;
}

#personType {
	width: 250px;
	height: 30px;
	border-color: black;
	border: none;
	border-radius: 3px;
	padding-left: 8px;
}

#log {
	width: 250px;
	height: 30px;
	border-color: black;
	border: none;
	border-radius: 14px;
	padding-left: 10px;
	color: blue;
}

.box {
	width: 400px;
	height: 490px;
	overflow: hidden;
	border-radius: 10px;
	box-shadow: 5px 20px 50px #000;
	margin: auto;
	padding: 10px;
	text-align: center;
}
</style>
</head>
<body>
	<h1 align="center">Sign Up</h1>
	<div class="box">
		<form:form action="addperson" method="post" modelAttribute="add">
			<div>
				<label for="personName">Person Name</label>
				<form:input id="personName" path="personName"/>
			</div>
			<div>
				<label for="email">Email</label>
				<form:input id="email" path="email"/>
			</div>
			<div>
				<label for="password">Password</label>
				<form:input id="password" path="password" type="password" />
			</div>
			<div>
				<label for="mobileNumber">Mobile Number</label>
				<form:input id="mobileNumber" path="mobileNumber"/>
			</div>
			<div>
				<label for="personType">Person Type</label>
				<form:select path="personType">
					<form:errors path="personType" />
					<form:option value="user">User</form:option>
					<form:option value="user">Admin</form:option>
				</form:select>
			</div>
			<div>
				<br>
			</div>
			<form:button id="log">Sign Up</form:button>
		</form:form>
	</div>
</body>
</html>