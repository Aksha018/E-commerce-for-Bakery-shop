<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style type="text/css">

* {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
    font-family: 'Open Sans', sans-serif;
  }
  
  .navbar {
    background: #131313;
    height: 80px;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 1rem;
    position: sticky;
    top: 0;
    z-index: 999;
  }
  .navbar__container {
    display: flex;
    justify-content: space-between;
    height: 80px;
    width: 100%;
    max-width: 1300px;
    margin-right: auto;
    margin-left: auto;
    padding-right: 50px;
    padding-left: 50px;
  }
  
  #navbar__logo {
    color: gold;
    display: flex;
    align-items: center;
    cursor: pointer;
    text-decoration: none;
    font-size: 2rem;
  }
  .navbar__menu {
    display: flex;
    align-items: center;
    list-style: none;
    text-align: center;
  }
  
  .navbar__item {
    height: 80px;
  }
  
  .navbar__links {
    color: #fff;
    display: flex;
    align-items: center;
    justify-content: center;
    text-decoration: none;
    padding: 0 1rem;
    height: 100%;
  }
  
  .navbar__btn {
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 0 1rem;
    width: 100%;
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
  
  .button:hover {
    background: gold;
    color: #fff;
    transition: all 0.3s ease;
  }
  
  .navbar__links:hover {
    color: gold;
    transition: all 0.3s ease;
  }

@media screen and (max-width: 960px) {
    .navbar__container {
        display: flex;
        justify-content: space-between;
        height: 80px;
        width: 100%;
        z-index: 1;
        max-width: 1300px;
        padding: 0;
    }
    
    #navbar__logo {
        padding-left: 25px;
    }
    
    .navbar__menu {
        display: grid;
        grid-template-columns: auto;
        margin:0;
        width: 100%;
        position: absolute;
        top: -1000px;
        opacity: 1;
        transition: all 0.5s ease;
        height: 50vh;
        z-index: -1;
    }

    .navbar__menu.active {
        background: #131313;
        top: 100%;
        opacity: 1;
        transition: all 0.5s ease;
        z-index: 99;
        height: 50vh;
        font-size: 1.6rem;
    }

    .navbar__toggle .bar {
        width: 25px;
        height: 3px;
        margin: 5px auto;
        transition: all 0.3s ease-in-out;
        background: #fff;
    }

    .navbar__item {
        width: 100%;
    }

    .navbar__links {
        text-align: center;
        padding: 2rem;
        width: 100%;
        display: table;
    }

    .navbar__btn {
        padding-bottom: 2rem;
    }

    .button {
        display: flex;
        justify-content: center;
        align-items: center;
        width: 80%;
        height: 80px;
        margin: 0;
    }

    .navbar__toggle .bar {
        display: block;
        cursor: pointer;
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
    justify-self:center;
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
    background-image: linear-gradient(to bottom, rgba(0,0,0,0) 0%, rgba(17,17,17,0.6) 100%),
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
    background-image: linear-gradient(to bottom, rgba(0,0,0,0) 0%, rgba(17,17,17,0.6) 100%),
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
    background-image: linear-gradient(to bottom, rgba(0,0,0,0) 0%, rgba(17,17,17,0.6) 100%),
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
    background-image: linear-gradient(to bottom, rgba(0,0,0,0) 0%, rgba(17,17,17,0.6) 100%),
    url('http://img.taste.com.au/a1EjasDr/taste/2016/11/top-50-cakes-image-6-66322-1.jpg');
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
    background-image: linear-gradient(to bottom, rgba(0,0,0,0) 0%, rgba(17,17,17,0.6) 100%),
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
    background-image: linear-gradient(to bottom, rgba(0,0,0,0) 0%, rgba(17,17,17,0.6) 100%),
    url('http://img.taste.com.au/mlQHBARG/taste/2016/11/top-50-cakes-image-20-66342-1.jpg');
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
 position: absolute;
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
    height:600px;
    background: #131313;
    text-decoration: none;
   }
   
   .navbar_product a{
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
   
   .container{  
       display:flex;  
       justify-content:center;  
       align-items:center;  
       height:50vh;  
       width:80vw;  
       padding-left:120px;
       flex-wrap:wrap;  
     }  
     .item{  
       text-align: center;
       height:270px;  
       width:400px;  
       background-color:#b8860b;  
       margin: 20px;  
       border-radius: 10px;  
     }  
     button {
       margin-top: 120px;
       padding: 10px;
       cursor: pointer;
       background-color:#000;
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
       border-color:#b8860b;
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
       border-color:#b8860b;
       color: #fff;
       width: 10%;
   }
   /* signup */

   .form-label {
    color: #fff;
   }
   
   
   //index
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
</style>
</head>
<body>
    <nav>
		<div class="menu">
			<div class="logo">
				<a href="#">Bakery And Cakes</a>
			</div>
			<ul>
			<li><a href="/admin/categorylist"></a></li>	
			</ul>
		</div>
	</nav>
	<div class="img"></div>
	<div class="center">
		<div class="btns"></div>
		<section>
 <div class="images" id="coll">
     <h1>Gallery</h1>
     <div class="images__container">
         <div class="images__card">
             <h2> Raspberry and almond cake</h2>   
         </div>
         <div class="images__card">
             <h2>Red Velvet Cake<h2>
         </div>
         <div class="images__card">
             <h2> NewYork Baked Cheesecake</h2>
         </div>
         <div class="images__card">
             <h2>Chocolate Mud cupcakes</h2>
         </div>
         <div class="images__card">
             <h2>Classic No-bake Vanilla cheese</h2>
         </div>
         <div class="images__card">
             <h2>Black forest cake</h2>
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
