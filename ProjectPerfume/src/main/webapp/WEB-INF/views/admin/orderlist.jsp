<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorate"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
	<div class="container">
		<h2>Đơn hàng của bạn</h2>



		<table class="table table table-striped">
			<thead>
				<tr>
					<th scope="col">Mã đơn hàng</th>
					<th scope="col">Ngày đặt hàng</th>

					<th scope="col">Tổng tiền</th>
					<th scope="col">Trạng thái đơn hàng</th>
				
					
					<th scope="col">Quản lý đơn hàng</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="b" items="${listHeader}" varStatus="i">
					<tr>
						<th scope="row">${b.saleOrderHeaderID}</th>
						<td>${b.orderDate}</td>
						<td>${b.subTotal}</td>
						<td>${b.status}</td>
						

						<td><a class="btn btn-light" href="${pageContext.request.contextPath}/myorder/view?id=${b.saleOrderHeaderID}" >Xem chi tiết</a>
						<c:if test = "${b.status =='Dang cho Giao Hang'}">
						
						<a class="btn btn-light" href="${pageContext.request.contextPath}/admin/order/complete?id=${b.saleOrderHeaderID}" >Hoàn thành đơn hàng</a>
						
					
        					<a class="btn btn-danger" href="product/delete?id=${b.saleOrderHeaderID}" data-toggle="modal"
							data-target="#myModalDelete${b.saleOrderHeaderID}">Huỷ đơn</a>
      </c:if>
							
						</td>



					</tr>
					
					<div class="modal" id="myModalDelete${b.saleOrderHeaderID}">
						<div class="modal-dialog">
							<div class="modal-content">

								<!-- Modal Header -->
								<div class="modal-header">
									<h4 class="modal-title">Bạn có chắc muốn huỷ đơn hàng này không?</h4>
									<button type="button" class="close" data-dismiss="modal">&times;</button>
								</div>

								<!-- Modal body -->
								<div class="modal-body">
								<h4>ID: ${b.saleOrderHeaderID}</h4>
								<h4>Tên sản phẩm: ${b.saleOrderHeaderID}</h4>
								
								</div>

								<!-- Modal footer -->
								<div class="modal-footer">
								<a href="${pageContext.request.contextPath}/myorder/delete?id=${b.saleOrderHeaderID}"><button type="button" class="btn btn-danger"
										 >Huỷ đơn</button></a>
									<button type="button" class="btn btn-danger"
										data-dismiss="modal">Đóng</button>
								</div>

							</div>
						</div>
					</div>
					<!--  -->
					<div class="modal" id="myModalView${b.saleOrderHeaderID}">
						<div class="modal-dialog">
							<div class="modal-content">

								<!-- Modal Header -->
								<div class="modal-header">
									<h4 class="modal-title">Chi tiết đơn hàng: ${b.saleOrderHeaderID}</h4>
									<button type="button" class="close" data-dismiss="modal">&times;</button>
								</div>

								<!-- Modal body -->
								<div class="modal-body">
								<h4>ID: ${b.saleOrderHeaderID}</h4>
								<h4>Tên sản phẩm: ${b.saleOrderHeaderID}</h4>
								
								</div>

								<!-- Modal footer -->
								<div class="modal-footer">
								<a href="${pageContext.request.contextPath}/myorder/delete?id=${b.saleOrderHeaderID}"><button type="button" class="btn btn-danger"
										 >Huỷ đơn</button></a>
									<button type="button" class="btn btn-danger"
										data-dismiss="modal">Đóng</button>
								</div>

							</div>
						</div>
					</div>
					
				</c:forEach>


			</tbody>
		</table>
	</div>
	<script type="text/javascript">
		$(window).on('load', function() {
			$('#myModal').modal('show');
		});
	</script>

</body>
