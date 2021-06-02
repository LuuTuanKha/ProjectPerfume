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
			<h4>CHI TIẾT ĐƠN HÀNG</h4>
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
						<h3>CHI TIẾT ĐƠN HÀNG</h3>
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
							<c:forEach var="cart" items="${listDetails}">
								<tr>
									<td class="product-col">	
										<div class="pc-title">
											<h4>${cart.product.productName}</h4>
											<p>${cart.product.sellPrice} VNĐ</p>
										</div>
									</td>
									<td class="quy-col">
										
											<h6 >${cart.orderQty}</h6>

											
										
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
				
			</div>
		</div>
	</section>
	<!-- cart section end -->

	<!-- Related product section -->
	</body>
