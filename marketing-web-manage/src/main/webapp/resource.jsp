<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- 公共资源CSS,JS  -->
<!--Css -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/jquery-easyui-1.4.1/themes/bootstrap/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/jquery-easyui-1.4.1/themes/icon.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/base.css">
<!-- JS -->
<script type="text/javascript" src="<%=request.getContextPath()%>/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.form.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/package.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/base.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/urls.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/myDataGrid.js"></script>


<!-- ztree tree -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/jquery.zTree-3.5.02/css/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="<%=request.getContextPath()%>/jquery.zTree-3.5.02/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/jquery.zTree-3.5.02/js/jquery.ztree.excheck-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/jquery.zTree-3.5.02/js/jquery.ztree.exedit-3.5.js"></script>
<script>
function closes(){
    $("#Loading").fadeOut("normal",function(){
        $(this).remove();
    });
}
var pc;
$.parser.onComplete = function(){
    if(pc) clearTimeout(pc);
    pc = setTimeout(closes, 100);
}
</script>