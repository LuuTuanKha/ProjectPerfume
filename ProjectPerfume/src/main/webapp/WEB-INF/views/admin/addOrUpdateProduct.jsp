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

	<!-- The core Firebase JS SDK is always required and must be listed first -->
	<script src="https://www.gstatic.com/firebasejs/8.4.3/firebase-app.js"></script>

	<!-- TODO: Add SDKs for Firebase products that you want to use
     https://firebase.google.com/docs/web/setup#available-libraries -->
	<script
		src="https://www.gstatic.com/firebasejs/8.4.3/firebase-analytics.js"></script>

	<div class="container">
		<br> <br>
		<h2>Quản lý sản phẩm</h2>
		<br>
		<div class="row">
			<div class="col">

				<form:form
					action="${pageContext.request.contextPath}/admin/product/save"
					method="post" modelAttribute="product">
					<div class="form-group">
						<form:label path="productName">Tên sản phẩm</form:label>
						<form:input path="productName" cssClass="form-control" />
						<form:errors path="productName" cssStyle="color:red" />
					</div>
					<div class="form-group">
						
						<form:hidden path="productId" cssClass="form-control" value="" />
						
					</div>
					<div class="form-group">
						<form:label path="image">Đường dẫn hình ảnh:</form:label>
						<form:input path="image" cssClass="form-control" id= "link" />
						<form:errors path="image" cssStyle="color:red" />
					</div>
					<div class="form-group">
						<form:label path="quantity">Số lượng</form:label>
						<form:input path="quantity" cssClass="form-control" />
						<form:errors path="quantity" cssStyle="color:red" />
					</div>

					<div class="form-group">
						<form:label path="selledQTT">Số lượng đã bán</form:label>
						<form:input path="selledQTT" cssClass="form-control" />
						<form:errors path="selledQTT" cssStyle="color:red" />
					</div>
					<div class="form-group">
						<form:label path="description">Thông tin sản phẩm</form:label>
						<form:input path="description" cssClass="form-control" />
						<form:errors path="description" cssStyle="color:red" />
					</div>
					<div class="form-group">
						<form:label path="manufacturingDate">Hạn sử dụng</form:label>
						<form:input path="manufacturingDate" cssClass="form-control" />
						<form:errors path="manufacturingDate" cssStyle="color:red" />
					</div>

					<div class="form-group">
						<form:label path="madeIn">Sản xuất tại:</form:label>
						<form:input path="madeIn" cssClass="form-control" />
						<form:errors path="madeIn" cssStyle="color:red" />
					</div>
					<div class="form-group">
						<form:label path="buyPrice">Giá nhập</form:label>
						<form:input path="buyPrice" cssClass="form-control" />
						<form:errors path="buyPrice" cssStyle="color:red" />
					</div>
					<div class="form-group">
						<form:label path="sellPrice">Giá bán</form:label>
						<form:input path="sellPrice" cssClass="form-control" />
						<form:errors path="sellPrice" cssStyle="color:red" />
					</div>
					<div class="form-group">
						<label for="size">Dung tích:</label>
						<form:select path="size">

							<form:options items="${listSize}" />
						</form:select>
					</div>

					<div class="form-group">
						<label for="brand">Thương hiệu:</label>
						<form:select path="brand.brandID">

							<form:options items="${listBrand}" itemValue="brandID"
								itemLabel="brandName" />
						</form:select>
					</div>
					<div class="form-group">
						<label for="supplier">Nhà cung cấp:</label>
						<form:select path="supplier.supplierId">

							<form:options items="${listSupplier}" itemValue="supplierId"
								itemLabel="supplierName" />
						</form:select>
					</div>
					<div class="form-group">
						<label for="category">Bộ sưu tập:</label>
						<form:select path="category.categoryId">
							<form:option value="ASDA">--Trống--</form:option>
							<form:options items="${listCategory}" itemValue="categoryId"
								itemLabel="categoryName" />
						</form:select>
					</div>
					<p></p>

					<button type="submit" class="btn btn-primary">Lưu</button>
				</form:form>
			</div>

			<div class="col">
			<br>
				<form enctype="multipart/form-data">
					<label>
						Chọn ảnh : </label> <input type="file" id="image" accept="image/*" onchange="loadFile(event)"><br>
					<br>
					<button type="button" onclick="upload()">Sử dụng ảnh này</button>
					<br><br>
					<img id="output" src="${product.image}"/>
<script>
  var loadFile = function(event) {
    var output = document.getElementById('output');
    output.src = URL.createObjectURL(event.target.files[0]);
    output.onload = function() {
      URL.revokeObjectURL(output.src) // free memory
    }
  };
</script>
					<!-- <img src="https://firebasestorage.googleapis.com/v0/b/projectperfume-faed4.appspot.com/o/images%2F11.jpg?alt=media&token=76e10fd1-e661-494a-a046-40afd0f16fa5" class="pi-pic"> -->
				</form>


			</div>
		</div>

		<br>
		<br>

	</div>
<script src="https://www.gstatic.com/firebasejs/6.0.2/firebase.js"></script>
<script>
  // Your web app's Firebase configuration
  // For Firebase JS SDK v7.20.0 and later, measurementId is optional
  var firebaseConfig = {
    apiKey: "AIzaSyADcDavOFmrTI-MwXQSrqj3n1T-0bmi1TU",
    authDomain: "projectperfume-faed4.firebaseapp.com",
    projectId: "projectperfume-faed4",
    storageBucket: "projectperfume-faed4.appspot.com",
    messagingSenderId: "163977845333",
    appId: "1:163977845333:web:2af76640f6dba9bf5352dc",
    measurementId: "G-0GHDWD282F"
  };
  // Initialize Firebase
  firebase.initializeApp(firebaseConfig);
  firebase.analytics();
</script>
	<script type="text/javascript" src="<c:url value = "/assets/js/uploadimage.js"/>"></script>	


</body>
