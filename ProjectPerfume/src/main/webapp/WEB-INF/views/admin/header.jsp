<%@ page import="project.perfume.until.SecurityUtils" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin header</title>
	<meta name="description" content=" Divisima | eCommerce Template">
	<meta name="keywords" content="divisima, eCommerce, creative, html">
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
							
						</div>
					</div>
				</div>
			</div>
		</div>
	<nav class="main-navbar" >
			<div class="container" align="center">
					
						<ul class="main-menu">
					<li><a href="/ProjectPerfume/admin/index">Trang chủ</a></li>
                    <li><a href="${pageContext.request.contextPath}/admin/product/list">   Quản lý sản phẩm</a>
						<ul class="sub-menu " >
							<li><a href="${pageContext.request.contextPath}/admin/product/list">Xem danh sách</a></li>
							
							<li><a href="${pageContext.request.contextPath}/admin/product/add">Thêm</a></li>
							<li><a href="../checkout.html">Sửa</a></li>
							<li><a href="../contact_0304.html">...</a></li>
						</ul>
                    </li>
					<!-- <li><a href="../category.html">Quản lý Sản phẩm</a></li> -->
					<li><a href="../category.html">Quản lý Khách hàng</a>
                        <ul class="sub-menu " >
							<li><a href="../category.html">Xem danh sách</a></li>
							
							<li><a href="../cart.html">Thêm</a></li>
							<li><a href="../checkout.html">Sửa</a></li>
							<li><a href="../contact_0304.html">...</a></li>
						</ul>
                    </li>
					<li><a href="/">Quản lý đơn hàng</a>
						<ul class="sub-menu " >
							<li><a href="../category.html">Xem danh sách</a></li>
							<li><a href="../cart.html">Thêm</a></li>
							<li><a href="../checkout.html">Sửa</a></li>
							<li><a href="../contact_0304.html">...</a></li>
						</ul>
					</li>
					
					<!-- <li><a href="../category.html">Sản phẩm mới</a></li> -->
					
									
				</ul>
			</div>
		</nav>	
	</header>
    </div>
<!--  <script src="../js/jquery-3.2.1.min.js"></script> 
	<script src="../js/bootstrap.min.js"></script>
	 <script src="../js/jquery.slicknav.min.js"></script> 
	<script src="../js/owl.carousel.min.js"></script>
	<script src="../js/jquery.nicescroll.min.js"></script>
	<script src="../js/jquery.zoom.min.js"></script>
	<script src="../js/jquery-ui.min.js"></script> 
	<script src="../js/main.js"></script> -->

</body>
</html>