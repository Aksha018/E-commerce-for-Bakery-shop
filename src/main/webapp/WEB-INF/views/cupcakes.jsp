<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category</title>
<style>
<%@include file="/WEB-INF/views/css/cupcakes.css"%>
</style>
</head>
<body>
	<form:form action="cake" method="post">
		<div class="img"></div>
		<div class="center">
			<div class="btns"></div>
			<section>
				<div class="images" id="coll">
					<h1>CupCakes</h1>
					<div class="images__container">
						<div class="images__card">
							<a href="/admin/findbyproductid?id=32"><h2>Gingerbread cupcake</h2></a>
						</div>
						<div class="images__card">
							<a href="/admin/findbyproductid?id=33"><h2>Beehive cupcake</h2></a>
						</div>
						<div class="images__card">
							<a href="/admin/findbyproductid?id=34"><h2>Neapolitan cupcake</h2></a>
						</div>
						 <div class="images__card">
							<a href="/admin/findbyproductid?id=35"><h2>Unicorn cupcake</h2></a>
						</div>
						<div class="images__card">
					        <a href="/admin/findbyproductid?id=36"><h2>Strawberries and cream Oreo cupcake</h2></a>
						</div>
						<div class="images__card">
							<a href="/admin/findbyproductid?id=37"><h2>Lamington cupcake</h2></a>
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
