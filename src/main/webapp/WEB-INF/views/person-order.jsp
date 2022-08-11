<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Person</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="person">
				<div>
					<label for="personName">Person Name</label>
					<div>
						<form:input path="personName" />
					</div>
				</div>
                 <div>
					<label for="mobileNumber">Mobile Number</label>
					<div>
						<form:input path="mobileNumber" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
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
					<th>deliveryTime</th>
					<th>deliveryDate</th>
					<th>deliveryAddress</th>
					<th>Status</th>
	          </tr>
			</thead>
			<tbody>
				<c:forEach var="order" items="${order}">
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
						<td>${order.status}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>