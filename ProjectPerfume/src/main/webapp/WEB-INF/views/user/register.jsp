<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Form-v9 by Colorlib</title>
	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<!-- Font-->
</head>
<body class="form-v9">
	<div class="page-content">
		<div class="form-v9-content" style="background-image: url('<c:url value="/assets/img/form-v9.jpg"/>')">
			<form class="form-detail" action="#" method="post">
				<h2 style="color: white">Đăng Ký Tài Khoản</h2>
				<div class="form-row-total">
					<div class="form-row">
						<input type="text" name="full-name" id="full-name" class="input-text" placeholder="Họ và tên" required>
					</div>
					<div class="form-row">
						<input type="text" name="your-email" id="your-email" class="input-text" placeholder="Email" required pattern="[^@]+@[^@]+.[a-zA-Z]{2,6}">
					</div>
				</div>
				<div class="form-row-total">
					<div class="form-row">
						<input type="text" name="User-name" id="User-name" class="input-text" placeholder="Tên đăng nhập" required>
					</div>
					<div class="form-row">
						<input type="text" name="phone" id="phone" class="input-text" placeholder="Số điện thoại" required>
					</div>
				</div>
				<div class="form-row-total">
					<div class="form-row">
						<input type="password" name="password" id="password" class="input-text" placeholder="Mật Khẩu" required>
					</div>
					<div class="form-row">
						<input type="password" name="comfirm-password" id="comfirm-password" class="input-text" placeholder="Nhập Mại Mật Khẩu" required>
					</div>
				</div>
				<div class="form-row-total">
					<div class="form-row">
						<input type="Địa chỉ" name="password" id="password" class="input-text" placeholder="Mật Khẩu" required>
					</div>
					<div class="form-row">
						<input type="năm sinh" name="comfirm-password" id="comfirm-password" class="input-text" placeholder="Nhập Mại Mật Khẩu" required>
					</div>
				</div>
				
				<div class="form-row-last">
					<input type="submit" name="register" class="register" value="Đăng Ký Tài Khoản">
				</div>
			</form>
		</div>
	</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>