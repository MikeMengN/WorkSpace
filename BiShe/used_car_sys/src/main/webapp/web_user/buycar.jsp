<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<!DOCTYPE HTML>
<html>
<head>
<title>我要买车</title>
<base href="<%=basePath%>">
<link href="web_user/css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='https://fonts.googleapis.com/css?family=Playball' rel='stylesheet' type='text/css'>   
<!-- Bootstrap Styles-->
<link href="assets/css/bootstrap.css" rel="stylesheet" />
 <!-- FontAwesome Styles-->
<link href="assets/css/font-awesome.css" rel="stylesheet" />
<!--slider-->
<script src="web_user/js/jquery.min.js"></script>
<script src="web_user/js/script.js" type="text/javascript"></script>
<script src="web_user/js/superfish.js"></script>
</head>
<body>
<div class="header-bg">
	<div class="wrap"> 
		<div class="h-bg">
			<div class="total">
				<div class="header">
					<!-- 判断是否登录 -->
				<%
					if(session.getAttribute("webUser") == null || session.getAttribute("webUser") == "") {
						%>
							<div class="box_header_user_menu">
								<ul class="user_menu">
									<li class="act first"><a href="/used_car_sys/user/loginWebService"><div class="button-t"><span>登录</span></div></a></li>
									<li class="act first"><a href="/used_car_sys/user/registWebService"><div class="button-t"><span>注册</span></div></a></li>
								</ul>
							</div>
						<%
					} else {
						%>
							<div class="box_header_user_menu">
								<ul class="user_menu"><li class="act first"><div class="button-t"><span>欢迎您:${sessionScope.webUser.user_name}</span></div></ul>
							</div>
						<%
					}			
				%>
					<div class="clear"></div> 
					<div class="header-bot">
						<!--
                        	作者：offline
                        	时间：2019-05-07
                        	描述：log
                        -->
						<div class="logo">
							<a href="index.html"><img src="web_user/images/logo1.png" alt=""/></a>
						</div>
						<!--
                        	作者：offline
                        	时间：2019-05-07
                        	描述：搜索框
                        -->
						<div class="search">
						    <input type="text" class="textbox" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">
						    <button class="gray-button"><span>Search</span></button>
				       </div>
					<div class="clear"></div> 
				</div>		
		</div>	
		<div class="menu"> 	
			<div class="top-nav"> 
					<ul>
						<li><a href="/used_car_sys/usedCar/findUsedCarInfoToWeb">首页</a></li>
						<li class="active"><a href="/used_car_sys/usedCar/findUsedCarInfoToBuyCar">我要买车</a></li>
						<li><a href="/used_car_sys/usedCar/sellService">我要卖车</a></li>
						<li><a href="/used_car_sys/usedCar/serviceInfo">服务</a></li>
						<li><a style="pointer-events: none;">热线电话&nbsp;400-069-6530</a></li>
					</ul>
					<div class="clear"></div> 
				</div>
		</div>
		
		<div class="banner-top">
			<div class="header-bottom">
		  			<div class="content-wrapper">		  
						<div class="content-top">
							  	<div class="box_wrapper"><h1>欢迎了解</h1>
								</div>
						</div>
						
				</div>
		</div>
		</div><div class="clear"></div>
		
		 <c:forEach items="${requestScope.lisbuy}" var = "lisbuy">
							 <div class="text"> 	
								
								<div class="grid_1_of_3 images_1_of_3">
									<div class="grid_1">
										<a href="/used_car_sys/usedCar/sellDetailInfo?uci_id=${lisbuy.uci_id}"><img src="${pageContext.request.contextPath}/upload/${lisbuy.picture1}" title="continue reading" alt=""></a>
											<div class="grid_desc">
												<p class="title">XX二手车诚心为您服务，请放心选购</p>
													<div class="price" style="height: 19px;">
													 	 <span class="reducedfrom">￥:${lisbuy.present_price}万元</span>
								        				<span class="actual">￥${lisbuy.ex_factory_price}:万元</span>
													</div>
													<div class="cart-button">
														<button class="button"><span>Details</span></button>
													<div class="clear"></div>
												</div>
											</div>
								</div><div class="clear"></div>
							</div>
							
								</div>
								</c:forEach>
								
		<div class="container">
		  <ul class="pagination pagination-sm">
		    <li class="page-item"><a class="page-link" href="usedCar/findUsedCarInfoToBuyCar?page=${requestScope.nowPage-1}">上一页</a></li>
		    <li class="page-item disabled"><a class="page-link"><c:if test="${requestScope.nowPage==1}">首页</c:if>
		    <c:if test="${requestScope.nowPage!=1}">第${requestScope.nowPage}页</c:if></a></li>
		    <li class="page-item disabled"><a class="page-link">...</a></li>
		    <li class="page-item disabled"><a class="page-link">共${requestScope.maxPage}页</a></li>
		    <li class="page-item"><a class="page-link" href="usedCar/findUsedCarInfoToBuyCar?page=${requestScope.nowPage+1}">下一页</a></li>
		  </ul>
		</div>						
		<div class="footer-bottom">
			<div class="copy" align="center">
				<p>Copyright &copy; 2019-03 to 2019-05-20 Graduation Design From MengNing, <a href="http://www.cssmoban.com/" target="_blank" title="XX二手车">XX二手车</a></p>
			</div>
		</div>
</div>
</div>
</div>
</div>
</div>
</div>
</body>
</html>

    	
    	
            