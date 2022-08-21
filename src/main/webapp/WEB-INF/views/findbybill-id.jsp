<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find By Bill Id</title>
</head>
<style>
<%@include file="/WEB-INF/views/css/findby-billid.css"%>
</style>
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
	<div class="login-form">
	<div id="root">
	<h1 align="center" style="margin-top: -100px;">PAYMENT SUCCESSFULL</h1>
	
			<form:form action="updatebill" method="post" modelAttribute="update">
					<div>
						<form:input path="billId" type="hidden" />
					</div>
				<div>
					<label for="billDate">Bill Date</label>
					<div>
						<form:input path="billDate" id="date" readonly="true" />
					</div>
				</div>
				<div>
					<label for="orderId">Order Id</label>
					<div>
						<form:input path="orderId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="billAmount">Bill Amount</label>
					<div>
						<form:input path="billAmount" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
<script type="text/javascript">
  document.getElementById('date').value = new Date().toISOString(); 
</script>
</html>