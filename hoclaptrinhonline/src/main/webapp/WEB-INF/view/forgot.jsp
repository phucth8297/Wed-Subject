<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/resources/include/header.jsp"></jsp:include>

</head>
<body>
<div id="preloder">
		<div class="loader"></div>
	</div>

	<jsp:include page="/resources/include/headersection.jsp"></jsp:include>

	<jsp:include page="/resources/include/menu.jsp"></jsp:include>
Enter your registered email address:
	<form action="" method="post">
		<table>
			<tr>

				<td colspan="2"><input type="text" name="email" id="email" width="200px"> </td>
			</tr>
			
			<tr>
				<td><input type="Submit" value="Reset Password">  </td>
				<td><input type="reset" value="Cancel">  </td>
			</tr>
			<tr>
				<td>${successMessage}</td>			
			</tr>
			<tr>
				<td>${errorMessage}</td>			
			</tr>
		</table>
	</form>
	<jsp:include page="/resources/include/news.jsp"></jsp:include>

	<jsp:include page="/resources/include/footersection.jsp"></jsp:include>

	<jsp:include page="/resources/include/footer.jsp"></jsp:include>
</body>
</html>