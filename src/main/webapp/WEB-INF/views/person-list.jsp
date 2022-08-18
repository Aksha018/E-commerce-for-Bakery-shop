<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List-Person</title>
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
 <table>
		<thead>
			<tr>
				<th>Person Id</th>
				<th>Person Name</th>
				<th>Email</th>
				<th>Password</th>
				<th>Mobile No</th>
				<th>Person Type</th>
		  </tr>
		</thead>
		<tbody>
			<c:forEach var="person" items="${allperson}">
				<tr>
					<td>${person.personId}</td>
					<td>${person.personName}</td>
					<td>${person.email}</td>
					<td>${person.password}</td>
					<td>${person.mobileNumber}</td>
					<td>${person.personType}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>

