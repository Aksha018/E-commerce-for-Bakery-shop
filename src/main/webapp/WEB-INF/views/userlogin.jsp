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
	color: #ffff;
}

label {
	color: #ffff;
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
	border-radius: 3px;
	padding-left: 8px;
}

#personType {
	width: 250px;
	height: 30px;
	border-color: black;
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
.login-form {
    width: 400px;
    top: 400px;
    left: 700px;
    transform: translate(-50%, -50%);
    position: absolute;
    color: #00000;
}
                                                 
.login-form h1 {
    font-size: 40px;
    text-align: center;
    text-transform: uppercase;
    margin: 30px 0;
}

.login-form label {
    font-size: 20px;
    margin: 15px 0;
}

.login-form input {
    height:30px;
    width:90%;
}
.login-form button {
    font-size: 18px;
    font-weight: bold;
    margin: 20px 0;
    padding: 10px 15px;
    border-radius: 5px;
    border: 0;
}
</style>
</head>
<body style="margin-top: 200px">
	<h1 align="center">Login</h1>
	<div class="login-form">
			<form:form action="checkuserlogin" method="post"
				modelAttribute="uselogin">
				<div>
					<label for="email">Email</label>
					<form:input id="email" path="email" />
				</div>
				<br>
				<div>
					<label for="password">Password</label>
					<form:input id="password" path="password" type="password" />
				</div>

				<br>
				<div>
					<label for="personType">Person Type</label>
					<form:select path="personType">
						<form:errors path="personType" />
						<form:option value="user">User</form:option>
						<form:option value="admin">Admin</form:option>
					</form:select>
				</div>
				<form:button id="log">Login</form:button>
			</form:form>
	</div>
</body>
</html>