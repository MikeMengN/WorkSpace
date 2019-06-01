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
<title>服务</title>
<base href="<%=basePath%>">
<link href="web_user/css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='https://fonts.googleapis.com/css?family=Playball' rel='stylesheet' type='text/css'>   
<script src="web_user/js/jquery.min.js"></script>
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
						<li class="active"><a href="/used_car_sys/usedCar/serviceInfo">服务</a></li>
						<li><a style="pointer-events: none;">热线电话&nbsp;400-069-6530</a></li>
					</ul>
					<div class="clear"></div> 
				</div>
		</div>
		<div class="banner-top">
			<div class="header-bottom">
				 <div class="header_bottom_right_images">
				 	<div class="about_wrapper"><h1><b>XX二手车为您竭诚服务</b></h1>
					</div>
				    <div class="about-group">
		  			<div class="about-top">	
						<div class="grid span_2_of_3">
							<h3>专业排除火烧车</h3>
							<div class="grid images_3_of_1">
								<img src="web_user/images/01.png" alt=""/>
							</div>
							<p><h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;发动机线束及橡胶制品存在熏烟或火烧 /车辆覆盖件及驾驶舱存在熏烟或火烧 /其他国家或地方标准下的火烧车情形</h1></p>
						</div><div class="clear"></div> 
					</div>
					<div class="about-top">	
						<div class="grid span_2_of_3">
							<h3>专业排除事故车</h3>
							<div class="grid images_3_of_1">
								<img src="web_user/images/02.png" alt=""/>
							</div>
							<p><h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A/B/C柱一处及以上受损或有变形（变形至车身框架焊点），以及因此而进行 
									修复或更换； 
									前纵梁、后纵梁受损，或存在修复痕迹；后围板或后底板有更换或重新焊接、 
									打胶痕迹；前叶子板内衬（内楦）有变形或修复痕迹； 
									其他国家或地方标准下的重大事故车情形。</h1></p>
						</div><div class="clear"></div> 
					</div>
					<div class="about-top">	
						<div class="grid span_2_of_3">
							<h3>专业排除泡水车</h3>
							<div class="grid images_3_of_1">
								<img src="web_user/images/03.png" alt=""/>
							</div>
							<p><h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;水浸痕迹达到前排座椅音响底部 / 驾驶舱和后备箱地毯存在褶皱、变相变色、霉变情况 / 因水浸导致车内有严重刺鼻异味 /其他国家或地方标准下的水浸车情形 </h1></p>
						</div><div class="clear"></div> 
					</div>
			   <p class="about-para"><b>XX二手车将带给客户最好的体验，所有XX二手车卖出的车辆都将会有售后保障，请您放心使用。若有问题请联系：400-069-6530</b></p><div class="clear"></div>
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

    	
    	
            