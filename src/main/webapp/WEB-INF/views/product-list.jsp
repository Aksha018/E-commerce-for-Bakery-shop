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
					<th>Image</th>
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
						<td>${product.image}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>

