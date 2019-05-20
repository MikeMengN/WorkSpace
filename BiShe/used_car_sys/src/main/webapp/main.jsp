<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>XX二手车欢迎您</title>
	<base href="<%=basePath%>">
    <!-- Bootstrap Styles-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Morris Chart Styles-->
    <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="assets/css/custom-styles.css" rel="stylesheet" />
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' /> 
    <script>
    	function add_info()
		    {
		        var form = document.getElementById('updateform');
		        form.submit();
		        $("#myModal").on("hidden.bs.modal", function() {
		            $(this).removeData("bs.modal");
		        });
		 
		    }
	</script>
</head>

<body>
    <div id="wrapper">
        <nav class="navbar navbar-default top-navbar" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html"><i class="fa fa-gear"></i> <strong>XX二手车</strong></a>
            </div>

            <ul class="nav navbar-top-links navbar-right">
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#" data-toggle="modal" data-target="#myInfo"><i class="fa fa-user fa-fw"></i>我的信息</a>
                        </li>
                        <li><a href="#" data-toggle="modal" data-target="#myModal"><i class="fa fa-user fa-fw"></i>修改密码</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login_out.jsp" onclick = ""><i class="fa fa-sign-out fa-fw"></i>退出登录</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
        </nav>
        <!-- 模态框，用于查看用户信息，弹出层 -->
        <div class="modal fade" id="myInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
			        <h4 class="modal-title" id="myModalLabel">我的信息</h4>
			      </div>
			      <div class="modal-body">
			      		<label for="loginname" class="control-label">姓名: ${sessionScope.sUser.user_name}</label><br>
			      		<label for="loginname" class="control-label">性别: <c:if test="${sessionScope.sUser.user_sex==0}">男</c:if>
                                            <c:if test="${sessionScope.sUser.user_sex==1}">女</c:if></label><br>
			      		<label for="loginname" class="control-label">电话: ${sessionScope.sUser.user_phone}</label><br>
			      		
			      </div>
			      <div class="text-right">
                        <button type="button" class="btn btn-default right" data-dismiss="modal">关闭</button>
                   </div>
		    </div>
		  </div>
		</div>
        
        
        <!-- 模态框，用于修改密码，弹出层 -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
			        <h4 class="modal-title" id="myModalLabel">修改密码</h4>
			      </div>
			      <div class="modal-body">
			                <form id="updateform" action="user/modifyPasswd" >
			                    <div class="form-group">
			                        <label for="loginname" class="control-label">原密码:</label>
			                        <input type="text" class="form-control" id="oldPasswd" name="oldPasswd">
			                    </div>
			                    <div class="form-group">
			                        <label for="email" class="control-label">新密码:</label>
			                        <input type="text" class="form-control" id="newPasswd" name="newPasswd">
			                    </div>
			                    <div class="form-group">
			                        <label for="phone" class="control-label">重复新密码:</label>
			                        <input type="text" class="form-control" id="newPasswd1" name="newPasswd1">
			                    </div>
			                    <div class="text-right">
			                        <span id="returnMessage" class="glyphicon"> </span>
			                        <button id="submitBtn" type="button" class="btn btn-primary" onclick="add_info()" >提交</button>
			                        <button type="button" class="btn btn-default right" data-dismiss="modal">关闭</button>
			                    </div>
			                </form>
			      </div>
		    </div>
		  </div>
		</div>
        <!--/. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
		<div id="sideNav" href=""><i class="fa fa-caret-right"></i></div>
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
					<c:forEach items="${sessionScope.lisper}" var = "item">
						<li>
                        	<a href="${item.jsp_name}"><i class="fa fa-dashboard"></i>${item.per_name}</a>
                    	</li>
					</c:forEach>
                   
                </ul>

            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper">
			欢迎来到XX二手车管理系统
        </div>
    </div>
    <!-- /. WRAPPER  -->
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!-- Bootstrap Js -->
    <script src="assets/js/bootstrap.min.js"></script>
	 
    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
    <!-- Morris Chart Js -->
    <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="assets/js/morris/morris.js"></script>
	
	
	<script src="assets/js/easypiechart.js"></script>
	<script src="assets/js/easypiechart-data.js"></script>
	
	 <script src="assets/js/Lightweight-Chart/jquery.chart.js"></script>
	
    <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script>
 

</body>

</html>