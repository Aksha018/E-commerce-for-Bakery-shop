<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List-Product</title>
</head>
<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Category Id</th>
					<th>StockInhand</th>
					<th>Price</th>
					<th>Description</th>
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
						<td><a href="addform?id=${product.productId}"><input
							onclick="change()" type="button" value="Add" id="myButton1"></input></a></td>
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

