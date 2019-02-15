<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">

<style>

.headpart{
    font-family: 'Courier New', Courier, monospace;
    font-size: 80%;
    background-image:url('121.jpg');
    text-align: center;
    margin: 0%
    
}

.mySlides{
    display: none;
    margin: -1.3%;
    margin-left: 13%;
    
}

.w3-content w3-section{
    max-width:500px;
    max-width: height 300px;
}

    div.gallery {
  margin: 5px;
  border: 1px solid #ccc;
  float: left;
  width: 180px;
}

div.gallery:hover {
  border: 1px solid black;
}

div.gallery img {
  width: 100%;
  height: auto;
  margin-top: 10px;
  
}

div.desc {
  padding: 15px;
  text-align: center;
}


body{
    background-color:lightcoral ;
}

</style>
</head>



<header>
    <div class="headpart">
        <img src="logo1.jpg">
        <h1 align="center">Welcome to Go shopping....!</h1>
    </div>
        
</header>
<body>

        
<div  class="w3-content w3-section" style="max-width:200px, max-height=200px">
    
     <img class="mySlides" src="kids1.jpg" width="1000" height="400">
     <img class="mySlides" src="OFF3.jpg"  width="1000" height="400">
     <img class="mySlides" src="shopping.jpg"  width="1000" height="400">
     <img class="mySlides" src="OFFER2.jpg"  width="1000" height="400">  
     <img class="mySlides" src="img1.jpg"  width="1000" height="400" >
     <img class="mySlides" src="MOBILE.jpg"  width="1000" height="400" >
     <img class="mySlides" src="men.png"  width="1000" height="400">
     <img class="mySlides" src="img2.jpg"  width="1000" height="400">
    <img class="mySlides" src="happyshopping.jpg"  width="1000" height="400">
    <img class="mySlides" src="OFFER1.jpg"  width="1000" height="400">
</div>


<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 4000); // Change image every 4 seconds
}
</script>


<table>
  <tr>
    <td>
<div class="gallery">
  <a target="_blank" href="loginjsp.jsp">
    <img src="mens.jpg" alt="Clothing" width="800" height="800">
  </a>
  <div class="desc"><h1>Clothing</h1></div>
</div>
</td>
</tr>

<tr>
    <td>
<div class="gallery">
  <a target="_blank" href="sunglasses.html">
    <img src="dis2.jpg" alt="Sunglasses" width="800" height="800" margin-top="10">
  </a>
  <div class="desc"><h1>Sunglasses</h1></div>
</div>
</td>
</tr>

<tr>
    <td>
<div class="gallery">
  <a target="_blank" href="mobile.html">
    <img src="phon2.jpg" alt="mobile" width="800" height="800">
  </a>
  <div class="desc"><h1>Mobile</h1></div>
</div>
</td>
</tr>
</table>


<footer>
  <h2>About us</h2> &nbsp;&nbsp;&nbsp; <h2>CustomerCare: 100100279</h2> 
</footer>
</body>
</html> 