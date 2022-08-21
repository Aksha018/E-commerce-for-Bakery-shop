<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Category</title>
<style>
<%@include file="/WEB-INF/views/css/donuts.css"%>
</style>
</head>
<body>
	<form:form action="cake" method="post">
		<div class="img"></div>
		<div class="center">
			<div class="btns"></div>
			<section>
				<div class="images" id="coll">
					<h1>Doughnuts</h1>
					<div class="images__container">
						<div class="images__card">
							<a href="/admin/findbyproductid?id=38&pId=${pId}"><h2>Vegan choc doughnuts</h2></a>
						</div>
						<div class="images__card">
						<a href="/admin/findbyproductid?id=39&pId=${pId}"><h2>Cinnamon doughnuts</h2></a>
						</div>
						<div class="images__card">
				        <a href="/admin/findbyproductid?id=40&pId=${pId}"><h2>Brownie doughnuts</h2></a>
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
