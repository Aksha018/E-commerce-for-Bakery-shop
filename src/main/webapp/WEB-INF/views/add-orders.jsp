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
<style>
<%@include file="/WEB-INF/views/css/add-orders.css"%>
</style>
<body>
<nav>
		<div class="menu">
			<div class="logo">
				<a href="#">Bakery And Cakes</a>
			</div>
			<ul>
			<li><a href="/admin/findbyproductid">Back</a></li>	
			</ul>
		</div>
	</nav>
	<div class="login-form">
		<div>
			<form:form action="addorder" method="post" modelAttribute="add">
				<div>
					<label for="orderId">Order Id</label>
					<div>
						<form:input path="orderId" id="orderId" />
					</div>
				</div>
				<div>
					<label for="orderDate">Order Date</label>
					<div>
						<form:input path="orderDate" type="date" />
					</div>
				</div>
				<div>
					<label for="quantity">Quantity</label>
					<div>
						<form:input path="quantity"/>
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
						<form:input path="amount"  onmouseover="add_number()"/>
					</div>
				</div>
				<div>
					<label for="deliveryTime">Delivery Time</label>
					<div>
					<form:select path="deliveryTime">
                       <form:errors path="deliveryTime" />
                       <form:option value="10:00AM">10:00AM</form:option>
                       <form:option value="11:00AM">11:00AM</form:option>
                       <form:option value="12:00PM">12:00PM</form:option>
                       <form:option value="1:00PM">1:00PM</form:option>
                       <form:option value="2:00PM">2:00PM</form:option>
                       <form:option value="3:00PM">3:00PM</form:option>
                       <form:option value="4:00PM">4:00PM</form:option>
                       <form:option value="5:00PM">5:00PM</form:option>
                       <form:option value="6:00PM">6:00PM</form:option>
                       <form:option value="7:00PM">7:00PM</form:option>
                       <form:option value="8:00PM">8:00PM</form:option> 
                    </form:select>
                    </div>
				</div>
				<div>
					<label for="deliveryDate">Delivery Date </label>
					<div>
						<form:input path="deliveryDate"  type="date" />
					</div>
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
<script type="text/javascript">
        document.getElementById('orderId').value = Math.floor(Math.random() * 1000);
 </script>
 <script>
 
    function add_number() {

        var first_number = parseInt(document.getElementById("num1").value);
        var second_number = parseInt(document.getElementById("num2").value);
        var result = first_number * second_number;

        document.getElementById("result").value = result;
      }
    
    </script>
</html>