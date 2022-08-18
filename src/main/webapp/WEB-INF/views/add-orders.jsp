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
@import
	url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');
	
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}
::selection {
	color: #000;
	background: #fff;
}
nav {
	position:fixed;
	background: #1b1b1b;
	width: 100%;
	padding: 10px 0;
	z-index: 12;
}
nav .menu {
	max-width: 1250px;
	display: flex;
	align-items: center;
	justify-content: space-between;
	padding: 0 20px;
}
.menu .logo a {
	text-decoration: none;
	color: #fff;
	font-size: 35px;
	font-weight: 600;
}
.menu ul {
	display: inline-flex;
}
.menu ul li {
	list-style: none;
	margin-left: 7px;
}
.menu ul li:first-child {
	margin-left: 0px;
}
.menu ul li a {
	text-decoration: none;
	color: #fff;
	font-size: 18px;
	font-weight: 500;
	padding: 8px 15px;
	border-radius: 5px;
	transition: all 0.3s ease;
}
.menu ul li a:hover {
	background: #fff;
	color: black;
}
.img {
	background: url('img3.jpg') no-repeat;
	width: 100%;
	height: 100vh;
	background-size: cover;
	background-position: center;
	position: relative;
}
.img::before {
	content: '';
	position: absolute;
	height: 100%;
	width: 100%;
	background: rgba(0, 0, 0, 0.4);
}
.center {
	position: absolute;
	top: 52%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 100%;
	padding: 0 20px;
	text-align: center;
}
.center .title {
	color: #fff;
	font-size: 55px;
	font-weight: 600;
}
.center .sub_title {
	color: #fff;
	font-size: 52px;
	font-weight: 600;
}
.center .btns {
	margin-top: 20px;
}
.center .btns button {
	height: 55px;
	width: 170px;
	border-radius: 5px;
	border: none;
	margin: 0 10px;
	border: 2px solid white;
	font-size: 20px;
	font-weight: 500;
	padding: 0 10px;
	cursor: pointer;
	outline: none;
	transition: all 0.3s ease;
}
.center .btns button:first-child {
	color: #fff;
	background: none;
}
.btns button:first-child:hover {
	background: white;
	color: black;
}
.center .btns button:last-child {
	background: white;
	color: black;
}
.login-form {
    width: 400px;
    top: 400px;
    left: 700px;
    transform: translate(-50%, -50%);
    position: absolute;
    color: #ffff;
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
    margin-left: -140px;
    bottom: 25px;
}

.login-form input {
    height:30px;
    width:90%;
    bottom:20px;
}
.login-form button {
    font-size: 18px;
    font-weight: bold;
    margin: 20px 0;
    padding: 10px 15px;
    border-radius: 5px;
    border: 0;
}
body {
    background-image: url('https://images.creativemarket.com/0.1.0/ps/797108/600/400/m2/fpnw/wm0/cake-shop-logo-mock-up-1-.jpg?1448176497&s=fca93295192f47cf4a2255136b34d1db&fmt=webp');
    /*background-color: black;*/
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: 100% 100%;
    }
</style>

<body>
<nav>
		<div class="menu">
			<div class="logo">
				<a href="#">Bakery And Cakes</a>
			</div>
			<ul>
			<li><a href="/person/indexpage">Back</a></li>	
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