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
		$
				.ajax({
					type : "GET",
					dataType : "json",
					url : "customer/showCustomer",
					//data: { id: id, name: name },
					success : function(json) {
						var tbBody = "";
						for (var i = 0; i < json.length; i++) {

							tbBody += "<tr><td>"
									+ '<a data-toggle="modal" data-target="#myModal">编辑</a>|<a>删除</a>'
									+ "</td>" + "<td>" + json[i].firstName
									+ "</td>" + "<td>" + json[i].lastName
									+ "</td>" + "<td>" + json[i].addressId
									+ "</td>" + "<td>" + json[i].email
									+ "</td>" + "<td>" + json[i].customerId
									+ "</td>" + "<td>" + json[i].lastUpdate
									+ "</td></tr>";

						}
						$("#myTb").append(tbBody);
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

	<div style="height:60px;background:#3366FF;margin-top:-20px">
		<h2 style="padding-top:10px;">电影租赁管理系统</h2>
		<span style="float:right;margin-top:-30px;">您好!${customer.firstName}</span>
		<button style="float:right;margin-top:10px;">退出登录</button>
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
			<button type="button" class="btn btn-primary"
				onclick="location='<%=request.getContextPath()%>/customer/newCustomer' ">新建</button>
		</div>
		<table id="myTb" class="table table-striped">
			<thead>
				<tr>
					<th>操作</th>
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
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
		<form action="<%= request.getContextPath()%>/customer/change" method="post">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">更改Customer信息</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="inputEmail3">First
							Name</label>
						<div>
							<input type="text" name="firstName" class="form-control"
								id="inputEmail3" placeholder="First Name">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3">Last
							Name</label>
						<div>
							<input type="text" name="lastName" class="form-control"
								id="inputPassword3" placeholder="Last Name">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3">Email</label>
						<div>
							<input type="text" name="email" class="form-control"
								id="inputPassword3" placeholder="Email">
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭
					</button>
					<button type="button" class="btn btn-primary">提交更改</button>
				</div>
			</div>
			</form>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
</body>
</html>
