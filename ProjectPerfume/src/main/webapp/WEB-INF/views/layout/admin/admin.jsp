<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorate" %>
 <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html lang="vi">
<head>
	<title>TK'Shop | Trang chủ</title>
	<meta charset="UTF-8">
	<meta name="description" content=" Divisima | eCommerce Template">
	<meta name="keywords" content="divisima, eCommerce, creative, html">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- Favicon -->
	<link href="<c:url value = "/assets/img/favicon.ico" />" rel="shortcut icon"/>
	
	<!-- Google Font -->
	<link href="<c:url value = "https://fonts.googleapis.com/css?family=Josefin+Sans:300,300i,400,400i,700,700i"/>" rel="stylesheet">
	<link rel="stylesheet" href="<c:url value = "/assets/css/bootstrap.min.css"/>"/>
	<link rel="stylesheet" href="<c:url value = "/assets/css/font-awesome.min.css"/>"/>
	<link rel="stylesheet" href="<c:url value = "/assets/css/flaticon.css"/>"/>
	<link rel="stylesheet" href="<c:url value = "/assets/css/slicknav.min.css"/>"/>	
	<link rel="stylesheet" href="<c:url value="/assets/css/jquery-ui.min.css"/>"/>
		<link rel="stylesheet" href="<c:url value = "/assets/css/owl.carousel.min.css"/>"/>
	<link rel="stylesheet" href="<c:url value = "/assets/css/animate.css"/>"/>
	<link rel="stylesheet" href="<c:url value="/assets/css/style.css"/>"/>
	<link rel="stylesheet" href="<c:url value = "/assets/css/style_0304.css"/>"/>
		<link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/nunito-font.css"/>" />
	<!-- Main Style Css -->
    <link rel="stylesheet" href="<c:url value="/assets/css/stylelogin.css"/>" />

	
</head>
<body>
	
	<!-- Page Preloder -->
	<!--	
	 <div id="preloder">
		<div class="loader"></div>
	</div> 
	-->
	<%@include file="/WEB-INF/views/admin/header.jsp"%>
	<!-- Header section -->
	<!-- Header section end -->


	<!-- Hero section slide bar -->
	
	<decorate:body />
	<!-- Banner section end  -->

	<!-- Footer section -->
<%@include file="/WEB-INF/views/user/footer.jsp"%>
	<!-- Footer section end -->



	<!--====== Javascripts & Jquery ======-->
	<script src="<c:url value = "/assets/js/jquery-3.2.1.min.js"/>"></script>
	<script src="<c:url value = "/assets/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value = "/assets/js/jquery.slicknav.min.js"/>"></script>	
	<script src="<c:url value = "/assets/js/owl.carousel.min.js"/>"></script>
	<script src="<c:url value = "/assets/js/jquery.nicescroll.min.js"/>"></script>
	<script src="<c:url value = "/assets/js/jquery.zoom.min.js"/>"></script>
	<script src="<c:url value = "/assets/js/jquery-ui.min.js"/>"></script>
		<script src="<c:url value="/assets/js/main.js"/>"></script>
	<!-- <script src="js/main.js"></script> -->
	
	</body>
</html>
