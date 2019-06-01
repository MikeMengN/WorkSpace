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
<title>主页</title>
<base href="<%=basePath%>">
<link href="web_user/css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='https://fonts.googleapis.com/css?family=Playball' rel='stylesheet' type='text/css'>   
<!--slider-->
<script src="web_user/js/jquery.min.js"></script>
<script src="web_user/js/script.js" type="text/javascript"></script>
<script src="web_user/js/superfish.js"></script>
<script type="text/javascript">

</script>
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
					当前城市：<span id="pro_num">郑州</span>
					<div id="allmap"></div>
					<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=yIX3ZhpcdZWl6v93EohAS8uX5gP8g0y5"></script>
					<script>
						// 百度地图API功能
					    var map = new BMap.Map("allmap");
					    var point = new BMap.Point(116.331398,39.897445);
					    map.centerAndZoom(point,12);
						//浏览器定位
					    var geolocation = new BMap.Geolocation();
					    geolocation.getCurrentPosition(function(r){
					        if(this.getStatus() == BMAP_STATUS_SUCCESS){
					            var mk = new BMap.Marker(r.point);
					            map.addOverlay(mk);
					            map.panTo(r.point);
					            // alert('您的位置：'+r.point.lng+','+r.point.lat);
					            $('#lat').val(r.point.lat);//获取到的纬度
					            $('#lon').val(r.point.lng);//获取到的经度
					
					            var gc = new BMap.Geocoder();
					            var pointAdd = new BMap.Point(r.point.lng, r.point.lat);
					            gc.getLocation(pointAdd, function(rs){
					                // 百度地图解析城市名
					                $('#pro_num').html(rs.addressComponents.city);
					                //或者其他信息
					                console.log(rs);
					            })
					        }
					        else {
					            alert('failed'+this.getStatus());
					        }
					    },{enableHighAccuracy: true});
					    </script>
					
					<div class="header-right">
						<ul class="follow_icon">
							<li><a><img src="web_user/images/icon.png" alt=""/></a></li>
							<li><a><img src="web_user/images/icon1.png" alt=""/></a></li>
							<li><a><img src="web_user/images/icon2.png" alt=""/></a></li>
							<li><a><img src="web_user/images/icon3.png" alt=""/></a></li>
						</ul>
					</div><div class="clear"></div>  
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
						<li class="active"><a href="/used_car_sys/usedCar/findUsedCarInfoToWeb">首页</a></li>
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
				     	<div id="slideshow">
							<ul class="slides">
						    	<li><a href="details.html"><canvas ></canvas><img src="web_user/images/banner4.jpg" alt="Marsa Alam underawter close up" ></a></li>
						        <li><a href="details.html"><canvas></canvas><img src="web_user/images/banner2.jpg" alt="Turrimetta Beach - Dawn" ></a></li>
						        <li><a href="details.html"><canvas></canvas><img src="web_user/images/banner3.jpg" alt="Power Station" ></a></li>
						        <li><a href="details.html"><canvas></canvas><img src="web_user/images/banner1.jpg" alt="Colors of Nature" ></a></li>
						    </ul>
						    <span class="arrow previous"></span>
						    <span class="arrow next"></span>
				  	</div>
		  			<div class="content-wrapper">		  
						<div class="content-top">
							  	<div class="box_wrapper"><h1>新上二手车</h1>
								</div>
							 <c:forEach items="${requestScope.lisu}" var = "lisu">
							 <div class="text"> 	
								
								<div class="grid_1_of_3 images_1_of_3">
									<div class="grid_1">
										<a href="/used_car_sys/usedCar/sellDetailInfo?uci_id=${lisu.uci_id}"><img src="${pageContext.request.contextPath}/upload/${lisu.picture1}" title="continue reading" alt=""></a>
											<div class="grid_desc">
													<p class="title">此处二手车为XX二手车新上车型，请放心选购</p>
													<div class="price" style="height: 19px;">
													 	 <span class="reducedfrom">￥:${lisu.present_price}万元</span>
								        				<span class="actual">￥${lisu.ex_factory_price}:万元</span>
													</div>
													<div class="cart-button">
														<a href="/used_car_sys/usedCar/sellDetailInfo?uci_id=${lisu.uci_id}"><button class="button"><span>详情</span></button></a>
													<div class="clear"></div>
												</div>
											</div>
								</div><div class="clear"></div>
							</div>
							
								</div>
								</c:forEach>
						</div>
						
				</div>
		</div>
		
		<div class="header-para">
				<div class="categories">
						<div class="list-categories">
							<div class="first-list">
								<div class="div_2"><a href="">轿车</a></div>
								<div class="div_img">
									<img src="web_user/images/car1.jpg" alt="Cars" title="Cars" width="60" height="39">
								</div><div class="clear"></div>
							</div>
							<div class="first-list">
								<div class="div_2"><a href="">卡车</a></div>
								<div class="div_img">
									<img src="web_user/images/car2.jpg" alt="Cars" title="Cars" width="60" height="39">
								</div><div class="clear"></div>
							</div>
							<div class="first-list">
								<div class="div_2"><a href="">SUV</a></div>
								<div class="div_img">
									<img src="web_user/images/car3.jpg" alt="Cars" title="Cars" width="60" height="39">
								</div><div class="clear"></div>
							</div>
							<div class="first-list">
								<div class="div_2"><a href="">面包车</a></div>
								<div class="div_img">
									<img src="web_user/images/car4.jpg" alt="Cars" title="Cars" width="60" height="39">
								</div><div class="clear"></div>
							</div>
				</div>
				
				<div class="box"> 
							<div class="box-heading"><h1><a href="#">车型:&nbsp;</a></h1></div>
							 <div class="box-content">
							选择车型浏览
							</div>	
				</div>
				
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
				<div class="clear"></div>
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

    	
    	
            