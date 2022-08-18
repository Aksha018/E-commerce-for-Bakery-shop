<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category</title>
<style>
<%@include file="/WEB-INF/views/css/chocolates.css"%>
</style>
</head>
<body>
	<form:form action="cake" method="post">
		<div class="img"></div>
		<div class="center">
			<div class="btns"></div>
			<section>
				<div class="images" id="coll">
					<h1>Chocolates</h1>
					<div class="images__container">
						<div class="images__card">
							<a href="/admin/findbyproductid?id=29"><h2>Banana, oat & chocolate bars</h2></a>
						</div>
						<div class="images__card">
							<a href="/admin/findbyproductid?id=30"><h2>Nanaimo choco bars</h2></a>
						</div>
						<div class="images__card">
							<a href="/admin/findbyproductid?id=31"><h2>Date and choc-chip cookie bars</h2></a>
						</div>
				</div>
			</section>
			<!-- Footer Section -->
			<div class="footer__container"></div>
		</div>
	</form:form>
</body>
</html>
