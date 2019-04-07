<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="vi">
<head>
	<%@ taglib prefix="tag" uri="/WEB-INF/taglibs/customTaglib.tld" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<jsp:include page="/resources/include/header.jsp"></jsp:include>
	<style type="text/css">
		#img{
		width: 330px;
		height:185.406px;
		}
	</style>
	
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


	<!-- Courses section -->
	<section class="full-courses-section spad pt-0">
		<div class="container">
		
		<form class="search-widget">
							<input type="text" placeholder="Search...">
							<button><i class="ti-search"></i></button>
		</form>
			<div class="row">
				<!-- course item -->


      
      <div class="modal-body">
        <form method="post" action="course">
          <div class="form-group">
            <label for="name" class="col-form-label">Name type:</label>
            <input type="text" class="form-control" id="name" name="name">
          </div>
          <div class="form-group">
            <label for="imag" class="col-form-label">Image:</label>
            <input type="text" class="form-control" id="imag" name="imag">
          </div>
           <div class="form-group">
            <label for="descrip" class="col-form-label">Description:</label>
            <input type="text" class="form-control" id="descrip" name="descrip">
          </div>
         <button type="submit" class="btn btn-primary">Add</button>
        </form>
      </div>
      
    

				<c:forEach var="typeCourse" items="${listTypeCourse}" varStatus="itr">
				
				<div class="col-lg-3 col-md-6 course-item">
				<a href="detailCourse/${typeCourse.getId_type_course()}">
					<div class="course-thumb">
						<img  id="img"  src='<c:url value="/resources/img/${typeCourse.getImag()}"/> '>
						
						<div class="course-cat">
							<span>${typeCourse.getName()}</span>
						</div>
						
					</div>
					<div class="course-info">
						<h4>${offset + itr.index +1 }. ${typeCourse.getDescrip()}</h4>
					</div>
					
					</a>
					<button><a href = "course/${typeCourse.getId_type_course()}">Delete</a></button>
				</div>
				
			</c:forEach>
			</div>
			
			 <div class="text-center">
			 		 <tag:paginate max="10" offset="${offset}" count="${count}" uri="course" next="&raquo;" previous="&laquo;"/>
			</div>
		</div>
	</section>
	<!-- Courses section end-->

	<jsp:include page="/resources/include/news.jsp"></jsp:include>

	<jsp:include page="/resources/include/footersection.jsp"></jsp:include>

	<jsp:include page="/resources/include/footer.jsp"></jsp:include>
</body>
</html>