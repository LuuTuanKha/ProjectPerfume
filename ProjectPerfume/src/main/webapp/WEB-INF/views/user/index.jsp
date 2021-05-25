<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<head>
<meta charset="UTF-8">
<title>TK'Shop - Trang chủ</title>
</head>
<body>
<section class="hero-section">
		<div class="hero-slider owl-carousel">
			<div class="hs-item set-bg" data-setbg="<c:url value="/assets/img/bg.jpg"/>" >
				<div class="container">
					<div class="row">
						<div class="col-xl-6 col-lg-7 text-white">
							<span>Sản phẩm mới</span>
							<h2>Áo dài <br>cách tân</h2>
							<p>Một sự lựa chọn hoàn hảo cho những cô nàng truyền thống. Vừa hợp thời trang, vừa tôn lên vẻ đẹp của người con gái Việt. </p>
							<a href="./product.html" class="site-btn sb-line">XEM NGAY</a>
							<a href="./checkout_0304.html" class="site-btn sb-white">MUA NGAY</a>
						</div>
					</div>
					<div class="offer-card text-white">
						<span>Chỉ từ</span>
						<h2>200K</h2>
						<p>MUA NGAY</p>
					</div>
				</div>
			</div>
			<div class="hs-item set-bg" data-setbg="<c:url value="/assets/img/"/>">
				<div class="container">
					<div class="row">
						<div class="col-xl-6 col-lg-7 text-white">
							<span>Sản phẩm mới</span>
							<h2>Áo khoác Local Brands</h2>
							<p>Thể hiện cá tính với phong cách thiết kế Việt. </p>
							<a href="./product.html" class="site-btn sb-line">XEM NGAY</a>
							<a href="./checkout_0304.html" class="site-btn sb-white">MUA NGAY</a>
						</div>
					</div>
					<div class="offer-card text-white">
						<span>CHỈ TỪ</span>
						<h2>$200K</h2>
						<p>MUA NGAY</p>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="slide-num-holder" id="snh-1"></div>
		</div>
		
	</section>
	<!-- Hero section end -->



	<!-- Features section -->
	<!-- <section class="features-section">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-4 p-0 feature">
					<div class="feature-inner">
						<div class="feature-icon">
							<img src="img/icons/1.png" alt="#">
						</div>
						<h2>Thanh toán tiện lợi</h2>
					</div>
				</div>
				<div class="col-md-4 p-0 feature">
					<div class="feature-inner">
						<div class="feature-icon">
							<img src="img/icons/2.png" alt="#">
						</div>
						<h2>Sản phẩm chính hãng</h2>
					</div>
				</div>
				<div class="col-md-4 p-0 feature">
					<div class="feature-inner">
						<div class="feature-icon">
							<img src="img/icons/3.png" alt="#">
						</div>
						<h2>Giao hàng miễn phí</h2>
					</div>
				</div>
			</div>
		</div>
	</section> -->
	<!-- Features section end -->


	<!-- letest product section -->
	<section class="top-letest-product-section">
		<div class="container">
			<div class="section-title">
				<h2>SẢN PHẨM MỚI</h2>
			</div>
			<div class="product-slider owl-carousel">
				<div class="product-item">
					<div class="pi-pic">
						<img src="<c:url value="/assets/img/product/1.jpg"/>" alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>CHỌN MUA</span></a>
							<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
					</div>
					<div class="pi-text">
						<h6>199,000 VNĐ</h6>
						<p>Áo phông trắng cách điệu  </p>
					</div>
				</div>
				<div class="product-item">
					<div class="pi-pic">
						<div class="tag-new">New</div>
						<img src="<c:url value="/assets/img/product/2.jpg"/>" alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>CHỌN MUA</span></a>
							<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
					</div>
					<div class="pi-text">
						<h6>$35,00</h6>
						<p>Combo Trắng/Đen Vintage</p>
					</div>
				</div>
				<div class="product-item">
					<div class="pi-pic">
						<a href="./product.html"><img src="<c:url value="/assets/img/product/3.jpg"/>" alt="" ></a>
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>CHỌN MUA</span></a>
							
						</div>
					</div>
					<div class="pi-text">
						<h6>499,000 VNĐ</h6>
						<p>Áo dài cách tân </p>
					</div>
				</div>
				<div class="product-item">
						<div class="pi-pic">
							<img src="<c:url value="/assets/img/product/4.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>CHỌN MUA</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>350,000 VNĐ</h6>
							<p>Quần Jeans Xanh Phong cách Vintage </p>
						</div>
					</div>
				<div class="product-item">
						<div class="pi-pic">
							<img src="<c:url value="/assets/img/product/6.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>CHỌN MUA</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>$35,00</h6>
							<p>Flamboyant Pink Top </p>
						</div>
					</div>
			</div>
		</div>
	</section>
	<!-- letest product section end -->



	<!-- Product filter section -->
	<section class="product-filter-section">
		<div class="container">
			<div class="section-title">
				<h2>SẢN PHẨM HOT</h2>
			</div>
			<ul class="product-filter-menu">
				<li><a href="#">TOPS</a></li>
				<li><a href="#">JUMPSUITS</a></li>
				<li><a href="#">LINGERIE</a></li>
				<li><a href="#">JEANS</a></li>
				<li><a href="#">DRESSES</a></li>
				<li><a href="#">COATS</a></li>
				<li><a href="#">JUMPERS</a></li>
				<li><a href="#">LEGGINGS</a></li>
			</ul>
			<div class="row">
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<img src="<c:url value="/assets/img/product/5.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>CHỌN MUA</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>450,000 VNĐ</h6>
							<p>Váy ngủ trắng </p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<div class="tag-sale">ON SALE</div>
							<img src="<c:url value="/assets/img/product/6.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>CHỌN MUA</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>599,000 VNĐ</h6>
							<p>Quần Kaki đen</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<img src="<c:url value="/assets/img/product/7.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>CHỌN MUA</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>499,000 VNĐ</h6>
							<p>Áo dài truyền thống </p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<img src="<c:url value="/assets/img/product/8.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>CHỌN MUA</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>750,000 VNĐ</h6>
							<p>Váy xẻ tà </p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<img src="<c:url value="/assets/img/product/9.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>CHỌN MUA</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>399,000 VNĐ</h6>
							<p>Áo thun đen StreetWear </p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<img src="<c:url value="/assets/img/product/10.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>CHỌN MUA</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>249,000 VNĐ</h6>
							<p>Túi dạ quang</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<img src="<c:url value="/assets/img/product/11.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>CHỌN MUA</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>399,000 VNĐ</h6>
							<p>Áo khoác Hades #110 </p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<img src="<c:url value="/assets/img/product/12.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>CHỌN MUA</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>700,000 VNĐ</h6>
							<p>Áo khoác Hades #495 </p>
						</div>
					</div>
				</div>
			</div>
			<div class="text-center pt-5">
				<button class="site-btn sb-line sb-dark">XEM THÊM</button>
			</div>
		</div>
	</section>
	<!-- Product filter section end -->


	<!-- Banner section -->
	<section class="banner-section">
		<div class="container">
			<div class="banner set-bg" data-setbg="<c:url value="/assets/img/banner-bg.jpg"/>">
				<div class="tag-new">mới</div>
				<span>Phong cách mới</span>
				<h2>ÁO SƠ MI</h2>
				<a href="#" class="site-btn">MUA NGAY</a>
			</div>
		</div>
	</section>
	<!-- Banner section end  -->
</body>
