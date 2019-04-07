<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	
	<jsp:include page="/resources/include/herosection.jsp"></jsp:include>

	<jsp:include page="/resources/include/countersection.jsp"></jsp:include>
	
	<jsp:include page="/resources/include/services.jsp"></jsp:include>
	
	<jsp:include page="/resources/include/enroll.jsp"></jsp:include>

	<jsp:include page="/resources/include/courses.jsp"></jsp:include>

	<jsp:include page="/resources/include/fact.jsp"></jsp:include>
	
	<jsp:include page="/resources/include/event.jsp"></jsp:include>

	<jsp:include page="/resources/include/gallery.jsp"></jsp:include>

	<jsp:include page="/resources/include/blog.jsp"></jsp:include>
	
	<jsp:include page="/resources/include/news.jsp"></jsp:include>

	<jsp:include page="/resources/include/footersection.jsp"></jsp:include>

	<jsp:include page="/resources/include/footer.jsp"></jsp:include>

</body>
</html>