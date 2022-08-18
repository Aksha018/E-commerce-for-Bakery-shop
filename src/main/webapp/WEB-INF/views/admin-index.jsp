<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
<style>
<%@include file="/WEB-INF/views/css/admin-index.css"%>
</style>
</head>
<body>
	<nav>
		<div class="menu">
			<div class="logo">
				<a href="#">Bakery And Cakes</a>
			</div>
			<ul>
				<li><a href="/admin/categorylist">Category</a></li>	
				<li><a href="/admin/productlist">Product</a></li>
				<li><a href="/person/orderlist">Orders</a></li>		
				<li><a href="/person/paymentlist">Payment Details</a></li>		
				<li><a href="/bill/billlist">Bill Details</a></li>	
			</ul>
		</div>
	</nav>
	<div class="img"></div>
	<div class="center">
		<div class="title">Indulge in Sweetness</div>
		<div class="btns"></div>
	</div>
</body>
</html>
