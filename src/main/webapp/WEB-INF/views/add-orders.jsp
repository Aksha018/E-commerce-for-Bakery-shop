<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Orders</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="addorder" method="post" modelAttribute="add">
				<div>
					<label for="orderId">Order Id</label>
					<div>
						<form:input path="orderId" />
					</div>
				</div>
				<div>
					<label for="preorderId">PreOrder Id</label>
					<div>
						<form:input path="preorderId" />
					</div>
				</div>
				<div>
					<label for="orderDate">Order Date</label>
					<div>
						<form:input path="orderDate" type="date" />
					</div>
				</div>
				<div>
					<label for="personId">Person Id</label>
					<div>
						<form:input path="personId" />
					</div>
				</div>
				<div>
					<label for="productId">Product Id</label>
					<div>
						<form:input path="productId" />
					</div>
				</div>
				<div>
					<label for="price">price</label>
					<div>
						<form:input path="price" />
					</div>
				</div>
				<div>
					<label for="amount">Amount</label>
					<div>
						<form:input path="amount" />
					</div>
				</div>
				<div>
					<label for="deliveryTime">Delivery Time</label>
					<div>
						<form:input path="deliveryTime" />
					</div>
				</div>
				<div>
					<label for="deliveryDate">Delivery Date </label>
					<div>
						<form:input path="deliveryDate"  type="date" />
					</div>
					<div>
					<label for="status">Status</label>
					<div>
						<form:input path="status" />
					</div>
				</div>	
				</div>
				<form:button>Add New</form:button>
			</form:form>
		</div>
	</div>
</body>
</html>