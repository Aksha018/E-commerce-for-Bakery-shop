<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
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
	<div id="root">
		<div id="form" align="center">
			<form:form action="addproduct" method="post" modelAttribute="product">
				<div>
					<label for="productName">Product Name</label>
					<div>
						<form:input path="productName" />
					</div>
				</div>
				<div>
					<label for="categoryId">Category Id</label>
					<div>
						<form:input path="categoryId" />
					</div>
				</div>
				<div>
					<label for="stockInhand">Stock In Hand</label>
					<div>
						<form:input path="stockInhand" />
					</div>
				</div>
				<div>
					<label for="price">Price</label>
					<div>
						<form:input path="Price" />
					</div>
				</div>
				<div>
					<label for="description">Description</label>
					<div>
						<form:input path="description" />
					</div>
				</div>
				<form:button>Add New</form:button>
			</form:form>
		</div>
	</div>
</body>
</html>