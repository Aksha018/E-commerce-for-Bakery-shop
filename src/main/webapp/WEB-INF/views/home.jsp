<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
			<a href="/admin/cake">Cakes</a>
			<a href="/admin/cookies">Cookies</a>
			<a href="/admin/chocolates">Chocolates</a>
			<a href="/admin/cupcakes">Cupcakes</a>
			<a href="/admin/donuts">Doughnuts</a>
			<a href="/admin/muffins">Muffins</a>
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
          <a href="/admin/cookies"><h2>Cookies</h2></a>  
         </div>
         <div class="images__card">
            <a href="/admin/cake"><h2>Cakes</h2></a> 
         </div>
         <div class="images__card">
           <a href="/admin/chocolates"><h2>Chocolates</h2></a>
         </div>
         <div class="images__card">
           <a href="/admin/cupcakes"><h2>Cupcakes</h2></a>
         </div>
         <div class="images__card">
            <a href="/admin/donuts"><h2>Doughnuts</h2></a>
         </div>
         <div class="images__card">
             <a href="/admin/muffins"><h2>Muffins</h2></a>
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