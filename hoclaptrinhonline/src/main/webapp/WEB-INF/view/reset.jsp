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
	Enter New Password for
	${aPasswordResetHelperModel.getaUser().getId_email()}
	<a href="login">Login</a>
	<form action="" method="post">
		<p>Reset Token is : ${aPasswordResetHelperModel.getResetToken()}</p>
		<input type="text" name="resetToken" id="resetToken"
			placeholder="resetToken" class="form-control" />


		<div class="form-group">
			<label class="col-sm-2 control-label">Password :</label>
			<div class="col-sm-9">
				<input type="password" name="oldPassword" id="oldPassword"
					placeholder="Password" class="form-control" />
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">Confirm :</label>
			<div class="col-sm-9">
				<input type="password" name="newPassword" id="newPassword"
					placeholder="Password" class="form-control" />
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-4" align="center"></div>
			<div class="col-sm-4" align="center">
				<button type="submit" class="btn btn-primary btn-lg"
					style="width: 300px;">Save password</button>
			</div>
		</div>
		${successMessage} ${errorMessage}

		<jsp:include page="/resources/include/news.jsp"></jsp:include>

	<jsp:include page="/resources/include/footersection.jsp"></jsp:include>

	<jsp:include page="/resources/include/footer.jsp"></jsp:include>
	</form>
</body>
</html>