<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en":>
<head>
<meta charset="ISO-8859-1">
<title>List-Payment</title>
<style>
<%@include file="/WEB-INF/views/css/paymentlist.css"%>
</style>
</head>
<body>
<div id="table root">
<div id="form" style="text-align: center">

	<table>
	<caption></caption>
		<thead>
			<tr>
				<th>Payment Id</th>
				<th>Payment Date</th>
				<th>Order Id</th>
				<th>Amount</th>
				<th>Payment Mode</th>
		  </tr>
		</thead>
		<tbody>
			<c:forEach var="payment" items="${allpayment}">
				<tr>
					<td>${payment.paymentId}</td>
					<td>${payment.paymentDate}</td>
					<td>${payment.orderId}</td>
					<td>${payment.amount}</td>
					<td>${payment.paymentMode}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</div>
</body>
</html>

