<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
<style>
<%@include file="/WEB-INF/views/css/findbyidproduct.css"%>
</style>
</head>
<body>
  <nav>
		<div class="menu">
			<div class="logo">
				<a href="#">Bakery And Cakes</a>
			</div>
			<ul>
			<li><a href="/person/homepage">Back</a></li>	
			</ul>
		</div>
	</nav>
	<div id="root">
		<div class="login-form">
			<form:form action="" method="post" modelAttribute="findproduct">
				<div>
					<label for="productName">Product Name</label>
					<div>
						<form:input path="productName" readonly = "true"/>
					</div>
				</div>
				<div>
					<label for="stockInhand">Stock In Hand</label>
					<div>
						<form:input path="stockInhand" readonly = "true"/>
					</div>
				</div>
				<div>
					<label for="price">Price</label>
					<div>
						<form:input path="price" readonly = "true" />
					</div>
				</div>
				<div>
					<label for="description">Description</label>
					<div>
						<form:input path="description" readonly = "true"/>
					</div>
				</div>
				<form:button><a href ="/person/addorderform?id=${findproduct.productId}">Order</a></form:button>
		</form:form>
		</div>
	</div>
</body>
</html>