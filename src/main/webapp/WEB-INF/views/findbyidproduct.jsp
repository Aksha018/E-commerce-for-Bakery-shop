<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
n<style>
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
					<label for="productId">Product Id</label>
					<div>
						<form:input path="productId" />
					</div>
				</div>
				<div>
					<label for="productName">Product Name</label>
					<div>
						<form:input path="productName" />
					</div>
				</div>
				<div>
					<label for="categoryId">Category Id</label>
					<div>
						<form:input path="categoryId" />
					</div>
				</div>
				<div>
					<label for="stockInhand">Stock In Hand</label>
					<div>
						<form:input path="stockInhand" />
					</div>
				</div>
				<div>
					<label for="price">Price</label>
					<div>
						<form:input path="price" />
					</div>
				</div>
				<div>
					<label for="description">Description</label>
					<div>
						<form:input path="description" />
					</div>
				</div>
				<form:button><a href ="/person/addorderform">Order</a></form:button>
		</form:form>
		</div>
	</div>
</body>
</html>