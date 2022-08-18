<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>List-Product</title>
<style>
<%@include file="/WEB-INF/views/css/product-list.css"%>
</style>
</head>
<body>
<div>
		<table class="table root">
			<thead>
				<tr>
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Category Id</th>
					<th>StockInhand</th>
					<th>Price</th>
					<th>Description</th>
					<th>Update</th>
					<th>Delete</th>
	          </tr>
			</thead>
			<tbody>
				<c:forEach var="product" items="${allproduct}">
					<tr>
						<td>${product.productId}</td>
						<td>${product.productName}</td>
						<td>${product.categoryId}</td>
						<td>${product.stockInhand}</td>
						<td>${product.price}</td>
						<td>${product.description}</td>
						<td><a href="updateform?id=${product.productId}"><input
							onclick="change()" type="button" value="Update" id="myButton2"></input></a></td>
					<td><a href="deleteperson?id=${product.productId}"><input
							onclick="change()" type="button" value="Delete" id="myButton3"></input></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>

