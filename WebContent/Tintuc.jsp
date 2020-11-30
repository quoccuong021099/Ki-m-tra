<%@page import="CuongBean.Cuongbean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Tin tức</title>
<style>

.nav {
    width: 100%;
    height: 65px;
    position: fixed;
    line-height: 65px;
    text-align: center;
}

.nav div.logo {
    float: left;
    width: auto;
    height: auto;
    padding-left: 3rem;
}

.nav div.logo a {
    text-decoration: none;
    color: #fff;
    font-size: 2.5rem;
}

.nav div.logo a:hover {
    color: #00E676;
}

.nav div.main_list {
    height: 65px;
    float: right;
}

.nav div.main_list ul {
    width: 100%;
    height: 65px;
    display: flex;
    list-style: none;
    margin: 0;
    padding: 0;
}

.nav div.main_list ul li {
    width: auto;
    height: 65px;
    padding: 0;
    padding-right: 3rem;
}

.nav div.main_list ul li a {
    text-decoration: none;
    color: #fff;
    line-height: 65px;
    font-size: 2.4rem;
}

.nav div.main_list ul li a:hover {
    color: #00E676;
}
.home {
    width: 100%;
    height: 100vh;
    background-image: url(https://images.unsplash.com/photo-1498550744921-75f79806b8a7?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=b0f6908fa5e81286213c7211276e6b3d&auto=format&fit=crop&w=1500&q=80);
    background-position: center top;
	background-size:cover;
	
}
</style>
</head>
<body>
<nav class="nav">
        <div class="container-fluid">
            <div class="logo">
                <a href="#"><i class="fa fa-home"></i> Cổng Thông Tin Và Truyền Thông</a>
            </div>
            <div id="mainListDiv" class="main_list">
                <ul class="navlinks">
                    <li><a href="#">About</a></li>
                    <li><a href="#">Contact</a></li>
                
                <form class="form-inline  my-2 my-lg-0 tk" action="CuongController" method="post">
		         	<input class="form-control"   type="search" placeholder="Search" aria-label="Search" name="txttk">
		        	<button class="btn btn-outline-warning my-2 my-sm-0 "  type="submit">Search</button>
	   			 </form>
	   			 </ul>
            </div>
            
        </div>
         
</nav>
<section class="home">
<h1 class="text-center" style="color: #00E676; padding-top: 100px;">Tin tức</h1>
  <%
  	ArrayList<Cuongbean> cuong = (ArrayList<Cuongbean>)request.getAttribute("cuong1");
  	int n =0;
  	if(cuong != null){
  		n = cuong.size();
  		}
  	else{
  		out.print("Xin Chào");
  	}
  %>
  
<% for(int i=0;i< n ;i++){ Cuongbean ss=cuong.get(i);  %>
<div class="container">
	<div class="group" style="margin-top: 50px;">
		<h2 style="color: #00E676;"><%=ss.getTieude() %></h2>
		<i style="color: #fff;font-size: 22px"> <%=ss.getTomtat() %></i>
		<h4 style="color: #fff; font-size: 16px"> <%=ss.getNoidung() %></h4>
		<h5 style="color: #fff; font-size: 14px"> <%=ss.getNgayduatin() %></h5>
		<hr style="background-color: #fff">
	</div>

</div>

 <%} %>
</section>
  
 
</body>
</html>