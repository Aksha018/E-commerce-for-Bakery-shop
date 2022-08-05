<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Bill</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="addbill" method="post" modelAttribute="addbilldetail">
				<div>
					<label for="billId">Bill Id</label>
					<div>
						<form:input path="billId" />
					</div>
				</div>
				<div>
					<label for="billDate">Bill Date</label>
					<div>
						<form:input path="billDate" type="date"/>
					</div>
				</div>
				<div>
					<label for="orderId">Order Id</label>
					<div>
						<form:input path="orderId" />
					</div>
				</div>
				<form:button>Add New</form:button>
			</form:form>
		</div>
</body>
</html>