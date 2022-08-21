<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>List-Bill</title>
<style>
<%@include file="/WEB-INF/views/css/bill-list.css"%>
</style>
</head>
<body>
<div id="table root">
   <div id="form" align="center">
  <table>
  <caption></caption>
		<thead>
			<tr>
				<th>Bill Id</th>
				<th>Bill Date</th>
				<th>Order Id</th>
				<th>Bill Amount</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="bill" items="${allbill}">
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
</div>
</body>
</html>