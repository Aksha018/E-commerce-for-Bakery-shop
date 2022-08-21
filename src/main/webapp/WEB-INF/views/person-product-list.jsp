<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Person Product</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="getperson">
				<div>
					<label for="personId">Person Id </label>
					<div>
						<form:input path="personId" />
					</div>
				</div>
				<div>
					<label for="personName">Person Name</label>
					<div>
						<form:input path="personName" />
					</div>
				</div>
				<div>
					<label for="email">Email</label>
					<div>
						<form:input path="email" />
					</div>
				</div>
				<div>
					<label for="password">Password</label>
					<div>
						<form:input path="password" />
					</div>
				</div>
				<div>
					<label for="mobileNumber">mobile Number</label>
					<div>
						<form:input path="mobileNumber" />
					</div>
				</div>
				<div>
					<label for="personType">Person Type</label>
					<div>
						<form:input path="personType" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
	<div id="table root">
		<table>
		<caption></caption>
			<thead>
				<tr>
					<th>productId</th>
					<th>productName</th>
					<th>categoryId</th>
					<th>stockInhand</th>
					<th>price</th>
					<th>description</th>
					<th>image</th>
	          </tr>
			</thead>
			<tbody>
				<c:forEach var="product" items="${getproduct}">
					<tr>
						<td>${product.productId}</td>
						<td>${product.productName}</td>
						<td>${product.categoryId}</td>
						<td>${product.stockInhand}</td>
						<td>${product.price}</td>
						<td>${product.description}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>