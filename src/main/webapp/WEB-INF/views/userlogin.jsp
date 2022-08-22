<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
<%@include file="/WEB-INF/views/css/uselogin.css"%>
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
	<h1 style="text-align: center" style="margin-top: 110px;">Login</h1>
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