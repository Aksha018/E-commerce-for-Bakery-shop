<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Bill Order</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getorder">
				<div>
					<label for="orderId">Order Id</label>
					<div>
						<form:input path="orderId" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Bill Id</th>
					<th>Bill Date</th>
					<th>Order Id</th>
					<th>Bill Amount</th>
	          </tr>
			</thead>
			<tbody>
				<c:forEach var="bill" items="${getbill}">
					<tr>
						<td>${bill.billId}</td>
						<td>${bill.billDate}</td>
						<td>${bill.orderId}</td>
						<td>${bill.billAmount}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>