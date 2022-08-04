<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List-Bill</title>
</head>
<div id="table root">
	<table>
		<thead>
			<tr>
				<th>Bill Id</th>
				<th>Bill Date</th>
				<th>Order Id</th>
				<th>PreOrder Id</th>
		  </tr>
		</thead>
		<tbody>
			<c:forEach var="bill" items="${allbill}">
				<tr>
					<td>${bill.billId}</td>
					<td>${bill.billDate}</td>
					<td>${bill.orderId}</td>
					<td>${bill.preorderId}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>