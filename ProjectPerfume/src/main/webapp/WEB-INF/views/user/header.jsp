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
	<!-- Favicon -->
	<!-- <link href="img/favicon.ico" rel="shortcut icon"/> -->

	<!-- Google Font -->
	<!-- <link href="https://fonts.googleapis.com/css?family=Josefin+Sans:300,300i,400,400i,700,700i" rel="stylesheet"> -->

		<!-- Stylesheets -->
	<!-- <link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/font-awesome.min.css"/>
	<link rel="stylesheet" href="css/flaticon.css"/>
	<link rel="stylesheet" href="css/slicknav.min.css"/> -->
	<!-- <link rel="stylesheet" href="css/jquery-ui.min.css"/> -->
	<!-- <script
    src="https://code.jquery.com/jquery-3.3.1.js"
    integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
    crossorigin="anonymous">
</script> -->
	<!-- <link rel="stylesheet" href="css/jquery-ui.min.css"/> -->
	<!-- <link rel="stylesheet" href="css/owl.carousel.min.css"/>
	<link rel="stylesheet" href="css/animate.css"/>
	<link rel="stylesheet" href="css/style.css"/> -->
	
	<!-- Stylesheets -->
	<!-- <link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/font-awesome.min.css"/>
	<link rel="stylesheet" href="css/flaticon.css"/>
	<link rel="stylesheet" href="css/slicknav.min.css"/>
	<link rel="stylesheet" href="css/jquery-ui.min.css"/>
	<link rel="stylesheet" href="css/owl.carousel.min.css"/>
	<link rel="stylesheet" href="css/animate.css"/>
	<link rel="stylesheet" href="css/style.css"/> -->


	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
	<script type="text/javascript" src="<c:url value="/assets/js/main.js"/>"></script>
</head>
<body>
    <div>
	<header class="header-section">
		<div class="header-top">
			<div class="container">
				<div class="row">
					<div class="col-lg-2 text-center text-lg-left" style="margin-top: 5px;">
						<!-- logo -->
						<a href="${pageContext.request.contextPath}/index" class="site-logo">
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
							<div class="up-item">
								<i class="flaticon-profile"></i>
								<a href="/ProjectPerfume/login/index_signup" class="text-primary">Đăng ký ${para} </a> hoặc <b><a href="/ProjectPerfume/index_login" style="color:#f51167">Đăng nhập</a></b>
							</div>
							<div class="up-item">
								<div class="shopping-card">
									<i class="flaticon-bag"></i>
									<span>0</span>
								</div>
								<a href="/ProjectPerfume/checkout_0304">Giỏ hàng</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<nav class="main-navbar" >
			<div class="container" align="center">
					
						<ul class="main-menu">
					<li><a href="/ProjectPerfume/index">Trang chủ</a></li>
					<li><a href="/ProjectPerfume/product">Nước hoa nam</a></li>
					<li><a href="/ProjectPerfume/category">Nước hoa nữ</a></li>
					<li><a href="/ProjectPerfume/category">Bán chạy
						<span class="new">Hot</span>
					</a></li>
					
					<li><a href="/ProjectPerfume/product">Sản phẩm mới</a></li>
					<li><a href="#">Xem thêm</a>
						<ul class="sub-menu">
							<li><a href="/ProjectPerfume/category">Sản phẩm</a></li>
							
							<li><a href="/ProjectPerfume/contact">Thông tin</a></li>
							<li><a href="/ProjectPerfume/checkout">Thanh toán</a></li>
							<li><a href="/ProjectPerfume/contact">Liên hệ</a></li>
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