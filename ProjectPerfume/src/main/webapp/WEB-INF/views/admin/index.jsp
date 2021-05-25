<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
      <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorate" %>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
  <br><br>
<div class=" col-12 text-center">
 
 <h1>TẠO MỚI SẢN PHẨM</h1>
 </div>
   <!-- The core Firebase JS SDK is always required and must be listed first -->
<script src="https://www.gstatic.com/firebasejs/8.4.3/firebase-app.js"></script>

<!-- TODO: Add SDKs for Firebase products that you want to use
     https://firebase.google.com/docs/web/setup#available-libraries -->
<script src="https://www.gstatic.com/firebasejs/8.4.3/firebase-analytics.js"></script>

<section class="hero-section">
<div class="col-12">

    <div class="col-12 text-center">
     
	<form enctype="multipart/form-data" >
    <input type="text" class="col-6 text-center" >
		<label>
			Select image :
		</label>
		<input type="file" id="image" accept="image/*"><br><br>
		<button type="button" onclick="upload()">Upload</button>
    <h4 id="link">Link is empty</h4>
    <!-- <img src="https://firebasestorage.googleapis.com/v0/b/projectperfume-faed4.appspot.com/o/images%2F11.jpg?alt=media&token=76e10fd1-e661-494a-a046-40afd0f16fa5" class="pi-pic"> -->
	</form>
  </div>
</div>
</section>
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


</body>
