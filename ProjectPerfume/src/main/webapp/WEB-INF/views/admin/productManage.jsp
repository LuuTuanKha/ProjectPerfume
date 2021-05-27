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
		<h2>Quản lý sản phẩm</h2>



		<table class="table table table-striped">
			<thead>
				<tr>
					<th scope="col">Tên sản phẩm</th>
					<th scope="col">Giá bán</th>

					<th scope="col">Đã bán</th>
					<th scope="col">Hình ảnh</th>
					<th scope="col">Quản lý</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="b" items="${products}" varStatus="i">
					<tr>
						<th scope="row">${b.productName}</th>
						<td>${b.sellPrice}</td>
						<td>${b.selledQTT}</td>

						<td><a class="btn btn-light"
							href="product/update?id=${b.productId}" data-toggle="modal"
							data-target="#myModalImage${b.productId}">Xem</a></td>

						<td><a class="btn btn-light"
							href="product/update?id=${b.productId}">Cập nhật</a> <a
							class="btn btn-danger" href="product/delete?id=${b.productId}" data-toggle="modal"
							data-target="#myModalDelete${b.productId}">Xoá</a>
						</td>



					</tr>
					<div class="modal" id="myModalImage${b.productId}">
						<div class="modal-dialog">
							<div class="modal-content">

								<!-- Modal Header -->
								<div class="modal-header">
									<h4 class="modal-title">${b.productName}</h4>
									<button type="button" class="close" data-dismiss="modal">&times;</button>
								</div>

								<!-- Modal body -->
								<div class="modal-body">
									<img
										src="https://firebasestorage.googleapis.com/v0/b/projectperfume-faed4.appspot.com/o/images%2F11.jpg?alt=media&token=76e10fd1-e661-494a-a046-40afd0f16fa5"
										class="img-thumbnail" alt="Responsive image"
										style="height: 400px">
									<div>
										<div>
											<label> | Sửa ảnh : </label>
										</div>
										<input type="file" id="image" accept="image/*"
											class="btn btn-light"><br> <br>

									</div>
								</div>


								<!-- Modal footer -->
								<div class="modal-footer">

									<button type="button" class="btn btn-light" onclick="upload()">Cập
										nhật</button>
									<button type="button" class="btn btn-danger"
										data-dismiss="modal">Đóng</button>
								</div>

							</div>
						</div>

					</div>

					<div class="modal" id="myModalDelete${b.productId}">
						<div class="modal-dialog">
							<div class="modal-content">

								<!-- Modal Header -->
								<div class="modal-header">
									<h4 class="modal-title">Bạn có chắc muốn xoá sản phẩm này không?</h4>
									<button type="button" class="close" data-dismiss="modal">&times;</button>
								</div>

								<!-- Modal body -->
								<div class="modal-body">
								<h4>ID: ${b.productId}</h4>
								<h4>Tên sản phẩm: ${b.productName}</h4>
								
								</div>

								<!-- Modal footer -->
								<div class="modal-footer">
								<button type="button" class="btn btn-danger"
										data-dismiss="modal">Xác nhận</button>
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
