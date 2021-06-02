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
			<h4>SẢN PHẨM</h4>
			<div class="site-pagination">
				<a href="">Trang chủ</a> /
				<a href="">Sản phẩm</a>
			</div>
		</div>
	</div>
	<!-- Page info end -->
	 <div class="modal show" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Thêm thành công</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
       
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Đóng</button>
        </div>
        
      </div>
    </div>
  </div>
  <div class="modal show" id="myModalFail">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Thêm thất bại</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
       <div class="modal-body">
          Sản phẩm đã có trong giỏ hàng của bạn
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Đóng</button>
        </div>
        
      </div>
    </div>
  </div>

	<!-- product section -->
	<section class="product-section">
		<div class="container">
			<div class="back-link">
				<a href="/ProjectPerfume/category?page=1&limit=12"> &lt;&lt; Quay lại mua sắm</a>
			</div>
			<div class="row">
				<div class="col-lg-6">
					<div class="product-pic-zoom">
						<img class="product-big-img" src="<c:url value="/assets/img/single-product/1.jpg"/>" alt="">
					</div>
					<div class="product-thumbs" tabindex="1" style="overflow: hidden; outline: none;">
						<div class="product-thumbs-track">
							<div class="pt active" data-imgbigurl="img/single-product/1.jpg"><img src="img/single-product/thumb-1.jpg" alt=""></div>
							<div class="pt" data-imgbigurl="src="<c:url value="/assets/img/single-product/2.jpg"/> ><img src="img/single-product/thumb-2.jpg" alt=""></div>
							<div class="pt" data-imgbigurl="img/single-product/3.jpg"><img src="src="<c:url value="/assets/img/single-product/3.jpg"/>"" alt=""></div>
							<div class="pt" data-imgbigurl="img/single-product/4.jpg"><img src="src="<c:url value="/assets/img/single-product/4.jpg"/>"" alt=""></div>
						</div>
					</div>
				</div>
				<div class="col-lg-6 product-details">
					<h2 class="p-title">${product.productName}</h2>
					<h3 class="p-price">${product.sellPrice} VNĐ</h3>
					<h4 class="p-stock">Số lượng: <span>${product.quantity}</span></h4>
					
					<div class="p-review">
						
					</div>
					<div class="fw-size-choose">
						<p>Size:</p>
							<div class="sc-item">
								<input type="radio" name="sc" id="m-size" checked=""> <label
									for="m-size">300</label>   ml
							</div>
						
				
					</div>
					<form name="${pageContext.request.contextPath}/product/addtocart" action="${pageContext.request.contextPath}/product/addtocart" method="POST" >
					<div class="quantity">
						<p>Số lượng</p>
                        <div class="pro-qty"><input type="text" value="1" name= "qtt"></div>
                    </div>
                    <input type="hidden" value="${product.id}" name = "id">
                    
                   
					<a ><button class="site-btn " type = "submit">THÊM VÀO GIỎ HÀNG</button></a>
					<br><br>
					<a  class="site-btn" href="${pageContext.request.contextPath}/checkoutfromcart">THANH TOÁN</a>
					</form>
					<div id="accordion" class="accordion-area">
						<div class="panel">
							<div class="panel-header" id="headingOne">
								<button class="panel-link active" data-toggle="collapse" data-target="#collapse1" aria-expanded="true" aria-controls="collapse1">Mô tả:</button>
							</div>
							<div id="collapse1" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
								<div class="panel-body">
									<p>Áo dài cách tân là sự kết hợp độc đáo giữa áo dài truyền thống và phong cách hiện đại. Mang lại vẻ đẹp nhẹ nhàng thuần khiết của người con gái Việt.</p>
									<p>Được thiết kế bởi nhà thiết kế chuyên nghiệp Khánh Ly</p>
									<p>Sản phẩm được may thủ công bởi những thợ may áo dài Huế.</p>
									<p>...</p>
								</div>
							</div>
						</div>
						<div class="panel">
							<div class="panel-header" id="headingTwo">
								<button class="panel-link" data-toggle="collapse" data-target="#collapse2" aria-expanded="false" aria-controls="collapse2">phương thức thanh toán </button>
							</div>
							<div id="collapse2" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
								<div class="panel-body">
									<img src="./img/cards.png" alt="">
									<p>Bạn có thể thanh toán bằng tất cả các thẻ nội địa, VISA và MasterCard. Cũng như các ví điện tử online.</Var></p>
								</div>
							</div>
						</div>
						<div class="panel">
							<div class="panel-header" id="headingThree">
								<button class="panel-link" data-toggle="collapse" data-target="#collapse3" aria-expanded="false" aria-controls="collapse3">Giao hàng & Trả hàng</button>
							</div>
							<div id="collapse3" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
								<div class="panel-body">
									<h4> Đổi trả : 7 Ngày sau khi nhận hàng.</h4>
									<p>Vui lòng mang theo tiền mặt khi nhận hàng<br>Giao hàng tận nhà: <span>3 - 4 ngày</span></p>
									<p>Quý khách vui lòng kiểm trả kỹ hàng trước khi nhận.</p>
								</div>
							</div>
						</div>
					</div>
					<div class="social-sharing">
						<a href=""><i class="fa fa-google-plus"></i></a>
						<a href=""><i class="fa fa-pinterest"></i></a>
						<a href=""><i class="fa fa-facebook"></i></a>
						<a href=""><i class="fa fa-twitter"></i></a>
						<a href=""><i class="fa fa-youtube"></i></a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- product section end -->


	<!-- RELATED PRODUCTS section -->
	<section class="related-product-section">
		<div class="container">
			<div class="section-title">
				<h2>RELATED PRODUCTS</h2>
			</div>
			<div class="product-slider owl-carousel">
				<div class="product-item">
					<div class="pi-pic">
						<img src="<c:url value="/assets/img/product/1.jpg"/>" alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
							<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
					</div>
					<div class="pi-text">
						<h6>$35,00</h6>
						<p>Flamboyant Pink Top </p>
					</div>
				</div>
				<div class="product-item">
					<div class="pi-pic">
						<div class="tag-new">New</div>
						<img src="<c:url value="/assets/img/product/2.jpg"/>"  alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
							<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
					</div>
					<div class="pi-text">
						<h6>$35,00</h6>
						<p>Black and White Stripes Dress</p>
					</div>
				</div>
				<div class="product-item">
					<div class="pi-pic">
						<img src="<c:url value="/assets/img/product/3.jpg"/>"  alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
							<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
					</div>
					<div class="pi-text">
						<h6>$35,00</h6>
						<p>Flamboyant Pink Top </p>
					</div>
				</div>
				<div class="product-item">
						<div class="pi-pic">
							<img src="<c:url value="/assets/img/product/4.jpg"/>"  alt="">
							<div class="pi-links">
								<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
								<a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>$35,00</h6>
							<p>Flamboyant Pink Top </p>
						</div>
					</div>
				<div class="product-item">
					<div class="pi-pic">
						<img src="<c:url value="/assets/img/product/6.jpg"/>"  alt="">
						<div class="pi-links">
							<a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
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
	<script type="text/javascript">
	$(window).on('load',function(){
    var delayMs = 0; // delay in milliseconds
    var modalvalue = ${status};
    if (modalvalue == 1)
    setTimeout(function(){
        $('#myModal').modal('show');
    }, delayMs);
   
	if (modalvalue == -1)
	    setTimeout(function(){
	        $('#myModalFail').modal('show');
	    }, delayMs);
		   
	}); 
	</script>
</body>
