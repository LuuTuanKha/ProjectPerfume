<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
     
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
				<a href="">Giỏ hàng</a>
			</div>
		</div>
	</div>
	<!-- Page info end -->


	<!-- cart section end -->
	<section class="cart-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">
					<div class="cart-table">
						<h3>Giỏ hàng</h3>
						<div class="cart-table-warp">
				
							<table>
							<thead>
								<tr>
									<th class="product-th">Sản phẩm</th>
									<th class="quy-th">Số lượng</th>
									<th class="size-th">Size</th>
									<th class="total-th">Giá</th>
								</tr>
							</thead>
							<tbody>
							<c:forEach var="cart" items="${listCart}">
								<tr>
									<td class="product-col">	
										<div class="pc-title">
											<h4>${cart.product.productName}</h4>
											<p>${cart.product.sellPrice} VNĐ</p>
										</div>
									</td>
									<td class="quy-col">
										<div  style=" border: 1px solid black; width: 83px; height: 35px; margin-left: 2px; border-radius: 15px; border: none;background-color: white;">
										<div style="text-align: center; padding-top: 7px;">
											<a href= "list?id=${cart.product.productId}&qtt=${cart.orderQty-1}"><input type="image" src="<c:url value="/assets/img/minus.png"/>" alt="tru" height="9px" width="9px" /></a>

											<input type="text" name="" value="${cart.orderQty}" id="soluong" style="border: none; width: 20px; height: 15px; margin-bottom: -6px; margin-left: 6px; margin-right: 6px, background-color:white ;" disabled/>

											<input type="image" src="<c:url value="/assets/img/add.png"/>" alt="cong" height="9px" width="9px"/></a>

										</div>
									</div>	
									</td>
									<td class="size-col"><h4>${cart.product.size} ml</h4></td>
									<td class="total-col" ><h4 >${cart.getSellPrice()}</h4>VNĐ
									</td>
									
								</tr>
								</c:forEach>
								
							</tbody>
						</table>
						
						</div>
						<div class="total-cost">
							<h6>Tổng cộng: ${total} VNĐ<span></span></h6>
						</div>
					</div>
				</div>
				<div class="col-lg-4 card-right">
					<form class="promo-code-form">
						<input type="text" placeholder="Mã giảm giá">
						<button>Xác nhận</button>
					</form>
					<a href="${pageContext.request.contextPath}/checkoutfromcart" class="site-btn">Tiến hành đặt hàng</a>
					<a href="" class="site-btn sb-dark">Tiếp tục mua hàng</a>
				</div>
			</div>
		</div>
	</section>
	<!-- cart section end -->

	<!-- Related product section -->
	<section class="related-product-section">
		<div class="container">
			<div class="section-title text-uppercase">
				<h2>SẢN PHẨM KHÁC</h2>
			</div>
			<div class="row">
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<div class="tag-new">New</div>
							<img src="<c:url value="/assets/img/product/1.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>170.000VND</h6>
							<p>CALI DREAMIN CROP SHIRT</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<img src="<c:url value="/assets/img/product/2.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>150.000VND</h6>
							<p>SLIGHT PANT </p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<img src="<c:url value="/assets/img/product/3.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>220.000VND</h6>
							<p>CHLOE SET </p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<img src="<c:url value="/assets/img/product/4.jpg"/>" alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>150.000VND</h6>
							<p>KAKI JACKET</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
