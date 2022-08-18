<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Category</title>
<style>
<%@include file="/WEB-INF/views/css/cake.css"%>
</style>
</head>
<body>
	<form:form action="cake" method="post">
		<div class="img"></div>
		<div class="center">
			<div class="btns"></div>
			<section>
				<div class="images" id="coll">
					<h1>Cakes</h1>
					<div class="images__container">
						<div class="images__card">
							<a href="/admin/findbyproductid?id=1"><h2>Raspberry and almond cake</h2></a>
						</div>
						<div class="images__card">
							<a href="/admin/findbyproductid?id=21"><h2>Red Velvet Cake</h2></a>
						</div>
						<div class="images__card">
							<a href="/admin/findbyproductid?id=22"><h2>NewYork Baked Cheese cake</h2></a>
						</div>
						 <div class="images__card">
							<a href="/admin/findbyproductid?id=23"><h2>Lemon curd coconut pavlova cake</h2></a>
						</div>
						<div class="images__card">
							<a href="/admin/findbyproductid?id=24"><h2>Classic No-bake Vanilla cheese</h2></a>
						</div>
						<div class="images__card">
							<a href="/admin/findbyproductid?id=25"><h2>Cherry Ripe ice-cream cake</h2></a>
						</div>
					</div>
				</div>
			</section>
			<!-- Footer Section -->
			<div class="footer__container"></div>
		</div>
	</form:form>
</body>
</html>
