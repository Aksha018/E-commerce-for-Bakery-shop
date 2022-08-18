<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List-Orders</title>
<style>
<%@include file="/WEB-INF/views/css/orderlist.css"%>
</style>
</head>
<body>
	<div id="root">
		<div id="form" align="center">

<div id="table root">
	<table>
		<thead>
			<tr>
				<th>Order Id</th>
				<th>Order Date</th>
				<th>Person Id</th>
				<th>Product Id</th>
				<th>Quantity</th>
				<th>Price</th>
				<th>Amount</th>
				<th>Delivery Time</th>
				<th>Delivery Date</th>
				<th>Delivery Address</th>
		  </tr>
		</thead>
		<tbody>
			<c:forEach var="order" items="${allorder}">
				<tr>
					<td>${order.orderId}</td>
					<td>${order.orderDate}</td>
					<td>${order.personId}</td>
					<td>${order.productId}</td>
					<td>${order.quantity}</td>
					<td>${order.price}</td>
					<td>${order.amount}</td>
					<td>${order.deliveryTime}</td>
					<td>${order.deliveryDate}</td>
					<td>${order.deliveryAddress}</td>				
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>

