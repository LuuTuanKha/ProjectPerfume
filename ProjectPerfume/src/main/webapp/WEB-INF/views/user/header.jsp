<%@ page import="project.perfume.until.SecurityUtils" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  
    <title>HEADER</title>
	<meta charset="UTF-8">
	<meta name="description" content=" Divisima | eCommerce Template">
	<meta name="keywords" content="divisima, eCommerce, creative, html">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
</head>
<body>
    <div>
	<header class="header-section">
		<div class="header-top">
			<div class="container">
				<div class="row">
					<div class="col-lg-2 text-center text-lg-left" style="margin-top: 5px;">
						<!-- logo -->
						<a href="/ProjectPerfume/index" class="site-logo">
							<img src="<c:url value="/assets/img/logo.png"/>" alt="">
						</a>
					</div>
					<div class="col-xl-6 col-lg-5">
						<form class="header-search-form">
							<input type="text" placeholder="Tìm kiếm...">
							<button><i class="flaticon-search"></i></button>
						</form>
					</div>
					<div class="col-xl-4 col-lg-5">
						<div class="user-panel">
						<security:authorize access = "isAnonymous()">
							<div class="up-item">
								<i class="flaticon-profile"></i>
								<a href="/ProjectPerfume/register" class="text-primary">Đăng ký</a> hoặc <b><a href="/ProjectPerfume/login" style="color:#f51167">Đăng nhập</a></b>
							</div>
						</security:authorize>
						<security:authorize access = "isAuthenticated()">
					<div class="up-item">
								<i class="flaticon-profile"></i>
					<a href="/ProjectPerfume/profile" class="text-primary"></a> PRF<b> <%=SecurityUtils.getPrincipal().getFullName()%><a href="/ProjectPerfume/logout" style="color:#f51167">Đăng xuất</a></b>
					</div>
				</security:authorize>
							<div class="up-item">
								<div class="shopping-card">
									<i class="flaticon-bag"></i>
									<span>0</span>
								</div>
								<a href="/ProjectPerfume/checkout">Giỏ hàng</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<nav class="main-navbar" >
			<div class="container" align="center">
					
						<ul class="main-menu">
					<li><a href="${pageContext.request.contextPath}/index">Trang chủ</a></li>
					<li><a href="${pageContext.request.contextPath}/category?page=1&limit=12">Nước hoa nam</a></li>
					<li><a href="${pageContext.request.contextPath}/category?page=1&limit=12">Nước hoa nữ</a></li>
					<li><a href="${pageContext.request.contextPath}/category?page=1&limit=12">Bán chạy
						<span class="new">Hot</span>
					</a></li>
					
					<li><a href="/ProjectPerfume/product">Sản phẩm mới</a></li>
					<li><a href="#">Xem thêm</a>
						<ul class="sub-menu">
							<li><a href="/ProjectPerfume/category">Sản phẩm</a></li>
							
							<li><a href="${pageContext.request.contextPath}/contact">Thông tin</a></li>
							<li><a href="${pageContext.request.contextPath}/checkout">Thanh toán</a></li>
							<li><a href="${pageContext.request.contextPath}/contact">Liên hệ</a></li>
						</ul>
					</li>					
				</ul>
			</div>
		</nav>	
	</header>
    </div>
  <!-- <script src="js/jquery-3.2.1.min.js"></script> -->
	<!-- <script src="js/bootstrap.min.js"></script> -->
	<!-- <script src="js/jquery.slicknav.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.nicescroll.min.js"></script>
	<script src="js/jquery.zoom.min.js"></script>
	<script src="js/jquery-ui.min.js"></script> -->
	<script src="../assets/js/main.js"></script>

</body>
</html>