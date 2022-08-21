<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
<%@include file="/WEB-INF/views/css/signup.css"%>
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
	<h1 align="center" style="margin-top: 80px;">Sign Up</h1>
	<div class="login-form">
		<form:form action="addperson" method="post" modelAttribute="add">
	        <div>
				<label for="personName">Person Name</label>
				<form:input id="personName" path="personName" pattern="^[a-z A-Z]+$" title="Please Enter Alphabtes Only"  placeholder = "Enter Your Name"/>
			</div>
			<div>
				<label for="email">Email</label>
				<form:input id="email" path="email" pattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" title ="Enter a valid email welcome03@gmail.com" placeholder = "Enter a Email" required="true"/>
			</div>
			<div>
				<label for="password">Password</label>
				<form:input id="password" path="password" type="password" required="true"/>
			</div>
			<div>
				<label for="mobileNumber">Mobile Number</label>
				<form:input id="mobileNumber" path="mobileNumber" pattern="[0-9]{3}[0-9]{3}[0-9]{4}" title="Enter 10 digits number" placeholder = "Enter Phone Number" required="true"/>
			</div>
			<div>
				<label for="personType">Person Type</label>
				<form:select path="personType">
					<form:errors path="personType" />
					<form:option value="user">User</form:option>
				</form:select>
			</div>
			<form:button id="log">Sign Up</form:button>
		</form:form>
		</div>
</body>
</html>