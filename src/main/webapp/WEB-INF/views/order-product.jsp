<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Order Product</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="product">
				<div>
					<label for="productId">product Id</label>
					<div>
						<form:input path="productId" />
					</div>
				</div>
                 <div>
					<label for="productName">Product Name</label>
					<div>
						<form:input path="productName" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
	<div id="table root">
		<table>
		<caption></caption>
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
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>