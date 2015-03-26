$package('BenFrame.userManage')
BenFrame.userManage=function(){
	var _box = null;
	var _this =  {
		config:{
  			dataGrid:{
  				title:'SiteType List',
	   			url:'userList.do',
	   			columns:[[
						{field:'userId',checkbox:true},
						{field:'userName',title:'用户名',width:120,sortable:true},
						{field:'realName',title:'真实姓名',width:80,sortable:true},
						{field:'userStatus',title:'状态',width:80,align:'center',sortable:true,styler:function(value,row,index){
							if(value == 10011001){
							  return 'color:red;';  
							}
						},
						formatter:function(value,row,index){
							if(value == 1){
								return "禁用";
							}else{
								return "可用";
							}
						}},
						{field:'createDate',title:'创建日期',width:120,sortable:true}
						
				]],
				toolbar:[
					{id:'btnadd',text:'Add',btnType:'add'},
					{id:'btnedit',text:'Edit',btnType:'edit'},
					{id:'btnedit',text:'Edit PWD',btnType:'editPwd',iconCls:'icon-edit',handler:function(){
							var selected = _box.utils.getCheckedRows();
							if ( _box.utils.checkSelectOne(selected)){
								_this.editPwdForm().resetForm();
								_this.editPwdForm().find("input[name='id']").val(selected[0].id);
								_this.editPwdForm().find("input[name='email']").val(selected[0].email);
								_this.editPwdWin().window('open'); 
							}
						}},
					{id:'btndelete',text:'Delete',btnType:'remove'}
				]
			}
		},
		init:function(){
			_box = new myDataGrid(_this.config); 
			_box.init();
		}
	}
	return _this;
}();

$(function(){
	BenFrame.userManage.init();
});