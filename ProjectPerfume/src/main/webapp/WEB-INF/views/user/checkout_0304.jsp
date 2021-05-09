<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="page-top-info">
		<div class="container">
			<h4>Giỏ hàng</h4>
			<div class="site-pagination">
				<a href="">Trang chủ</a> /
				<a href="">Giỏ hàng </a>
			</div>
		</div>
	</div>
	<!-- Page info end -->


	<!-- checkout section  -->
	<section class="checkout-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 order-2 order-lg-1">
					<form class="checkout-form">
						<div class="cf-title">Thông tin thanh toán</div>
						<div class="row">
							<div class="col-md-7" style="font-weight: bold;" >
								<p>Thông tin thanh toán</p>
							</div>
							<div class="col-md-5">
								<div class="cf-radio-btns address-rb">
									<div class="cfr-item">
										<input type="radio" name="pm" id="one">
										<label for="one">Dùng địa chỉ mặc định</label>
									</div>
									<div class="cfr-item">
										<input type="radio" name="pm" id="two">
										<label for="two">Sử dụng địa chỉ khác</label>
									</div>
								</div>
							</div>
						</div>
						<div class="row address-inputs">
							<div class="col-md-12">
								<input type="text" placeholder="Họ và tên">
								<input type="text" placeholder="Email">
								<input type="text" placeholder="Địa chị">
							</div>
							<div class="col-md-6">
								<input type="text" placeholder="Tỉnh/Thành phố">
							</div>
							<div class="col-md-6">
								<input type="text" placeholder="Số điện thoại">
							</div>
						</div>
						<div class="cf-title">Thông tin vận chuyển</div>
						<div class="row shipping-btns">
							<div class="col-6">
								<h4>Tiêu chuẩn</h4>
							</div>
							<div class="col-6">
								<div class="cf-radio-btns">
									<div class="cfr-item">
										<input type="radio" name="shipping" id="ship-1">
										<label for="ship-1">Miễn phí</label>
									</div>
								</div>
							</div>
							<div class="col-6">
								<h4>Giao hàng nhanh </h4>
							</div>
							<div class="col-6">
								<div class="cf-radio-btns">
									<div class="cfr-item">
										<input type="radio" name="shipping" id="ship-2">
										<label for="ship-2">23.000VND</label>
									</div>
								</div>
							</div>
						</div>
						<div class="cf-title">Thanh toán</div>
						<ul class="payment-list">							
							<li>Thanh toán khi nhận hàng</li>
								<li>Thanh toán tại cửa hàng</li>
						</ul>
						<button class="site-btn submit-order-btn">Xác nhận đơn hàng</button>
					</form>
				</div>
				<div class="col-lg-4 order-1 order-lg-2">
					<div class="checkout-cart">
						<h3>Giỏ hàng</h3>
						<ul class="product-list">
							<li>
								<div class="pl-thumb"><img src="<c:url value="/assets/img/cart/1.jpg"/>" alt=""></div>
								<h6>Animal Print Dress</h6>
								<p>$45.90</p>
							</li>
							<li>
								<div class="pl-thumb"><img src="<c:url value="/assets/img/cart/2.jpg"/>" alt=""></div>
								<h6>Animal Print Dress</h6>
								<p>$45.90</p>
							</li>
						</ul>
						<ul class="price-list">
							<li>Tổng tiền<span>$99.90</span></li>
							<li>Shipping<span>free</span></li>
							<li class="total">Tổng tiền<span>$99.90</span></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- checkout section end -->
</body>
