<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category</title>
<style>
<%@include file="/WEB-INF/views/css/muffins.css"%>
</style>
</head>
<body>
	<form:form action="cake" method="post">
		<div class="img"></div>
		<div class="center">
			<div class="btns"></div>
			<section>
				<div class="images" id="coll">
					<h1>Muffins</h1>
					<div class="images__container">
						<div class="images__card">
							<a href="/admin/findbyproductid?id=41"><h2>Apple and custard muffins</h2></a>
						</div>
						<div class="images__card">
							<a href="/admin/findbyproductid?id=42"><h2>Chocolate mud muffins</h2></a>
						</div>
						<div class="images__card">
							<a href="/admin/findbyproductid?id=43"><h2>Creme Egg muffins</h2></a>
						</div>
				</div>
			</section>
			<!-- Footer Section -->
			<div class="footer__container"></div>
		</div>
	</form:form>
</body>
</html>
