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
<title>我要卖车</title>
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
						<li class="active"><a href="/used_car_sys/usedCar/sellService">我要卖车</a></li>
						<li><a href="/used_car_sys/usedCar/serviceInfo">服务</a></li>
						<li><a style="pointer-events: none;">热线电话&nbsp;400-069-6530</a></li>
					</ul>
					<div class="clear"></div> 
				</div>
		</div>
		<div class="banner-top">
			<div class="header-bottom">
				 <div class="header_bottom_right_images">
				 	<div class="about_wrapper"><h1>XX二手车竭诚为您服务</h1>
					</div>
				    <div class="about-group" align="center">
				    	<br /><br />
				    	<h1 style="font-family: sans-serif; font-size: 40px;"><b>点击按钮，开始您的卖车之旅</b></h1>
				    	<br /><br />
			  			<a href="isc/sellCarToCompany?user_id=${sessionScope.webUser.user_id}"><button class="btn btn-6 btn-6a" id = "sellcar">我要卖车</button></a>
			  			<br /><br /><br /><br /><br /><br />
		   			</div>
		</div>
		<div class="clear"></div>
		<c:if test="${requestSocope.info == '1' }">
		<script type="text/javascript">
			alert("您已经成功预约，两天内，我们将会和您取得联系，并进行下一步工作！");
		</script>
		</c:if>
		
		
		<!--
        	作者：offline
        	时间：2019-05-09
        	描述：车辆展示
        -->
		<div class="box-title">
			<h1><span class="title-icon"></span><a href="">车辆展示</a></h1>
		</div>
		<div class="section group example">
			<div class="col_1_of_2 span_1_of_2">
			  <img src="web_user/images/pic21.jpg" alt=""/>
			   <img src="web_user/images/pic24.jpg" alt=""/>
			   <img src="web_user/images/pic25.jpg" alt=""/>
			   <img src="web_user/images/pic27.jpg" alt=""/>
			</div>
			<div class="col_1_of_2 span_1_of_2">
				 <img src="web_user/images/pic22.jpg" alt=""/>
			  	<img src="web_user/images/pic23.jpg" alt=""/>
			  	<img src="web_user/images/pic26.jpg" alt=""/>
			  	<img src="web_user/images/pic28.jpg" alt=""/>
			</div><div class="clear"></div>
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

    	
    	
            