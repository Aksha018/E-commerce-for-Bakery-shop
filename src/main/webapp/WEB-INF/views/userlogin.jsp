<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style type="text/css">
@import
	url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');
	
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}
::selection {
	color: #000;
	background: #fff;
}
nav {
	bottom:150px;
	background:#1b1b1b;
	width: 100%;
	padding: 10px 0;
	z-index: 12;
}
nav .menu {
	max-width: 1250px;
	display: flex;
	align-items: center;
	justify-content: space-between;
	padding: 0 20px;
}
.menu .logo a {
	text-decoration: none;
	color: #fff;
	font-size: 35px;
	font-weight: 600;
}
.menu ul {
	display: inline-flex;
}
.menu ul li {
	list-style: none;
	margin-left: 7px;
}
.menu ul li:first-child {
	margin-left: 0px;
}
.menu ul li a {
	text-decoration: none;
	color: #fff;
	font-size: 18px;
	font-weight: 500;
	padding: 8px 15px;
	border-radius: 5px;
	transition: all 0.3s ease;
}
.menu ul li a:hover {
	background: #fff;
	color: black;
}
.img {
	background: url('img3.jpg') no-repeat;
	width: 100%;
	height: 100vh;
	background-size: cover;
	background-position: center;
	position: relative;
}
.img::before {
	content: '';
	position: absolute;
	height: 100%;
	width: 100%;
	background: rgba(0, 0, 0, 0.4);
}
.center {
	position: absolute;
	top: 52%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 100%;
	padding: 0 20px;
	text-align: center;
}
.center .title {
	color: #fff;
	font-size: 55px;
	font-weight: 600;
}
.center .sub_title {
	color: #fff;
	font-size: 52px;
	font-weight: 600;
}
.center .btns {
	margin-top: 20px;
}
.center .btns button {
	height: 55px;
	width: 170px;
	border-radius: 5px;
	border: none;
	margin: 0 10px;
	border: 2px solid white;
	font-size: 20px;
	font-weight: 500;
	padding: 0 10px;
	cursor: pointer;
	outline: none;
	transition: all 0.3s ease;
}
.center .btns button:first-child {
	color: #fff;
	background: none;
}
.btns button:first-child:hover {
	background: white;
	color: black;
}
.center .btns button:last-child {
	background: white;
	color: black;
}
body {
	background: #456;
	background-image:
		url('https://thumbs.dreamstime.com/b/picture-frame-cakes-cookies-cakepops-cupcakes-copy-space-table-pie-tarts-studio-shot-brown-wooden-background-flat-lay-80957100.jpg');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}

h1 {
	color: #FAEBD7;
}

label {
	color: #FAEBD7;
	font-size: 1.3em;
	margin: 5px;
	font-weight: bold;
	cursor: pointer;
	transition: .5s ease-in-out;
	top:7px;
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
	height: 30px;
	width: 90%;
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
<body>
<nav>
		<div class="menu">
			<div class="logo">
				<a href="#">Bakery And Cakes</a>
			</div>
			<ul>
			<li><a href="/person/indexpage">Back</a></li>	
			</ul>
		</div>
	</nav>
	<h1 align="center" style="margin-top: 110px;">Login</h1>
	<div class="login-form">
		<form:form action="checkuserlogin" method="post"
			modelAttribute="uselogin">
			<div>
				<label for="email">Email</label>
				<form:input id="email" path="email"
					pattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
					title="Enter a valid email welcome03@gmail.com"
					placeholder="Enter a Email" required="true" />
			</div>
			<br>
			<div>
				<label for="password">Password</label>
				<form:input id="password" path="password" type="password" required="true" />
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