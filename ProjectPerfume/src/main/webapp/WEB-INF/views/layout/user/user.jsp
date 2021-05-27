<%@ page import="project.perfume.until.SecurityUtils" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorate" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

	
		<!-- Stylesheets -->
	<link rel="stylesheet" href="<c:url value = "/assets/css/bootstrap.min.css"/>"/>
	<link rel="stylesheet" href="<c:url value = "/assets/css/font-awesome.min.css"/>"/>
	<link rel="stylesheet" href="<c:url value = "/assets/css/flaticon.css"/>"/>
	<link rel="stylesheet" href="<c:url value = "/assets/css/slicknav.min.css"/>"/>	

	<!-- <script
    src="https://code.jquery.com/jquery-3.3.1.js"
    integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
    crossorigin="anonymous">
</script> -->
	<!-- <link rel="stylesheet" href="css/jquery-ui.min.css"/> -->
	<link rel="stylesheet" href="<c:url value="/assets/css/jquery-ui.min.css"/>"/>
	<link rel="stylesheet" href="<c:url value = "/assets/css/owl.carousel.min.css"/>"/>
	<link rel="stylesheet" href="<c:url value = "/assets/css/animate.css"/>"/>
	<link rel="stylesheet" href="<c:url value="/assets/css/style.css"/>"/>
	<link rel="stylesheet" href="<c:url value = "/assets/css/style_0304.css"/>"/>
		<link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/nunito-font.css"/>" />
	<!-- Main Style Css -->
    <link rel="stylesheet" href="<c:url value="/assets/css/stylelogin.css"/>" />
		<script type="text/javascript" src="<c:url value = "/assets/js/jquery-3.3.1.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value = "/assets/js/bootstrap.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/assets/js/jquery.twbsPagination.js"/>"></script>

	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
	
</head>
    
</head>
<body>
	
	<!-- Page Preloder -->
	<!--	
	 <div id="preloder">
		<div class="loader"></div>
	</div> 
	-->
	<%@include file="/WEB-INF/views/user/header.jsp"%>
	<!-- Header section -->
	<!-- Header section end -->


	<!-- Hero section slide bar -->
	
	<decorate:body />
	<!-- Banner section end  -->

	<!-- Footer section -->
<%@include file="/WEB-INF/views/user/footer.jsp"%>
	<!-- Footer section end -->



	<!--====== Javascripts & Jquery ======-->
	<script type="text/javascript" src="<c:url value = "/assets/js/jquery.slicknav.min.js"/>"></script>	
	<script type="text/javascript" src="<c:url value = "/assets/js/owl.carousel.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value = "/assets/js/jquery.nicescroll.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value = "/assets/js/jquery.zoom.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value = "/assets/js/jquery-ui.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/assets/js/main.js"/>"></script>
	<!-- <script src="js/main.js"></script> -->
	
	</body>
</html>
