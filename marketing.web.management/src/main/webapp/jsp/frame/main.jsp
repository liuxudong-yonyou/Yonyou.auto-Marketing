<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/resource.jsp"%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/main.css">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>BEN'S FRAMEWORK</title>
</head>
<body class="easyui-layout">
<div id='Loading' style="position:absolute;z-index:1000;top:0px;left:0px;width:100%;height:100%;background:#DDDDDB;text-align:center;padding-top: 20%;"><h1><font color="#15428B">加载中···</font></h1></div>
	<div data-options="region:'north',border:false" 
		style="height: 60px; background: #ffffff; padding: 10px">
		BENJAMIN'S NEW FRAMEWORK
		<div class="ui-login">
			<div class="ui-login-info">
				欢迎 <span class="orange">${user.userName}</span>登录系统&nbsp;&nbsp;&nbsp; 
				<a class="modify-pwd-btn" href="javascript:void(0);">修改密码</a> | <a class="logout-btn" href="${msUrl}/logout.shtml">退出</a>
			</div>
		</div>
		
	</div>
	<div data-options="region:'west',split:true,title:'我的菜单'" style="width: 150px; padding: 10px;">
		<ul id="treeMenu" class="ztree"></ul>
	</div>
	<div
		data-options="region:'east',split:true,collapsed:true,title:'East'"
		style="width: 100px; padding: 10px;">east region</div>
	<div data-options="region:'south',border:false"  
		style="height: 0px; background: #ffffff; padding: 10px;"></div>
	<div data-options="region:'center'">
		<div class="easyui-tabs" id="tab-box"
			data-options="fit:true,border:false,plain:true">
			<div title="首页" style="padding: 10px">
				<p style="font-size: 14px">build on jQuery EasyUI framework .</p>
				<ul>
					<li>1.TODO.</li>
					<li>2.TODO.</li>
					<li>3.TODO.</li>
					<li>4.TODO.</li>
				</ul>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/frame/main.js"></script>
</html>