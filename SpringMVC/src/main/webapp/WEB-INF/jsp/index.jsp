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

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
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

<script type="text/javascript">
	function getModuleInfo() {
		$.ajax({
			type : "GET",
			dataType : "json",
			url : "customer/showCustomer",
			//data: { id: id, name: name },
			success : function(json) {
				var tbBody = "";
				for (var i = 0; i < json.length; i++) {

					tbBody += "<tr><td>" + json[i].firstName + "</td>"
							+ "<td>" + json[i].lastName + "</td>" + "<td>"
							+ json[i].addressId + "</td>" + "<td>"
							+ json[i].email + "</td>" + "<td>"
							+ json[i].customerId + "</td>" + "<td>"
							+ json[i].lastName + "</td></tr>";
					$("#myTb").append(tbBody);
				}
			},
			error : function(json) {
				alert("加载失败");
			}
		});
	}
	$(function() {
		getModuleInfo();
	});
</script>
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
		<h3>客户管理</h3>
		<hr style="height:1px;border:none;border-top:1px solid #555555;" />

		<h4>客户列表</h4>
		<div style="padding-left:200px;margin-top:-40px">
			<button type="button" class="btn btn-primary">新建</button>
		</div>
		<table id="myTb" class="table table-striped">
			<thead>
				<tr>

					<th>First Name</th>
					<th>Last Name</th>
					<th>Address</th>
					<th>Email</th>
					<th>CustomerId</th>
					<th>LastUpdate</th>
				</tr>
			</thead>




		</table>
	</div>

</body>
</html>
