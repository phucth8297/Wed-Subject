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
			<span>About Us</span>
		</div>
	</div>
	<!-- Breadcrumb section end -->


	<!-- About section -->
	<section class="about-section spad pt-0">
		<div class="container">
			<div class="section-title text-center">
				<h3>WELCOME TO EZUCA</h3>
				<p>Let children creative and make a different</p>
			</div>
			<div class="row">
				<div class="col-lg-6 about-text">
					<h5>About us</h5>
					<p>Lorem ipsum dolor sitdoni amet, consectetur dont adipis elite. Vivamus interdum ultrices augue. Aenean dos cursus lania. Duis et fringilla leonardo. Mauris mattis phare sem, debut curus risus viverra sed.</p>
					<h5 class="pt-4">Our history</h5>
					<p>Led at felis arcu. Integer lorem lorem, tincidunt eu congue et, mattis ut ante. Nami suscipit, lectus id efficitur ornare, leo libero convalis nulla, vitae dignissim .</p>
					<ul class="about-list">
						<li><i class="fa fa-check-square-o"></i> University Faculties organise teaching and research into individual subjects.</li>
						<li><i class="fa fa-check-square-o"></i> The University is rich in history - its famous buildings attract visitors.</li>
						<li><i class="fa fa-check-square-o"></i> 50 years of people, and achievements that continue to transform.</li>
						<li><i class="fa fa-check-square-o"></i> The University's core values are as follows:freedom of thought.</li>
					</ul>
				</div>
				<div class="col-lg-6 pt-5 pt-lg-0">
					<img src='<c:url value="/resources/img/about.jpg"/> '>
				</div>
			</div>
		</div>
	</section>
	<!-- About section end-->


	<!-- Testimonial section  -->
	<section class="testimonial-section spad">
		<div class="container">
			<div class="testimonial-slider owl-carousel">
				<div class="ts-item">
					<div class="row">
						<div class="col-md-3">
							<div class="ts-author-pic set-bg" data-setbg='<c:url value="/resources/img/member/5.jpg"/> '></div>
						</div>
						<div class="col-md-9 ts-text">
							<p>“ I want to let you know that I am very absolutely delighted with the course in every respect. It has been particularly pleasing for me, with an interest in seeing the application and good educational practice to school education. Learn a different approach that leads to better outcomes. ”</p>
							<h5>Mr. Peter Crough</h5>
							<span>Student’s Parent</span>
						</div>
					</div>
				</div>
				<div class="ts-item">
					<div class="row">
						<div class="col-md-3">
							<div class="ts-author-pic set-bg" data-setbg='<c:url value="/resources/img/member/5.jpg"/> '></div>
						</div>
						<div class="col-md-9 ts-text">
							<p>“ I want to let you know that I am very absolutely delighted with the course in every respect. It has been particularly pleasing for me, with an interest in seeing the application and good educational practice to school education. Learn a different approach that leads to better outcomes. ”</p>
							<h5>Mr. Peter Crough</h5>
							<span>Student’s Parent</span>
						</div>
					</div>
				</div>
				<div class="ts-item">
					<div class="row">
						<div class="col-md-3">
							<div class="ts-author-pic set-bg" data-setbg='<c:url value="/resources/img/member/5.jpg"/> '></div>
						</div>
						<div class="col-md-9 ts-text">
							<p>“ I want to let you know that I am very absolutely delighted with the course in every respect. It has been particularly pleasing for me, with an interest in seeing the application and good educational practice to school education. Learn a different approach that leads to better outcomes. ”</p>
							<h5>Mr. Peter Crough</h5>
							<span>Student’s Parent</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Testimonial section end -->


	<!-- Team section  -->
	<section class="team-section spad">
		<div class="container">
			<div class="section-title text-center">
				<h3>OUR TEAM</h3>
				<p>The professional standards and expectations</p>
			</div>
			<div class="row">
				<div class="col-md-6 col-lg-3">
					<div class="member">
						<div class="member-pic set-bg" data-setbg='<c:url value="/resources/img/member/1.jpg"/> '>
							<div class="member-social">
								<a href=""><i class="fa fa-facebook"></i></a>
								<a href=""><i class="fa fa-twitter"></i></a>
								<a href=""><i class="fa fa-pinterest"></i></a>
							</div>
						</div>
						<h5>Sasha Johnson</h5>
						<p>Literature Teacher</p>
					</div>
				</div>
				<div class="col-md-6 col-lg-3">
					<div class="member">
						<div class="member-pic set-bg" data-setbg='<c:url value="/resources/img/member/2.jpg"/> '>
							<div class="member-social">
								<a href=""><i class="fa fa-facebook"></i></a>
								<a href=""><i class="fa fa-twitter"></i></a>
								<a href=""><i class="fa fa-pinterest"></i></a>
							</div>
						</div>
						<h5>Darmian Shaw</h5>
						<p>Physics Teacher</p>
					</div>
				</div>
				<div class="col-md-6 col-lg-3">
					<div class="member">
						<div class="member-pic set-bg" data-setbg='<c:url value="/resources/img/member/3.jpg"/> '>
							<div class="member-social">
								<a href=""><i class="fa fa-facebook"></i></a>
								<a href=""><i class="fa fa-twitter"></i></a>
								<a href=""><i class="fa fa-pinterest"></i></a>
							</div>
						</div>
						<h5>Joshua Matt</h5>
						<p>Matt Teacher</p>
					</div>
				</div>
				<div class="col-md-6 col-lg-3">
					<div class="member">
						<div class="member-pic set-bg" data-setbg='<c:url value="/resources/img/member/4.jpg"/> '>
							<div class="member-social">
								<a href=""><i class="fa fa-facebook"></i></a>
								<a href=""><i class="fa fa-twitter"></i></a>
								<a href=""><i class="fa fa-pinterest"></i></a>
							</div>
						</div>
						<h5>Taylor Launer</h5>
						<p>Music Teacher</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Team section end -->

	<jsp:include page="/resources/include/news.jsp"></jsp:include>

	<jsp:include page="/resources/include/footersection.jsp"></jsp:include>

	<jsp:include page="/resources/include/footer.jsp"></jsp:include>
	
</body>
</html>