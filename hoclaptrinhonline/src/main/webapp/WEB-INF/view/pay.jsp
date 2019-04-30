<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/resources/include/header.jsp"></jsp:include>

</head>
<body>
	<h1>Paypal Payment</h1>
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<jsp:include page="/resources/include/headersection.jsp"></jsp:include>

	<jsp:include page="/resources/include/menu.jsp"></jsp:include>

	<form method="post" th:action="pay">
		<input type="text" value="" name="price" />
		<button type="submit">Payment with Paypal</button>
	</form>

	<jsp:include page="/resources/include/news.jsp"></jsp:include>

	<jsp:include page="/resources/include/footersection.jsp"></jsp:include>

	<jsp:include page="/resources/include/footer.jsp"></jsp:include>
</body>
</html>