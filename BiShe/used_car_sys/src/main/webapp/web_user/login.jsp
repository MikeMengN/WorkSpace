<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>XX二手车登录</title>
		<base href="<%=basePath%>">
        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="web_user/assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="web_user/assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="web_user/assets/css/form-elements.css">
        <link rel="stylesheet" href="web_user/assets/css/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="web_user/assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="web_user/assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="web_user/assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="web_user/assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="web_user/assets/ico/apple-touch-icon-57-precomposed.png">

    </head>

    <body>
		
        <!-- Top content -->
        <div class="top-content">
        	<%
			if(request.getAttribute("error") == "0") {
				%>
				<script type="text/javascript">
					alert("对不起，您还未进行登录，请登录后再操作！");
				</script>
				<%
			}
			%>
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>XX二手车</strong>登录</h1>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>请在此处登录&nbsp;&nbsp;&nbsp;<a href="">注册</a></h3>
                            		<p>登陆后即可正常使用XX二手车交易平台:</p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-key"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form" action="/used_car_sys/user/loginWeb" method="post" class="login-form">
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-username">user_name</label>
			                        	<input type="text" name="user_name" placeholder="用户名" class="form-username form-control" id="user_name">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-passwd">user_password</label>
			                        	<input type="password" name="user_passwd" placeholder="用户密码" class="form-password form-control" id="user_passwd">
			                        </div>
			                        <button type="submit" class="btn">登录</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>


        <!-- Javascript -->
        <script src="web_user/assets/js/jquery-1.11.1.min.js"></script>
        <script src="web_user/assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="web_user/assets/js/jquery.backstretch.min.js"></script>
        <script src="web_user/assets/js/scripts.js"></script>
        
        <!--[if lt IE 10]>
            <script src="web_user/assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>
    	
    	
            