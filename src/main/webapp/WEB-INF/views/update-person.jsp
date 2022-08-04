<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Person</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="update" method="post" modelAttribute="updateperson">
				<div>
					<label for="personId">Person Id</label>
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
					<label for="mobileNumber">Mobile No</label>
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
				<form:button>Update New</form:button>
			</form:form>
		</div>
	</div>
</body>
</html>