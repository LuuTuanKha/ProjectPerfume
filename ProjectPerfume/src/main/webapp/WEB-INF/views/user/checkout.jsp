<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Page info -->
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
					<form class="checkout-form" name="${pageContext.request.contextPath}/checkout" action="${pageContext.request.contextPath}/checkout" method="POST">
						<div class="cf-title">Thông tin đơn hàng</div>
						<div class="row">
							<div class="col-md-7">
								<p>Thông tin thanh toán</p>
							</div>
							<div class="col-md-5">
								<div class="cf-radio-btns address-rb">
									<div class="cfr-item">
										<input type="radio" name="pm" id="one">
										<label for="one">Sử dụng địa chỉ mặc định</label>
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
								<h6> Tên người nhận:</h6>
								<input type="text" placeholder="Họ và tên người nhận" value="${user.userName}" name = "receiverName">
								<input type="text" placeholder="Địa chỉ" value="${user.getAdresses().addressName}" name = "reciverAdress">
								<input type="text" placeholder="Ghi chú" name = "comments">
							</div>
							
							<div class="col-md-12">
								<input type="text" placeholder="Số điện thoại" >
							</div>
								
						</div>
					
						<div class="cf-title">Thông tin vận chuyển</div>
						<div class="row shipping-btns">
							<div class="col-6">
								<h4>Giao hàng Tiêu chuẩn</h4>
							</div>
							<div class="col-6">
								<div class="cf-radio-btns">
									<div class="cfr-item">
										<input type="radio" name="shipping" id="ship-1">
										<label for="ship-1">Miễn phí</label>
									</div>
								</div>
							</div>
							</div>
							
					
						<button class="site-btn submit-order-btn" type="submit">Xác nhận đơn hàng</button>
					</form>
				</div>
				<div class="col-lg-4 order-1 order-lg-2">
					<div class="checkout-cart">
						<h3>Giỏ hàng</h3>
						<ul class="product-list">
							<c:forEach var="cart" items="${listCart}">
							<li>
								
								<h6>${cart.product.productName}   x ${cart.orderQty}</h6>
								<p>${cart.getSellPrice()} VNĐ</p>
								<h6>-----</h6>
							</li>
						
						</c:forEach>
						</ul>
						
						
						<ul >
						
							<h6 >Tổng tiền: </h6>
							<p ><span> ${total} VNĐ</span> <p>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- checkout section end -->

</body>
