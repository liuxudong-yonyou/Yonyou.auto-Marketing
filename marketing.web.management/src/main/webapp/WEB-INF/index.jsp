<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@include file="/resource.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BEN'S FRAMEWORK</title>


</head>
<body>
<div id='Loading' style="position:absolute;z-index:1000;top:0px;left:0px;width:100%;height:100%;background:#DDDDDB;text-align:center;padding-top: 20%;"><h1><font color="#15428B">加载中···</font></h1></div>
<!-- data-options="iconCls:'icon-save'" -->
<div id="w" class="easyui-window" title="BEN'S FRAMEWORK"  style="width:800px;height:300px;padding:5px;">  
		<div class="easyui-layout" data-options="fit:true"> 
			<div data-options="region:'east',split:true" style="width:300px;text-align: center;">  
				<form action="signIn.do"  id="loginForm"  method="post">
					<table style="text-align: center;vertical-align: middle;margin-top: 20%;margin-left:10%">  
			    		<tr>   
			    			<td>Name:</td>  
			    			<td><input class="easyui-validatebox" type="text" name="user_name" data-options="required:true,missingMessage:'帐号不能为空'"></input></td>
			    		</tr>
			    		<tr> 
			    			<td>Password:</td>
			    			<td><input class="easyui-validatebox" type="password" name="password" data-options="required:true,validType:'password',missingMessage:'密码不能为空'"></input></td>
			    		</tr>
					</table>
				</form>
			</div> 
			<div data-options="region:'center'" style="padding:10px;">
				<h2>MY FRAMEWORK</h2>
			</div> 
			 
			<div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
				<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="javascript:logon();">Sign In</a>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/login.js"></script>
</html>