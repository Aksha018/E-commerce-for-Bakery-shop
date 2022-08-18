<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>List-Category</title>
<style>
<%@include file="/WEB-INF/views/css/cat-list.css"%>
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
					<td><a href="update?categoryId=${category.categoryId}"><input onclick="change()"
							type="button" value="Update" id="myButton1"></input></a></td> 
                   <td><a href="deletecategory?categoryId=${category.categoryId }"><input onclick="change()"
							type="button" value="Delete" id="myButton2"></input></a></td> 
               </tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</div>
</body>
</html>

