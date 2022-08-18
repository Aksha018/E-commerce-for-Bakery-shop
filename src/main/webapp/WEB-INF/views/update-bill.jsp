<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Bill</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="updatebill" method="post" modelAttribute="addbilldetail">
				<div>
					<label for="billId">Bill Id</label>
					<div>
						<form:input path="billId" />
					</div>
				</div>
				<div>
					<label for="billDate">Bill Date</label>
					<div>
						<form:input path="billDate" />
					</div>
				</div>
				<div>
					<label for="orderId">Order Id</label>
					<div>
						<form:input path="orderId" />
					</div>
				</div>
				<div>
					<label for="orderId">Order Id</label>
					<div>
						<form:input path="orderId" />
					</div>
				</div>
				<div>
					<label for="billAmount">Bill Amount</label>
					<div>
						<form:input path="billAmount" />
					</div>
				</div>
				<form:button>Update New</form:button>
			</form:form>
		</div>
	</div>
</body>
</html>