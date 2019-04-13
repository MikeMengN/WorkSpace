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
    <title></title> 
    <base href="<%=basePath%>">
	<!-- Bootstrap Styles-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FontAwesome Styles-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
     <!-- Morris Chart Styles-->
   
        <!-- Custom Styles-->
    <link href="assets/css/custom-styles.css" rel="stylesheet" />
     <!-- Google Fonts-->
   <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
     <!-- TABLE STYLES-->
    <link href="assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />
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
                        <li><a href="#"><i class="fa fa-user fa-fw"></i>用户信息</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> 修改密码</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="#"><i class="fa fa-sign-out fa-fw"></i>退出登录</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
        </nav>
        <!--/. NAV TOP  -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"></div>
        <nav class="navbar-default navbar-side" role="navigation">
		<div id="sideNav" href=""><i class="fa fa-caret-right"></i></div>
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
					<c:forEach items="${sessionScope.lisper}" var = "item">
						<li>
                        	<a class="active-menu" href="${item.jsp_name}"><i class="fa fa-dashboard"></i>${item.per_name}</a>
                    	</li>
					</c:forEach>
                   
                </ul>

            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">

                 <!-- /. ROW  -->
               
            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                             	角色管理
                           	<div class="btn-group">
							  <button type="button" class="btn btn-success">新增角色</button>
							</div>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-bordered">
                                    <thead>
                                        <tr>
                                            <th>用户编号</th>
                                            <th>用户名</th>
                                            <th>用户性别</th>
                                            <th>用户电话</th>
                                            <th>操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${requestScope.lisu}" var = "lisu">
                                        <tr class="odd gradeX">
                                            <td>${lisu.user_id}</td>
                                            <td>${lisu.user_name}</td>
                                            <td>
                                            <c:if test="${lisu.user_sex==0}">男</c:if>
                                            <c:if test="${lisu.user_sex==1}">女</c:if>
                                            </td>
                                            <td class="center">${lisu.user_phone}</td>
                                            <td>
                                            <div>
                                            <button type="button" class="btn btn-info">查看</button>
                                            <button type="button" class="btn btn-warning">修改</button>
						  					<button type="button" class="btn btn-danger">删除</button>
						  					</div>
						  					</td>
                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            <div class="container">
							  <ul class="pagination pagination-sm">
							    <li class="page-item"><a class="page-link" href="user/findAllUserInfo?page=${requestScope.nowPage-1}">上一页</a></li>
							    <li class="page-item disabled"><a class="page-link"><c:if test="${requestScope.nowPage==1}">首页</c:if>
							    <c:if test="${requestScope.nowPage!=1}">第${requestScope.nowPage}页</c:if></a></li>
							    <li class="page-item disabled"><a class="page-link">...</a></li>
							    <li class="page-item disabled"><a class="page-link">共${requestScope.maxPage}页</a></li>
							    <li class="page-item"><a class="page-link" href="user/findAllUserInfo?page=${requestScope.nowPage+1}">下一页</a></li>
							  </ul>
							</div>
                            </div>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
        </div>
               <footer><p>Copyright &copy; 2019.Company name All rights reserved.XX二手车 <a href="http://www.cssmoban.com/" target="_blank" title="XX二手车">XX二手车</a>From MengNing</footer>
    </div>
             <!-- /. PAGE INNER  -->
            </div>
         <!-- /. PAGE WRAPPER  -->
     <!-- /. WRAPPER  -->
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- Bootstrap Js -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
     <!-- DATA TABLE SCRIPTS -->
    <script src="assets/js/dataTables/jquery.dataTables.js"></script>
    <script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
        <script>
            $(document).ready(function () {
                $('#dataTables-example').dataTable();
            });
    </script>
         <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script>
    
   
</body>
</html>

