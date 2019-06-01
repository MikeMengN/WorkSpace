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
   <!-- 刷新模态框的JS -->
   <script>
    function add_info()
	    {
	        var form = document.getElementById('updateform');
	        form.submit();
	        $("#myModal").on("hidden.bs.modal", function() {
	            $(this).removeData("bs.modal");
	        });
	 
	}
    function add_usedCarInfo()
	    {
	        var form = document.getElementById('usedCarform');
	        form.submit();
	        $("#addUsedInfo").on("hidden.bs.modal", function() {
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
        <!-- 模态框，用于查看当前登录用户信息，弹出层 -->
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
        
        <!-- 模态框，用于添加二手车信息-->
        <div class="modal fade" id="addUsedInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
			        <h4 class="modal-title" id="myModalLabel">添加二手车信息</h4>
			      </div>
			      <div class="modal-body">
			                <form id="usedCarform" method = "post" action="usedCar/addUsedCarInfo" enctype="multipart/form-data">
			                    <div class="form-group">
			                        <label for="vbrand" class="control-label">车辆品牌:</label>
			                        <select class="form-control" id = "vb_id" name = "vb_id">
				                        <c:forEach items="${lsvb}" var = "lsvb">
				                        	<option value = "${lsvb.vb_id}">${lsvb.vb_name}</option>
				                        </c:forEach>
			                        </select>
			                    </div>
			                    <div class="form-group">
			                        <label for="ex_factory_price" class="control-label">出厂价:</label>
			                        <input type="number" class="form-control" id="ex_factory_price" name="ex_factory_price" placeholder="单位：万元人民币">
			                    </div>
			                    <div class="form-group">
			                        <label for="present_price" class="control-label">现价:</label>
			                        <input type="number" class="form-control" id="present_price" name="present_price" placeholder="单位：万元人民币">
			                    </div>
			                    <div class="form-group">
			                        <label for="vehicle_age" class="control-label">车龄:</label>
			                        <input type="number" class="form-control" id="vehicle_age" name="vehicle_age" placeholder="单位：年">
			                    </div>
			                    <div class="form-group">
			                        <label for="transmission" class="control-label">变速箱:</label>
			                        <select class="form-control" id="transmission" name="transmission">
				                        <option value="1">手动</option>
				                        <option value="2">自动</option>
			                        </select>
			                    </div>
			                    <div class="form-group">
			                        <label for="vehicle_model" class="control-label">车型:</label>
			                    	<select class="form-control" id="vehicle_model" name="vehicle_model">
				                        <option value="1">轿车</option>
				                        <option value="2">卡车</option>
				                        <option value="3">SUV</option>
				                        <option value="4">面包车</option>
			                        </select>
			                    </div>
			                    <div class="form-group">
			                        <label for="road_hual" class="control-label">行驶里程:</label>
			                        <input type="number" class="form-control" id="road_hual" name="road_hual" placeholder="单位：万公里">
			                    </div>
			                    <div class="form-group">
			                        <label for="displacement" class="control-label">排量:</label>
			                    	<select class="form-control" id="displacement" name="displacement">
				                        <option value="1">1.0L以下</option>
				                        <option value="2">1.0L-1.6L</option>
				                        <option value="3">1.6L-2.0L</option>
				                        <option value="4">2.0L-3.0L</option>
				                        <option value="5">3.0L-4.0L</option>
				                        <option value="6">4.0L以上</option>
			                        </select>
			                    </div>
			                    <div class="form-group">
			                        <label for="effluent_standard" class="control-label">排放标准:</label>
			                    	<select class="form-control" id="effluent_standard" name="effluent_standard">
				                        <option value="1">国II</option>
				                        <option value="2">国III</option>
				                        <option value="3">国IV</option>
				                        <option value="4">国V及以上</option>
			                        </select>
			                    </div>
			                    <div class="form-group">
			                        <label for="seating" class="control-label">座位数:</label>
			                        <select class="form-control" id="seating" name="seating">
				                        <option value="1">2座</option>
				                        <option value="2">4座</option>
				                        <option value="3">5座</option>
				                        <option value="4">6座</option>
				                        <option value="5">7座及以上</option>
			                        </select>
			                    </div>
			                    <div class="form-group">
			                        <label for="fuel_type" class="control-label">燃油类型:</label>
			                        <select class="form-control" id="fuel_type" name="fuel_type">
				                        <option value="1">汽油</option>
				                        <option value="2">柴油</option>
				                        <option value="3">电动</option>
				                        <option value="4">插电混合</option>
				                        <option value="5">其他</option>
			                        </select>
			                    </div>
			                    <div class="form-group">
			                        <label for="color" class="control-label">颜色:</label>
			                        <input type="color" class="form-control" id="color" name="color">
			                    </div>
			                    <div class="form-group">
			                        <label for="lpl_id" class="control-label">车辆所在地:</label>
			                        <select class="form-control" id = "lpl_id" name = "lpl_id">
				                        <c:forEach items="${lslpl}" var = "lslpl">
				                        	<option value = "${lslpl.lpl_id}">${lslpl.city_name}</option>
				                        </c:forEach>
			                        </select>
			                    </div>
			                    <div class="form-group">
			                        <label for="driving_type" class="control-label">驱动类型:</label>
			                        <select class="form-control" id="driving_type" name="driving_type">
				                        <option value="1">两驱</option>
				                        <option value="2">四驱</option>
			                        </select>
			                    </div>
			                    <div class="form-group">
			                        <label for="highlight_the_configuration" class="control-label">亮点配置:</label>
									<select class="form-control" id="highlight_the_configuration" name="highlight_the_configuration">
				                        <option value="0">无</option>
				                        <option value="1">全景天窗</option>
				                        <option value="2">车身稳定控制</option>
				                        <option value="3">倒车影响系统</option>
				                        <option value="4">真皮座椅</option>
				                        <option value="5">无钥匙进入系统</option>
				                        <option value="6">儿童座椅接口</option>
				                        <option value="7">倒车雷达</option>
				                        <option value="8">GPS导航</option>
			                        </select>
			                    </div>
			                    <div class="form-group">
			                        <label for="file" class="control-label">展示图片:</label>
			                        <input type="file" class="form-control" id="file" name="file">
			                    </div>
			                    <div class="text-right">
			                        <span id="returnMessage" class="glyphicon"> </span>
			                        <button id="submitBtn" type="button" class="btn btn-primary" onclick="add_usedCarInfo()" >提交</button>
			                        <button type="button" class="btn btn-default right" data-dismiss="modal">取消</button>
			                    </div>
			                </form>
			      </div>
		    </div>
		  </div>
		</div>
		
        <!-- 模态框，用于查看角色信息 -->
        <div class="modal fade" id="userInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
			        <h4 class="modal-title" id="myModalLabel">角色信息</h4>
			      </div>
			      <div class="modal-body">
			      		<label for="loginname" class="control-label">角色ID: ${sessionScope.sUser.user_name}</label><br>
			      		<label for="loginname" class="control-label">角色名称: ${sessionScope.sUser.user_phone}</label><br>
			      		
			      </div>
			      <div class="text-right">
                        <button type="button" class="btn btn-default right" data-dismiss="modal">关闭</button>
                   </div>
		    </div>
		  </div>
		</div>
        
        
        <!--/. NAV TOP  -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"></div>
        <nav class="navbar-default navbar-side" role="navigation">
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
        <div id="page-wrapper" >
            <div id="page-inner">

                 <!-- /. ROW  -->
               
            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                             	二手车信息管理
                           	<div class="btn-group">
							  <button type="button" class="btn btn-success" data-toggle="modal" data-target="#addUsedInfo">新增二手车信息</button>
							</div>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-bordered">
                                    <thead>
                                        <tr>
                                            <th>车辆编号</th>
                                            <th>车辆品牌</th>
                                            <th>品牌所属国家</th>
                                            <th>车辆出厂价</th>
                                            <th>车辆现价</th>
                                            <th>车龄</th>
                                            <th>行驶里程</th>
                                            <th>操作</th>
                                        </tr>
                                     </thead>
                                    <tbody>
                                    <c:forEach items="${requestScope.lisc}" var = "lisc">
                                        <tr class="odd gradeX">
                                            <td>${lisc.uci_id}</td>
                                            <td>${lisc.vb_id}</td>
                                            <td>${lisc.country}</td>
                                            <td>${lisc.ex_factory_price}</td>
                                            <td>${lisc.present_price}</td>
                                            <td>${lisc.vehicle_age}</td>
                                            <td>${lisc.road_hual}</td>
                                            <td>
                                            <div>
                                            <a class="btn btn-info" href = "" data-toggle="modal" data-target="#roleInfo">查看</a>
                                            <button type="button" class="btn btn-warning">修改</button>
						  					<button type="button" class="btn btn-danger">删除</button>
						  					<button type="button" class="btn btn-info">添加质量信息</button>
						  					</div>
						  					</td>
                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            <div class="container">
							  <ul class="pagination pagination-sm">
							    <li class="page-item"><a class="page-link" href="vbrand/findAllVBrandInfo?page=${requestScope.nowPage-1}">上一页</a></li>
							    <li class="page-item disabled"><a class="page-link"><c:if test="${requestScope.nowPage==1}">首页</c:if>
							    <c:if test="${requestScope.nowPage!=1}">第${requestScope.nowPage}页</c:if></a></li>
							    <li class="page-item disabled"><a class="page-link">...</a></li>
							    <li class="page-item disabled"><a class="page-link">共${requestScope.maxPage}页</a></li>
							    <li class="page-item"><a class="page-link" href="vbrand/findAllVBrandInfo?page=${requestScope.nowPage+1}">下一页</a></li>
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

s