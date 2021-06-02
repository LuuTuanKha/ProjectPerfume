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
		<div class="form-v9-content-dn" style="background-image: url('<c:url value="/assets/img/form-v9.jpg"/>')">
		
			<form class="form-detail" action="j_spring_security_check" method="post">
				<h2 style="color: white">Đăng Nhập Tài Khoản</h2>
				<div class="form-row-last">
					<div class="form-row-total">
						<input type="text" name="j_username" id="User-name" class="input-text" placeholder="Tài Khoản" required>
                    </div>
					<div class="form-row-total">
						<input type="password" name="j_password" id="password" class="input-text" placeholder="Mật Khẩu" required>
					</div>
					
				</div>
				<c:if test="${param.incorrectAccount != null}">
					<div class="alert alert-danger">	
							Tên đăng nhập hoặc password không đúng
					</div>
				</c:if>
				<c:if test="${param.accessDenied != null}">
					<div class="alert alert-danger">	
							Không có quyền truy cập
					</div>
				</c:if>
				
				<div class="form-row-last">
					<input type="submit" name="login" class="Login" value="Đăng Nhập">
					
					
					<div> <a href="/register"><input type="button" name="login" class="register" value="Đăng Ký"></a></div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>