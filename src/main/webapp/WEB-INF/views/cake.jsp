<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category</title>
<style type="text/css">
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
	font-family: 'Open Sans', sans-serif;
}

.button {
	display: flex;
	justify-content: center;
	align-items: center;
	text-decoration: none;
	padding: 10px 20px;
	height: 100%;
	width: 100%;
	border: none;
	outline: none;
	border-radius: 4px;
	background: #fff;
	color: #000;
}

#mobile-menu {
	position: absolute;
	top: 20%;
	right: 5%;
	transform: translate(5%, 20%);
}

#mobile-menu.is-active .bar:nth-child(2) {
	opacity: 0;
}

#mobile-menu.is-active .bar:nth-child(1) {
	transform: translateY(8px) rotate(45deg);
}

#mobile-menu.is-active .bar:nth-child(3) {
	transform: translateY(-8px) rotate(-45deg);
}

}

/* Hero Section CSS */
.main {
	background-color: #141414;
}

.main__container {
	display: grid;
	grid-template-columns: 1fr 1fr;
	align-items: center;
	justify-self: center;
	margin: 0 auto;
	height: 90vh;
	background-color: #141414;
	z-index: 1;
	width: 100%;
	max-width: 1300px;
	padding-right: 50px;
	padding-left: 50px;
}

.main__content {
	width: 100%;
}

.main__content h1 {
	font-size: 3.5rem;
	color: #fff;
}

.text-highlight {
	color: gold;
}

.main__content p {
	font-size: 2.5rem;
	margin-top: 8px;
	font-weight: 100;
	color: #dbdbdb
}

.main__btn {
	font-size: 1rem;
	padding: 14px 32px;
	background: #fff;
	border: none;
	border-radius: 4px;
	margin-top: 2rem;
	cursor: pointer;
	position: relative;
	transition: all 0.35s;
	outline: none;
}

.main__btn a {
	position: relative;
	z-index: 2;
	color: #000;
	text-decoration: none;
}

.main__btn:after {
	position: absolute;
	content: '';
	top: 0;
	left: 0;
	width: 0;
	height: 100%;
	background: #782605;
	transition: all 0.35s;
	border-radius: 4px;
}

.main__btn:hover:after {
	width: 100%;
}

.main__img--container {
	text-align: center;
}

#main__img {
	height: 425px;
	width: 400px;
	border-radius: 20px;
}

/* Mobile responsive */
@media screen and (max-width: 768px) {
	.main__container {
		display: grid;
		grid-template-columns: auto;
		align-items: center;
		justify-self: center;
		width: 100%;
		margin: 0 auto;
		height: 90vh;
	}
	.main__content {
		text-align: center;
		margin-bottom: 4rem;
	}
	.main-content h1 {
		font-size: 2.5rem;
		margin-top: 2rem;
	}
	.main__content p {
		margin-top: 1rem;
		font-size: 1.5rem;
	}
	@media screen and (max-width: 480px) {
		.main-content h1 {
			font-size: 2rem;
			margin-top: 3rem;
		}
		.main__content p {
			margin-top: 2rem;
			font-size: 1.5rem;
		}
		.main__btn {
			padding: 12px 36px;
			margin: 2.5rem 0;
		}
	}
}

/* Images CSS */
.images {
	background-color: #141414;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	padding-top: 4rem;
}

.images h1 {
	color: #fff;
	margin-bottom: 5rem;
	font-size: 2rem;
}

.images__container {
	display: flex;
	justify-content: center;
	flex-wrap: wrap;
}

.images__card {
	margin: 1rem;
	height: 425px;
	width: 400px;
	border-radius: 20px;
	background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0) 0%,
		rgba(17, 17, 17, 0.6) 100%),
		url('http://img.taste.com.au/-dGYc9Ej/taste/2016/11/top-50-cakes-image-49-66387-1.jpg');
	background-size: 100% 100%;
	background-repeat: no-repeat;
	position: relative;
	color: #fff;
}

.images__card:nth-child(2) {
	margin: 1rem;
	height: 425px;
	width: 400px;
	border-radius: 20px;
	background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0) 0%,
		rgba(17, 17, 17, 0.6) 100%),
		url('https://assets.epicurious.com/photos/56bcc39c2388d8216df80735/6:4/w_1600,c_limit/shutterstock_365627156.jpg');
	background-size: 100% 100%;
	background-repeat: no-repeat;
	position: relative;
	color: #fff;
}

.images__card:nth-child(3) {
	margin: 1rem;
	height: 425px;
	width: 400px;
	border-radius: 20px;
	background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0) 0%,
		rgba(17, 17, 17, 0.6) 100%),
		url('http://img.taste.com.au/4XPFiEkj/taste/2016/11/top-50-cakes-image-2-66316-1.jpg');
	background-size: 100% 100%;
	background-repeat: no-repeat;
	position: relative;
	color: #fff;
}

.images__card:nth-child(4) {
	margin: 1rem;
	height: 425px;
	width: 400px;
	border-radius: 20px;
	background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0) 0%,
		rgba(17, 17, 17, 0.6) 100%),
		url('https://img.taste.com.au/hgnYa51_/w643-h428-cfill-q90/taste/2017/08/lemon-curd-coconut-pavlova-cakel-129357-1.jpg');
	background-size: 100% 100%;
	background-repeat: no-repeat;
	position: relative;
	color: #fff;
}

.images__card:nth-child(5) {
	margin: 1rem;
	height: 425px;
	width: 400px;
	border-radius: 20px;
	background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0) 0%,
		rgba(17, 17, 17, 0.6) 100%),
		url('http://img.taste.com.au/rJ3hoA49/taste/2016/11/top-50-cakes-image-11-66329-1.jpg');
	background-size: 100% 100%;
	background-repeat: no-repeat;
	position: relative;
	color: #fff;
}

.images__card:nth-child(6) {
	margin: 1rem;
	height: 425px;
	width: 400px;
	border-radius: 20px;
	background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0) 0%,
		rgba(17, 17, 17, 0.6) 100%),
		url('https://img.taste.com.au/htilCvka/w643-h428-cfill-q90/taste/2017/10/cherry-ripe-ice-cream-cake-1980x1320-131687-1.jpg');
	background-size: 100% 100%;
	background-repeat: no-repeat;
	position: relative;
	color: #fff;
}

.images__card:before {
	opacity: 0.2;
}

.images__card h2 {
	position: absolute;
	top: 350px;
	left: 30px;
	font-size: 1.2rem;
}

.images__card p {
	position: fixed;
	top: 380px;
	left: 30px;
	font-size: 0.8rem;
}

.images__card:hover {
	transform: scale(1.01);
	transition: 0.1s ease-in;
	cursor: pointer;
}

@media screen and (max-width: 960px) {
	.images h1 {
		font-size: 2rem;
		margin-top: 12rem;
	}
}

@media screen and (max-width: 480px) {
	.images h1 {
		font-size: 1.2rem;
	}
	.images__card {
		width: 300px;
	}
}

/* Footer CSS */
.footer__container {
	background-color: #141414;
	padding: 5rem 0;
	text-align: center;
}

.website__rights {
	color: #fff;
}

.navbar_manage {
	padding: 50px;
	text-align: center;
	/* margin: 50px; */
	height: 600px;
	background: #131313;
	text-decoration: none;
}

.navbar_product a {
	text-decoration: none;
	color: white;
	margin: 50px;
}

.navbar_category a {
	text-align: right;
	text-decoration: none;
	color: white;
	margin: 50px;
}

.container {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 50vh;
	width: 80vw;
	padding-left: 120px;
	flex-wrap: wrap;
}

.item {
	text-align: center;
	height: 270px;
	width: 400px;
	background-color: #b8860b;
	margin: 20px;
	border-radius: 10px;
}

button {
	margin-top: 120px;
	padding: 10px;
	cursor: pointer;
	background-color: #000;
	border-radius: 10px;
}

h3 {
	padding: 30px;
}

/* category section */
.tab_col {
	color: #fff;
	background-color: #000;
	padding: 80px;
	height: 100wh;
}

.add_cat {
	margin: 50px;
	padding: 10px;
	background-color: #000;
	border-color: #b8860b;
	color: #fff;
}

.text-value {
	background-color: #141414;
}

.nft_name {
	text-align: center;
	color: #fff;
	padding: 100px;
	font-size: 400%;
}

#text_box {
	height: 50px;
	width: 400px;
	text-align: center;
	border-radius: 5px;
	border-color: gold;
}

#add_cate {
	margin: 50px;
	padding: 10px;
	background-color: #000;
	border-color: #b8860b;
	color: #fff;
	width: 10%;
}
/* signup */
.form-label {
	color: #fff;
}

//
index
   ::selection {
	color: #000;
	background: #fff;
}

nav {
	position: absolute;
	background: #1b1b1b;
	width: 100%;
	padding: 10px 0;
	z-index: 12;
}

nav .menu {
	max-width: 1250px;
	margin: auto;
	display: flex;
	align-items: center;
	justify-content: space-between;
	padding: 0 20px;
}

.menu .logo a {
	text-decoration: none;
	color: #fff;
	font-size: 35px;
	font-weight: 600;
}

.menu ul {
	display: inline-flex;
}

.menu ul li {
	list-style: none;
	margin-left: 7px;
}

.menu ul li:first-child {
	margin-left: 0px;
}

.menu ul li a {
	text-decoration: none;
	color: #fff;
	font-size: 18px;
	font-weight: 500;
	padding: 8px 15px;
	border-radius: 5px;
	transition: all 0.3s ease;
}

.menu ul li a:hover {
	background: #fff;
	color: black;
}

.img {
	background: url('img3.jpg') no-repeat;
	width: 100%;
	height: 100vh;
	background-size: cover;
	background-position: center;
	position: relative;
}

.img::before {
	content: '';
	position: absolute;
	height: 100%;
	width: 100%;
	background: rgba(0, 0, 0, 0.4);
}

.center {
	position: absolute;
	top: 52%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 100%;
	padding: 0 20px;
	text-align: center;
}

.center .title {
	color: #fff;
	font-size: 55px;
	font-weight: 600;
}

.center .sub_title {
	color: #fff;
	font-size: 52px;
	font-weight: 600;
}

.center .btns {
	margin-top: 20px;
}

.center .btns button {
	height: 55px;
	width: 170px;
	border-radius: 5px;
	border: none;
	margin: 0 10px;
	border: 2px solid white;
	font-size: 20px;
	font-weight: 500;
	padding: 0 10px;
	cursor: pointer;
	outline: none;
	transition: all 0.3s ease;
}

.center .btns button:first-child {
	color: #fff;
	background: none;
}

.btns button:first-child:hover {
	background: white;
	color: black;
}

.center .btns button:last-child {
	background: white;
	color: black;
}
a {
text-decoration: none;
color: white;
}
</style>
</head>
<body>
	<form:form action="cake" method="post">
		<div class="img"></div>
		<div class="center">
			<div class="btns"></div>
			<section>
				<div class="images" id="coll">
					<h1>Cakes</h1>
					<div class="images__container">
						<div class="images__card">
							<a href="/person/addorderform"><h2>Raspberry and almond cake</h2></a>
						</div>
						<div class="images__card">
							<a href="/person/addorderform"><h2>Red Velvet Cake</h2></a>
						</div>
						<div class="images__card">
							<a href="/person/addorderform"><h2>NewYork Baked Cheesecake</h2></a>
						</div>
						 <div class="images__card">
							<a href="/person/addorderform"><h2>Lemon curd coconut pavlova cake</h2></a>
						</div>
						
						<div class="images__card">
							<a href="/person/addorderform"><h2>Classic No-bake Vanilla cheese</h2></a>
						</div>
						<div class="images__card">
							<a href="/person/addorderform"><h2>Cherry Ripe ice-cream cake</h2></a>
						</div>
					</div>
				</div>
			</section>
			<!-- Footer Section -->
			<div class="footer__container"></div>
		</div>
	</form:form>
</body>
</html>
