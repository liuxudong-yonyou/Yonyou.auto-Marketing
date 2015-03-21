$package('BenFrame.sysMenu');
BenFrame.userManage = function() {
	var _box = null;
	var _this = {
		// 设置默认按钮数据
		addDefBtns : function() {
			var defaultBtns = [ {
				"btnName" : "添加",
				"menuid" : 2,
				"actionUrls" : "save.do",
				"btnType" : "add"
			}, {
				"btnName" : "修改",
				"menuid" : 2,
				"actionUrls" : "getId.do|save.do",
				"btnType" : "edit"
			}, {
				"btnName" : "删除",
				"menuid" : 2,
				"actionUrls" : "delete.do",
				"btnType" : "remove"
			} ];
			var tbline = $(".tb-line:visible");
			var btnType = $("input[name='btnType']", tbline);
			$.each(defaultBtns, function(i, btn) {
				var isExists = false;
				// 判断按钮类型是否存在
				if (btnType.length > 0) {
					for (var i = 0; i < btnType.length; i++) {
						if (btnType.eq(i).val() == btn.btnType) {
							isExists = true;
							break;
						}
					}
				}
				if (!isExists) {

					_this.addLine(btn);
				}
			});
		},
		// 删除全部
		delAllLine : function(b) {
			if (b) {
				$(".tb-line").remove();
			} else {
				$(".tb-line").each(function(i, line) {
					_this.delLine($(line));
				});
			}
		},
		// 删除单行
		delLine : function(line) {
			if (line) {
				var btnId = $("input[name='btnId']", line).val();
				if (btnId) {
					$("input[name='deleteFlag']", line).val(1); // 设置删除状态
					line.fadeOut();
				} else {
					line.fadeOut("fast", function() {
						$(this).remove();
					});
				}
			}
		},
		addLine : function(data) {
			var table = $("#btn-tb");
			var html = "<tr class='tb-line'>";
			html += "	<td align='center'><span  class='newFlag red'>*</span></td>";
			html += "	<td><input name=\"btnType\" class=\"easyui-validatebox text-name\" style=\"width:100%\" data-options=\"required:true\"></td>";
			html += "	<td align='left'><a class=\"easyui-linkbutton remove-btn\"  iconCls=\"icon-remove\" plain=\"true\"></a>";
			html += "	<input class=\"hidden\" name=\"btnId\">";
			html += "	<input class=\"hidden\" name=\"deleteFlag\">";
			html += "	</td>";
			html += "</tr>";
			var line = $(html);
			// 版定删除按钮事件
			$(".remove-btn", line).click(
					function() {
						BenFrame.confirm('Confirm',
								'Are you sure you want to delete record?',
								function(r) {
									if (r) {
										_this.delLine(line);
									}
								})
					});
			if (data) {
				if (data.id) {
					$(".newFlag", line).html(''); // 清空新增标记
				}
				$("input[name='btnType']", line).val(data.btnType);
			}
			$.parser.parse(line);// 解析esayui标签
			table.append(line);

		},
		config : {
			action : {
				//myDataGrid中有默认值 这里设置了可以修改默认值
				save : '', // 新增&修改 保存Action
				getId : '',// 编辑获取的Action
				delele : ''// 删除数据的Action
			},
			event : {
				add : function() {
					_this.delAllLine(true);// 清空已有的数据
					_box.handler.add();// 调用add方法
					var parentId = $('#search_parentId').val();
					if (parentId) {
						$("#edit_parentId").val(parentId);
					}
				},
				edit : function() {
					_this.delAllLine(true);
					_box.handler.edit(function(result) {
						var functions = (result.data.functions).split("|");
						$.each(functions, function(i, name) {
							// 定义一个btn对象来addline 暂时用不到这么多对象都设置为名字
							var Btn = {
								"btnName" : name,
								"menuid" : name,
								"actionUrls" : name,
								"btnType" :name
							};
							_this.addLine(Btn);
						});
					});
				}
			},

			dataGrid : {
				title : '菜单维护',
				url : 'sysMenuList.do',
				columns : [ [ {
					field : 'id',
					checkbox : true
				}, {
					field : 'name',
					title : '菜单名称',
					width : 120,
					sortable : true
				}, {
					field : 'rank',
					title : '级别',
					width : 80,
					sortable : true
				}, {
					field : 'deleted',
					title : '状态',
					width : 80,
					align : 'center',
					sortable : true,
					styler : function(value, row, index) {
						if (value == 10011002) {
							return 'color:red;';
						}
					},
					formatter : function(value, row, index) {
						if (value == 10011002) {
							return "无效";
						} else if (value == 10011001) {
							return "有效";
						} else {
							return "未知";
						}
					}
				}, {
					field : 'createTime',
					title : '创建日期',
					width : 120,
					sortable : true
				}

				] ],
				toolbar : [ {
					id : 'btnadd',
					text : '新增',
					btnType : 'add'
				}, {
					id : 'btnedit',
					text : '修改',
					btnType : 'edit'
				},
				// {id:'btnedit',text:'Edit
				// PWD',btnType:'editPwd',iconCls:'icon-edit',handler:function(){
				// var selected = _box.utils.getCheckedRows();
				// if ( _box.utils.checkSelectOne(selected)){
				// _this.editPwdForm().resetForm();
				// _this.editPwdForm().find("input[name='id']").val(selected[0].id);
				// _this.editPwdForm().find("input[name='email']").val(selected[0].email);
				// _this.editPwdWin().window('open');
				// }
				// }},
				{
					id : 'btndelete',
					text : '删除',
					btnType : 'remove'
				} ]
			}
		},
		init : function() {
			_box = new myDataGrid(_this.config);
			$('#addLine_btn').click(_this.addLine);
			$('#addDefLine_btn').click(_this.addDefBtns);
			$('#delAllLine_btn').click(
					function() {
						BenFrame.confirm('Confirm',
								'Are you sure you want to delete record?',
								function(r) {
									_this.delAllLine(false);
								});
					});
			_box.init();
		}
	}
	return _this;
}();

$(function() {
	BenFrame.userManage.init();
});