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
<div id="form" align="center">

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
			<c:forEach var="payment" items="${allpayment}">
				<tr>
					<td>${payment.paymentId}</td>
					<td>${payment.paymentDate}</td>
					<td>${payment.orderId}</td>
					<td>${payment.amount}</td>
					<td>${payment.paymentMode}</td>
					<td>${payment.paymentDescription}</td>
					<td><a href="updatepayment?id=${payment.paymentId}"><input
							onclick="change()" type="button" value="Update" id="myButton1"></input></a></td>
					<td><a href="deletepayment?id=${payment.paymentId}"><input
							onclick="change()" type="button" value="Delete" id="myButton2"></input></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</div>
</body>
</html>

