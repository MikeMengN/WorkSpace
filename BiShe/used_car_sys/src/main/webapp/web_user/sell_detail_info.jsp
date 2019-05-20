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
<title>Single</title>
<base href="<%=basePath%>">
<link href="web_user/css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='https://fonts.googleapis.com/css?family=Playball' rel='stylesheet' type='text/css'>   
</head>
<body>
<div class="header-bg">
	<div class="wrap"> 
		<div class="h-bg">
			<div class="total">
				<div class="header">
					<div class="box_header_user_menu">
						<ul class="user_menu"><li class="act first"><a href=""><div class="button-t"><span>登录</span></div></a></li><li class=""><a href=""><div class="button-t"><span>注册</span></div></a></li></ul>
					</div>
					<div class="header-right">
						<ul class="follow_icon">
							<li><a href="#"><img src="web_user/images/icon.png" alt=""/></a></li>
							<li><a href="#"><img src="web_user/images/icon1.png" alt=""/></a></li>
							<li><a href="#"><img src="web_user/images/icon2.png" alt=""/></a></li>
							<li><a href="#"><img src="web_user/images/icon3.png" alt=""/></a></li>
						</ul>
					</div><div class="clear"></div> 
					<div class="header-bot">
						<div class="logo">
							<a href="index.html"><img src="web_user/images/logo.png" alt=""/></a>
						</div>
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
						<li><a href="/used_car_sys/usedCar/findUsedCarInfoToBuyCar">我要买车</a></li>
						<li><a href="/used_car_sys/usedCar/sellService">我要卖车</a></li>
						<li><a href="/used_car_sys/usedCar/serviceInfo">服务</a></li>
						<li><a style="pointer-events: none;">热线电话&nbsp;400-069-6530</a></li>
					</ul>
					<div class="clear"></div> 
				</div>
		</div>
		<div class="banner-top">
			<div class="header-bottom">
				 <div class="header_bottom_right_images">
				 	<div class="about_wrapper"><h1>二手车信息详情</h1>
								</div>
				     	
		  			<div class="about-group">
		  			<div class="about-top">	
						<div class="grid images_3_of_1">
							<img src="${pageContext.request.contextPath}/upload/${requestScope.usedCarInfo.picture1}" alt=""/>
						</div>
						<div class="grid span_2_of_3">
							<h3>XX二手车向您做出以下服务保障：</h3>
							<p>(1)2年4万公里保障</p>
							<p>(2)30天无忧退</p>
							<p>(3)专业整备、代办过户</p>
							<p>(4)调表车赔付、精选车源</p>
							<p>(5)禁售盗抢查封车</p>
						</div><div class="clear"></div> 
						
					</div>
			   <div class="links">
		  				<ul>
		  					<li><a><img src="web_user/images/blog-icon1.png" title="date"><span>上架时间:${requestScope.usedCarInfo.create_time}</span></a></li>
		  					<li><a><img src="web_user/images/blog-icon4.png" title="Admin"><span>车辆品牌:${requestScope.usedCarInfo.vb_id}</span></a></li>
		  					<li><a><img src="web_user/images/blog-icon4.png" title="Comments"><span>车辆车系:${requestScope.usedCarInfo.vt_id}</span></a></li>
		  					<li><a><img src="web_user/images/blog-icon4.png" title="Lables"><span>车龄:${requestScope.usedCarInfo.vehicle_age}年</span></a></li>
		  				</ul>
		  		</div>
		  		<div class="links">
		  				<ul>
		  					<li><a><img src="web_user/images/blog-icon4.png" title="Lables"><span>新车价格:${requestScope.usedCarInfo.ex_factory_price}万元</span></a></li>
		  					<li><a><img src="web_user/images/blog-icon4.png" title="Lables"><span>现价:${requestScope.usedCarInfo.present_price}万元</span></a></li>
		  					<li><a><img src="web_user/images/blog-icon4.png" title="Lables"><span>变速箱:<c:if test="${requestScope.usedCarInfo.transmission == '1'}">手动</c:if> <c:if test="${requestScope.usedCarInfo.transmission == '2'}">自动</c:if></span></a></li>
		  					<li><a><img src="web_user/images/blog-icon4.png" title="Lables">
		  					<span>车型:
		  					<c:if test="${requestScope.usedCarInfo.vehicle_model == '1'}">轿车</c:if>
		  					<c:if test="${requestScope.usedCarInfo.vehicle_model == '2'}">卡车</c:if>
		  					<c:if test="${requestScope.usedCarInfo.vehicle_model == '3'}">SUV</c:if>
		  					<c:if test="${requestScope.usedCarInfo.vehicle_model == '4'}">面包车</c:if>
		  					</span></a></li>
		  					<li><a><img src="web_user/images/blog-icon4.png" title="Lables"><span>行驶里程:${requestScope.usedCarInfo.road_hual}万公里</span></a></li>
		  					<li><a><img src="web_user/images/blog-icon4.png" title="Lables">
		  					<span>排量:
		  					<c:if test="${requestScope.usedCarInfo.displacement == '1'}">1.0L以下</c:if>
		  					<c:if test="${requestScope.usedCarInfo.displacement == '2'}">1.0L-1.6L</c:if>
		  					<c:if test="${requestScope.usedCarInfo.displacement == '3'}">1.6L-2.0L</c:if>
		  					<c:if test="${requestScope.usedCarInfo.displacement == '4'}">2.0L-3.0L</c:if>
		  					<c:if test="${requestScope.usedCarInfo.displacement == '5'}">3.0L-4.0L</c:if>
		  					<c:if test="${requestScope.usedCarInfo.displacement == '6'}">4.0L以上</c:if>
		  					</span></a></li>
		  				</ul>
		  		</div>
		  		<div class="about-group" align="center">
			    	<br /><br />
			    	<h1 style="font-family: sans-serif; font-size: 40px;"><b>点击按钮，开始您的买车之旅</b></h1>
			    	<br /><br />
		  			<button class="btn btn-6 btn-6a" id = "buyscar">预约看车</button>
		  			<br /><br /><br /><br /><br /><br />
	   			</div>
		  		
	</div>
</div>
		<div class="clear"></div>
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

    	
    	
            