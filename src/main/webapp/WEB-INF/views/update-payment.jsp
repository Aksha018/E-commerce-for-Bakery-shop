<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Payment</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="updatepayment" method="post" modelAttribute="updatepay">
				<div>
					<label for="paymentId">Payment Id</label>
					<div>
						<form:input path="paymentId" />
					</div>
				</div>
				<div>
					<label for=paymentDate>Payment Date</label>
					<div>
						<form:input path="paymentDate" />
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
					<label for="paymentDescription">paymentDescription</label>
					<div>
						<form:input path="paymentDescription" />
					</div>
				</div>
				<form:button>Update New</form:button>
			</form:form>
		</div>
	</div>
</body>
</html>