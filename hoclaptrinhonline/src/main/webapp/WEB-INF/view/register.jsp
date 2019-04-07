<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/resources/include/header.jsp"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body, html{
     height: 100%;
 	background-repeat: no-repeat;
 	font-family: 'Times New Roman', sans-serif;
}



h1.title { 
	font-size: 50px;
	font-family: 'Times New Roman', sans-serif;
	font-weight: 400; 
}

hr{
	width: 10%;
	color: #fff;
}

.form-group{
	margin-bottom: 15px;
}

label{
	margin-bottom: 15px;
}

input,
input::-webkit-input-placeholder {
    font-size: 11px;
    padding-top: 3px;
}

.main-login{
 	background-color: #fff;
    /* shadows and rounded borders */
    -moz-border-radius: 2px;
    -webkit-border-radius: 2px;
    border-radius: 2px;
    -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);

}

.main-center{
 	margin-top: 30px;
 	margin: 0 auto;
 	max-width: 330px;
    padding: 40px 40px;

}

.login-button{
	margin-top: 5px;
}

.login-register{
	font-size: 11px;
	text-align: center;
}
.require{
color :red;
}
.show{
color :red;
}
</style>
</head>
<body>
<div id="preloder">
		<div class="loader"></div>
	</div>

	<jsp:include page="/resources/include/headersection.jsp"></jsp:include>
	
	<jsp:include page="/resources/include/menu.jsp"></jsp:include>
<div class="container">
			<div class="row main">
				<span class="show">${registerSuccess}</span>
				<div class="main-login main-center">
				
					<form class="form-horizontal" method="post" action="#">
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Your Name<span class="require">*</span></label>
							<div class="cols-sm-10">
								<div class="input-group">
									<input type="text" class="form-control" name="name" id="name"  placeholder="Enter your Name"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="id_email" class="cols-sm-2 control-label">Your Email<span class="require">*</span></label>
							<div class="cols-sm-10">
								<div class="input-group">
									<input type="text" class="form-control" name="id_email" id="id_email"  placeholder="Enter your Email"/>
								</div>
								<span class="show">${validateEmail}</span>
							</div>
						</div>

						<div class="form-group">
							<label for="phone" class="cols-sm-2 control-label">Phone</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<input type="text" class="form-control" name="phone" id="phone"  placeholder="Enter your Phone"/>
								</div>
								<span class="show">${validatePhone}</span>
								
							</div>
						</div>
						<div class="form-group">
							<label for="addr" class="cols-sm-2 control-label">Address</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<input type="text" class="form-control" name="addr" id="addr"  placeholder="Enter your Address"/>
								</div>
							</div>
						</div>
						

						<div class="form-group">
							<label for="pass" class="cols-sm-2 control-label">Password<span class="require">*</span></label>
							<div class="cols-sm-10">
								<div class="input-group">
									<input type="password" class="form-control" name="pass" id="pass"  placeholder="Enter your Password"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="re_pass" class="cols-sm-2 control-label">Confirm Password<span class="require">*</span></label>
							<div class="cols-sm-10">
								<div class="input-group">
									<input type="password" class="form-control" name="re_pass" id="re_pass"  placeholder="Confirm your Password"/>
								</div>
								<span class="show">${validatePass}</span>
							</div>
						</div>

						<div class="form-group ">
							<button type="submit" class="btn btn-primary btn-lg btn-block login-button">Register</button>
						</div>
						<div class="login-register">
				            <a href="login">Login</a>
				         </div>
					</form>
				</div>
			</div>
		</div>

	<jsp:include page="/resources/include/footersection.jsp"></jsp:include>

	<jsp:include page="/resources/include/footer.jsp"></jsp:include>
</body>
</html>