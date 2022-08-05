<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Payment</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="addpayment" method="post" modelAttribute="add">
				<div>
					<label for="paymentId">Payment Id</label>
					<div>
						<form:input path="paymentId" />
					</div>
				</div>
				<div>
					<label for="paymentDate">Payment Date</label>
					<div>
						<form:input path="paymentDate" type="date" />
					</div>
				</div>
				<div>
					<label for="orderId">Order Id</label>
					<div>
						<form:input path="orderId" />
					</div>
				</div>
				<div>
					<label for="amount">Amount</label>
					<div>
						<form:input path="amount" />
					</div>
				</div>
				<div>
					<label for="paymentMode">Payment Mode</label>
					<div>
						<form:input path="paymentMode" />
					</div>
				</div>
				<div>
					<label for="paymentDescription">Payment Description</label>
					<div>
						<form:input path="paymentDescription" />
					</div>
				</div>
				<form:button>Add New</form:button>
			</form:form>
		</div>
	</div>
</body>
</html>