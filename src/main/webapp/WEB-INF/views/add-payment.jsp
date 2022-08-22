<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Payment</title>
<style>
<%@include file="/WEB-INF/views/css/addpayment.css"%>
</style>
</head>
<body>
<nav>
	<div class="menu">
			<div class="logo">
				<a href="#">Bakery And Cakes</a>
			</div>
			<ul>
			<li><a href="/admin/addorderform">Back</a></li>	
			</ul>
		</div>
	</nav>
	<div class="login-form">
		
			<form:form action="addpayment" method="post" modelAttribute="add">
				<div>
						<form:input path="paymentId" type="hidden"/>
					</div>
				<div>
					<label for="paymentDate">Payment Date</label>
					<div>
						<form:input path="paymentDate" id="date" readonly="true" />
					</div>
				</div>
				<div>
					<label for="orderId">Order Id</label>
					<div>
						<form:input path="orderId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="amount">Amount</label>
					<div>
						<form:input path="amount" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="paymentMode">Payment Mode</label>
					<form:select path="paymentMode">
					<form:errors path="paymentMode"/>
					<form:option value="UPI">UPI</form:option>
					<form:option value="DebitCard">DebitCard</form:option>
				</form:select>
					</div>
				<form:button>Pay</form:button>
			</form:form>
		</div>
</body>
<script type="text/javascript">
  document.getElementById('date').value = new Date().toISOString(); 
</script>
</html>