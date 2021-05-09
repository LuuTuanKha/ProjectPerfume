<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<head>

</head>
<body>
   <b>This is Admin body</b>
   <!-- The core Firebase JS SDK is always required and must be listed first -->
<script src="https://www.gstatic.com/firebasejs/8.4.3/firebase-app.js"></script>

<!-- TODO: Add SDKs for Firebase products that you want to use
     https://firebase.google.com/docs/web/setup#available-libraries -->
<script src="https://www.gstatic.com/firebasejs/8.4.3/firebase-analytics.js"></script>

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

<div>
	<form enctype="multipart/form-data">
		<label>
			Select image :
		</label>
		<input type="file" id="image" accept="image/*"><br><br>
		<button type="button" onclick="upload">Upload</button>
	</form>
</center>
  <script src="js/jquery-3.2.1.min.js"></script> 
	 <script src="js/bootstrap.min.js"></script> 
	 <script src="js/jquery.slicknav.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.nicescroll.min.js"></script>
	<script src="js/jquery.zoom.min.js"></script>
	<script src="js/jquery-ui.min.js"></script> 
	<script src="js/main.js"></script>

</body>