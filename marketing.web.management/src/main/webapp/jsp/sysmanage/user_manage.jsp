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
<!-- Search panel start -->
 	 <div class="ui-search-panel" region="north"  title="Search box" data-options="striped: true,collapsible:false,iconCls:'icon-search',border:false" >  
 	 <form id="searchForm">
 	 	<p class="ui-fields">
 	 	    <label class="ui-label">userName:</label><input name="userName" class="easyui-box ui-text" style="width:100px;">
        </p>
        <a href="#" id="btn-search" class="easyui-linkbutton" iconCls="icon-search">Search</a>
      </form>  
     </div> 
<!--  Search panel end -->
<!-- DataList  -->
     <div region="center" border="false" >
     	<table id="data-list"></table>
     </div>
     
</body>
<script type="text/javascript" src="${msUrl}/js/sysManage/userManage.js"></script>
</html>