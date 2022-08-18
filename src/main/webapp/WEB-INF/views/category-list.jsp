<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List-Category</title>
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
<div id="table root">
<div id="form" align="center">
	<table>
		<thead>
			<tr>
				<th>Category Id</th>
				<th>Category Name</th>
				<th>Update</th>
				<th>Delete</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="category" items="${allcategory}">
				<tr>
					<td>${category.categoryId}</td>
					<td>${category.categoryName}</td>
					<td><a href="update?categoryId=${category.categoryId}"><input
							                                    onclick="change()"
							type="button" value="Update" id="myButton1"></input></a></td>            
					               
					<td><a href="deletecategory?categoryId=${category.categoryId }"><input
							                                    onclick="change()"
							type="button" value="Delete" id="myButton2"></input></a></td> 
               </tr>
			</c:forEach>
		</tbody>
	</table>
</div>

</body>
</html>

