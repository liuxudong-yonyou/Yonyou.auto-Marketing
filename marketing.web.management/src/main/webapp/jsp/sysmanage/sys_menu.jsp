<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/resource.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>userManage</title>
</head>
<body class="easyui-layout">
<div id='Loading' style="position:absolute;z-index:1000;top:0px;left:0px;width:100%;height:100%;background:#DDDDDB;text-align:center;padding-top: 20%;"><h1><font color="#15428B">加载中···</font></h1></div>
	<!-- Search panel start -->
	<div class="ui-search-panel" style="height:80px" region="north" title="查询条件"
		data-options="striped: true,collapsible:false,iconCls:'icon-search',border:false">
		<form id="searchForm">
			<input class="hidden" id='search_parentId' name="parentId">
			<p class="ui-fields">
				<label class="ui-label">菜单名称:</label> <input name="name" class="easyui-box ui-text" style="width: 100px;">
			</p>
			<a id="btn-search" class="easyui-linkbutton" iconCls="icon-search">Search</a>
		</form>
	</div>
	<!--  Search panel end -->
	<!-- DataList  -->
	<div region="center" border="false">
		<table id="data-list"></table>
	</div>
	
	<!-- 其他隐藏的内容 -->
	<div id="edit-win" class="easyui-dialog" title="菜单维护" data-options="closed:true,iconCls:'icon-save',modal:true"  style="width:500px;height:450px;">  
     	<form id="editForm" class="ui-form" method="post"> 
     	 <!-- 隐藏文本框 -->
     	 <input class="hidden" name="id">
     	 <input class="hidden" name="deleted">
    	 <input class="hidden" name="parentId" id='edit_parentId'>
    	 <div class="easyui-panel" border='false' style="width:450px;height: 350px;">  
	        <div class="easyui-layout" data-options="fit:true">
	            <div data-options="region:'north',split:true" style="height:185px;padding:10px">  
	               <div class="ftitle">信息</div>    
		           <div class="fitem">  
		               <label>菜单名称:</label>  
		               <input class="easyui-validatebox" type="text" name="name" data-options="required:true">
		           </div>  
		           <div class="fitem">  
		               <label>入口action:</label>  
		               <input class="easyui-validatebox" type="text" name="actions"></input>
		           </div>  
		           <div class="fitem">  
		               <label>级别:</label>  
		               <input class="easyui-numberbox" type="text" value="0" name="rank" data-options="required:true,min:0,max:999">
		           </div> 
	            </div>
	            <div data-options="region:'center'">  
	              	<div id="toolbar">  
				        <a href="javascript:void(0)" id='addLine_btn' class="easyui-linkbutton" iconCls="icon-add" plain="true" >Add</a>  
				        <a href="javascript:void(0)" id='addDefLine_btn'class="easyui-linkbutton" iconCls="icon-add" plain="true" >AddDefault</a>
				        <a href="javascript:void(0)" id='delAllLine_btn'class="easyui-linkbutton" iconCls="icon-remove" plain="true" >Delete All</a>  
				    </div>  
				    <table id="btn-tb" style="width:100%">
				    	<thead>
				    	<tr>
				    		<th width="10%"></th>
				    		<th width="50%">按钮</th>
				    	</tr>
				    	</thead>
				    	<tbody>
				    	</tbody>
				    </table>
	            </div>
	         </div>
	       </div>
     	</form>
  	 </div>

</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/sysManage/sysMenu.js"></script>
</html>