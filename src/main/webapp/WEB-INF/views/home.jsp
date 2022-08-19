<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style>
<%@include file="/WEB-INF/views/css/home.css"%>
</style>	
</head>
<body>
    <nav>
		<div class="menu">
			<div class="logo">
				<a href="#">Bakery And Cakes</a>
			</div>
			<div class="logo1">
			<div class="dropdown">
			<button class= "dropbtn">Category</button>
			<div class="dropdown-content">
			<a href="/admin/cake?id=${pId}">Cakes</a>
			<a href="/admin/cookies?id=${pId}">Cookies</a>
			<a href="/admin/chocolates?id=${pId}">Chocolates</a>
			<a href="/admin/cupcakes?id=${pId}">Cupcakes</a>
			<a href="/admin/donuts?id=${pId}">Doughnuts</a>
			<a href="/admin/muffins?id=${pId}">Muffins</a>
			</div>
			</div>
			</div>
		</div>
	</nav>
	<div class="img"></div>
	<div class="center">
		<div class="btns"></div>
		<section>
 <div class="images" id="coll">
     <h1>Category</h1>
     <div class="images__container">
         <div class="images__card">
          <a href="/admin/cookies?id=${pId}"><h2>Cookies</h2></a>
         </div>
         <div class="images__card">
            <a href="/admin/cake?id=${pId}"><h2>Cakes</h2></a> 
         </div>
         <div class="images__card">
           <a href="/admin/chocolates?id=${pId}"><h2>Chocolates</h2></a>
         </div>
         <div class="images__card">
           <a href="/admin/cupcakes?id=${pId}"><h2>Cupcakes</h2></a>
         </div>
         <div class="images__card">
            <a href="/admin/donuts?id=${pId}"><h2>Doughnuts</h2></a>
         </div>
         <div class="images__card">
             <a href="/admin/muffins?id=${pId}"><h2>Muffins</h2></a>
         </div>
     </div>
 </div>
</section>
 <!-- Footer Section -->
 <div class="footer__container">

 </div>
	</div>
</body>
</html>