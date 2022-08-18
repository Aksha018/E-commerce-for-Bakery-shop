<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List-Bill</title>
<style type="text/css">
body {
	background: #456;
	background-color:#f5deb3;
	background-size: 100% 100%;
	}
table{
    text-align: center;
    width: 90%;
}
 
 table, th, td {
    border: 2px solid black;
    border-collapse: collapse;
}
</style>
</head>
<body>
<div id="table root">
   <div id="form" align="center">
   
   <table>
		<thead>
			<tr>
				<th>Bill Id</th>
				<th>Bill Date</th>
				<th>Order Id</th>
				<th>Bill Amount</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="bill" items="${allbill}">
				<tr>
					<td>${bill.billId}</td>
					<td>${bill.billDate}</td>
					<td>${bill.orderId}</td>
					<td>${bill.billAmount}</td>
					<td><a href="addbillform?id=${bill.billId}"><input
							onclick="change()" type="button" value="Add" id="myButton1"></input></a></td>
					<td><a href="updatebillform?id=${bill.billId}"><input
							onclick="change()" type="button" value="Update" id="myButton2"></input></a></td>
					<td><a href="deletebill?id=${bill.billId}"><input
							onclick="change()" type="button" value="Delete" id="myButton3"></input></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>