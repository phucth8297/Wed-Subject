<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="vi">
<head>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<jsp:include page="/resources/include/header.jsp"></jsp:include>
</head>
<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<jsp:include page="/resources/include/headersection.jsp"></jsp:include>
	
	<jsp:include page="/resources/include/menu.jsp"></jsp:include>
	
	<!-- Breadcrumb section -->
	<div class="site-breadcrumb">
		<div class="container">
			<a href="#"><i class="fa fa-home"></i> Home</a> <i class="fa fa-angle-right"></i>
			<span>Contact</span>
		</div>
	</div>
	<!-- Breadcrumb section end -->


	<!-- Courses section -->
	<section class="contact-page spad pt-0">
		<div class="container">
			<div class="map-section">
				<div class="contact-info-warp">
					<div class="contact-info">
						<h4>Address</h4>
						<p>40 Baria Street 133/2, NewYork City, US</p>
					</div>
					<div class="contact-info">
						<h4>Phone</h4>
						<p>(+88) 111 555 666</p>
					</div>
					<div class="contact-info">
						<h4>Email</h4>
						<p>infodeercreative@gmail.com</p>
					</div>
					<div class="contact-info">
						<h4>Working time</h4>
						<p>Monday - Friday: 08 AM - 06 PM</p>
					</div>
				</div>
				<!-- Google map -->
				<div class="map" id="map-canvas"></div>
			</div>
			<div class="contact-form spad pb-0">
				<div class="section-title text-center">
					<h3>GET IN TOUCH</h3>
					<p>Contact us for best deals and offer</p>
				</div>
				<form class="comment-form --contact">
					<div class="row">
						<div class="col-lg-4">
							<input type="text" placeholder="Your Name">
						</div>
						<div class="col-lg-4">
							<input type="text" placeholder="Your Email">
						</div>
						<div class="col-lg-4">
							<input type="text" placeholder="Subject">
						</div>
						<div class="col-lg-12">
							<textarea placeholder="Message"></textarea>
							<div class="text-center">
								<button class="site-btn">SUBMIT</button>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</section>
	<!-- Courses section end-->

	<jsp:include page="/resources/include/news.jsp"></jsp:include>

	<jsp:include page="/resources/include/footersection.jsp"></jsp:include>

	<jsp:include page="/resources/include/footer.jsp"></jsp:include>
	
	<!-- load for map -->
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB0YyDTa0qqOjIerob2VTIwo_XVMhrruxo"></script>
	<script src='<c:url value="/resources/js/main.js"/> '></script>	
</body>
</html>