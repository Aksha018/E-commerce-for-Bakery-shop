<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Order</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getorder">
				<div>
					<label for="orderId">Order Id</label>
					<div>
						<form:input path="orderId" />
					</div>
				</div><div>
					<label for="orderName">Order Name</label>
					<div>
						<form:input path="orderName" />
					</div>
				</div>
		  </form:form>
		</div>
	</div>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Payment Id</th>
					<th>Payment Date</th>
					<th>Order Id</th>
					<th>Amount</th>
					<th>Payment Mode</th>
					<th>Payment Description</th>
	          </tr>
			</thead>
			<tbody>
				<c:forEach var="payment" items="${getpayment}">
					<tr>
						<td>${payment.paymentId}</td>
						<td>${payment.paymentDate}</td>
						<td>${payment.orderId}</td>
						<td>${payment.amount}</td>
						<td>${payment.paymentMode}</td>
						<td>${payment.paymentDescription}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>