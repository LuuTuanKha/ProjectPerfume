<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
      <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorate" %>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
      
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
				<th scope="col">Update</th>
				<th scope="col">Delete</th>				
			</tr>
		</thead>
		<tbody>
		<c:forEach var="b" items="${products}" varStatus="i">
			<tr>
				<th scope="row">${b.productName}</th>
				<td>${b.sellPrice}</td>
				<td>${b.selledQTT}</td>
		
				<td><a class="btn btn-light" href="product/update?id=${b.productId}" data-toggle="modal" data-target="#myModal${b.productId}">Xem</a></td>
				
				<td><a class="btn btn-light" href="product/update?id=${b.productId}">Cập nhật</a></td>
				<td><a class="btn btn-danger" href="product/delete?id=${b.productId}">Xoá</a></td>
			
				
			</tr>
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
