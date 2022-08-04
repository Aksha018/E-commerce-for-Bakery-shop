<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List-Payment</title>
</head>
<div id="table root">
	<table>
		<thead>
			<tr>
				<th>Payment Id</th>
				<th>Payment Date</th>
				<th>Order Id</th>
				<th>PreOrder Id</th>
				<th>Amount</th>
				<th>Payment Mode</th>
				<th>Payment Description</th>
		  </tr>
		</thead>
		<tbody>
			<c:forEach var="payment" items="${allpayment}">
				<tr>
					<td>${payment.paymentId}</td>
					<td>${payment.paymentDate}</td>
					<td>${payment.orderId}</td>
					<td>${payment.preorderId}</td>
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

