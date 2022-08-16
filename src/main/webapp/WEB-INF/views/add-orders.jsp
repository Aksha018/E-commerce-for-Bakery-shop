<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Orders</title>
</head>
<style type="text/css">
.login-form {
    width: 400px;
    top: 400px;
    left: 700px;
    transform: translate(-50%, -50%);
    position: absolute;
    color: #00000;
}
                                                 
.login-form h1 {
    font-size: 40px;
    text-align: center;
    text-transform: uppercase;
    margin: 30px 0;
}

.login-form label {
    font-size: 20px;
    margin: 15px 0;
}

.login-form input {
    height:30px;
    width:90%;
}
.login-form button {
    font-size: 18px;
    font-weight: bold;
    margin: 20px 0;
    padding: 10px 15px;
    border-radius: 5px;
    border: 0;
}
</style>
<body>
	<div id="root">
		<div class="login-form">
			<form:form action="addorder" method="post" modelAttribute="add">
				<div>
					<label for="orderId">Order Id</label>
					<div>
						<form:input path="orderId" />
					</div>
				</div>
				<div>
					<label for="orderDate">Order Date</label>
					<div>
						<form:input path="orderDate" type="date" />
					</div>
				</div>
				<div>
					<label for="productId">Product Id</label>
					<div>
						<form:input path="productId" />
					</div>
				</div>
				<div>
					<label for="quantity">Quantity</label>
					<div>
						<form:input path="quantity" />
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
					<label for="deliveryAddress">Delivery Address</label>
					<div>
						<form:input path="deliveryAddress" />
					</div>
				</div>
				<form:button>Order</form:button>
			</form:form>
		</div>
	</div>
</body>
</html>