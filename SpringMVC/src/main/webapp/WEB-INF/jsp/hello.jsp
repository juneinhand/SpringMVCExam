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

<title>My JSP 'hello.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet"
	href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet"
	href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>

<body style="padding: 100px 0px 30px 0px;
	background-image:url(resources/imgs/background.jpg);
	background-position: top;
	background-color:#ECF7E9;
	background-repeat: no-repeat;">
	
	<div style="margin-top:-100px">
	<h2>10920-郭俊</h2>
	</div>
	
		<div style="width:500px;margin-top:90px;margin-left: auto;margin-right: auto;
	background:#FFFFCC;padding: 10px 20px 10px 20px">
	<span>${message}</span>
			<h3 align="center">电影租赁管理系统</h3>
			<div style="background:white">
				<form action="<%= request.getContextPath()%>/hello/checkLogin" method="post">
					<div class="form-group">
						<label for="exampleInputName">用户名</label> <input
							type="text" class="form-control" name="firstName" id="exampleInputName"
							placeholder="用户名">
					</div>


					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</div>
		</div>


</body>
</html>
