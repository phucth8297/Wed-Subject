<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="vi">
<head>
	<%@ taglib prefix="tag" uri="/WEB-INF/taglibs/customTaglib.tld" %>
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
			<span>Blog</span>
		</div>
	</div>
	<!-- Breadcrumb section end -->


	<!-- Blog page section  -->
	<section class="blog-page-section spad pt-0">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 post-list">
				
				<c:forEach var="course" items="${listCourseById}" varStatus="itr">
					<div class="post-item">
						<div class="post-thumb set-bg" data-setbg='<c:url value="/resources/img/${course.getImag()}"/> '></div>
						<div class="post-content">
							<h3><a href="single-blog">${offset + itr.index +1 }. ${course.getName() }</a></h3>
							<div class="post-meta">
								<span>$.${course.getPrice()}</span>
								<span><i class="fa fa-user"></i> ${course.getId_email()}</span>
							</div>
							<p>${course.getDescr() }</p>
						</div>
						<span><a href="pay/${course.getPrice()}">Pay </a></span>
					</div>
					</c:forEach>
					 <div class="text-center">
			 		 <tag:paginate max="10" offset="${offset}" count="${count}" uri="detailCourse" next="&raquo;" previous="&laquo;"/>
			</div>
					
					
					
					
					
					
				</div>
				<!-- sidebar -->
				<div class="col-sm-8 col-md-5 col-lg-4 col-xl-3 offset-xl-1 offset-0 pl-xl-0 sidebar">
					<!-- widget -->
					<div class="widget">
						<form class="search-widget">
							<input type="text" placeholder="Search...">
							<button><i class="ti-search"></i></button>
						</form>
					</div>
					<!-- widget -->
					<div class="widget">
						<h5 class="widget-title">Recent News</h5>
						<div class="recent-post-widget">
							<!-- recent post -->
							<div class="rp-item">
								<div class="rp-thumb set-bg" data-setbg='<c:url value="/resources/img/blog/recent-post/1.jpg"/> '></div>
								<div class="rp-content">
									<h6>Snackable study:How to break up your master's degree</h6>
									<p><i class="fa fa-clock-o"></i> 24 Mar 2018</p>
								</div>
							</div>
							<!-- recent post -->
							<div class="rp-item">
								<div class="rp-thumb set-bg" data-setbg='<c:url value="/resources/img/blog/recent-post/2.jpg"/> '></div>
								<div class="rp-content">
									<h6>Op en University plans major ts to number of staff</h6>
									<p><i class="fa fa-clock-o"></i> 24 Mar 2018</p>
								</div>
							</div>
							<!-- recent post -->
							<div class="rp-item">
								<div class="rp-thumb set-bg" data-setbg='<c:url value="/resources/img/blog/recent-post/3.jpg"/> '></div>
								<div class="rp-content">
									<h6>My postgrad: ‘I worked on essays as giraffes walked by’</h6>
									<p><i class="fa fa-clock-o"></i> 24 Mar 2018</p>
								</div>
							</div>
							<!-- recent post -->
							<div class="rp-item">
								<div class="rp-thumb set-bg" data-setbg='<c:url value="/resources/img/blog/recent-post/4.jpg"/> '></div>
								<div class="rp-content">
									<h6>How to use the Guardian University Guide</h6>
									<p><i class="fa fa-clock-o"></i> 24 Mar 2018</p>
								</div>
							</div>
							<!-- recent post -->
							<div class="rp-item">
								<div class="rp-thumb set-bg" data-setbg='<c:url value="/resources/img/blog/recent-post/5.jpg"/> '></div>
								<div class="rp-content">
									<h6>My MBA experience: ‘It was an eye opener’</h6>
									<p><i class="fa fa-clock-o"></i> 24 Mar 2018</p>
								</div>
							</div>
							<!-- recent post -->
							<div class="rp-item">
								<div class="rp-thumb set-bg" data-setbg='<c:url value="/resources/img/blog/recent-post/6.jpg"/> '></div>
								<div class="rp-content">
									<h6>My MBA experience: ‘It was an eye opener’</h6>
									<p><i class="fa fa-clock-o"></i> 24 Mar 2018</p>
								</div>
							</div>
						</div>
					</div>
					<!-- widget -->
					<div class="widget">
						<h4 class="widget-title">Tags</h4>
						<div class="tags">
							<a href="#">DEVELOPMENT</a>
							<a href="#">BUSINESS</a>
							<a href="#">PROJECTS</a>
							<a href="#">GOOGLE ADWORDS</a>
							<a href="#">SQL DATABASE</a>
							<a href="#">MARKETING</a>
							<a href="#">DESIGN</a>
						</div>
					</div>
					<!-- widget -->
					<div class="widget">
						<h4 class="widget-title">Categories</h4>
						<ul>
							<li><a href="">Business</a></li>
							<li><a href="">Design</a></li>
							<li><a href="">Management</a></li>
							<li><a href="">Marketing Plans</a></li>
							<li><a href="">Construction</a></li>
							<li><a href="">Honored</a></li>
							<li><a href="">Program development</a></li>
							<li><a href="">My SQL database</a></li>
							<li><a href="">Google Adwords</a></li>
							<li><a href="">Education</a></li>
						</ul>
					</div>
					<!-- widget -->
					<div class="widget">
						<img src='<c:url value="/resources/img/ad.jpg"/> '>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Blog page section end -->


	<jsp:include page="/resources/include/news.jsp"></jsp:include>

	<jsp:include page="/resources/include/footersection.jsp"></jsp:include>

	<jsp:include page="/resources/include/footer.jsp"></jsp:include>
	
</body>
</html>