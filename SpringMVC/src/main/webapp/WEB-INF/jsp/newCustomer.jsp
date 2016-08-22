<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'newCustomer.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet"
	href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<link rel="stylesheet"
	href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/bootstrap-table.min.css">
<script
	src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/bootstrap-table.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>

<body>

	<div style="height:50px;background:#3366FF;margin-top:-20px">
		<h2 style="padding-top:10px;">电影租赁管理系统</h2>
		<span style="float:right;margin-top:-30px;">您好!${customer.firstName}</span>
	</div>
	<div style="width:20%;float:left">
		<ul class="nav nav-pills nav-stacked">
			<li role="presentation" class="active"><a href="#">Customer管理</a></li>
			<li role="presentation"><a href="#">Film设置</a></li>

		</ul>
	</div>

	<div style="width:80%;float:left">
		<h3>创建Customer</h3>
		<hr style="height:1px;border:none;border-top:1px solid #555555;" />

		<h4>基本信息</h4>

        <div>
        <form class="form-horizontal" action="<%= request.getContextPath()%>/customer/save" method="post">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">First Name</label>
    <div class="col-sm-4">
      <input type="text" name="firstName" class="form-control" id="inputEmail3" placeholder="First Name">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Last Name</label>
    <div class="col-sm-4">
      <input type="text" name="lastName" class="form-control" id="inputPassword3" placeholder="Last Name">
    </div>
  </div>
   <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Email</label>
    <div class="col-sm-4">
      <input type="text" name="email" class="form-control" id="inputPassword3" placeholder="Email">
    </div>
  </div>
  
  <div class="form-group">
    <div class="col-sm-offset-2">
      <button type="submit" class="btn btn-primary">新建</button>
      <button onclick="location='<%= request.getContextPath()%>/hello/checkLogin' " class="btn btn-default">取消</button>
    </div>
   
  </div>
</form>
        </div>

	</div>

</body>
</html>
