$package('BenFrame.main');
BenFrame.main = function() {
	return {
		init : function() {
			this.treeInit();
		},
		treeInit : function() {
			try {
				$.fn.zTree.init($("#treeMenu"), setting);
			} catch (e) {
				BenFrame.alert('提示', e, 'error');
			}
		},
		addTabs : function(_title, _url) {
			var boxId = '#tab-box';
			if ($(boxId).tabs('exists', _title)) {
				var tab = $(boxId).tabs('getTab', _title);
				var index = $(boxId).tabs('getTabIndex', tab);
				$(boxId).tabs('select', index);
				if (tab && tab.find('iframe').length > 0) {
					var _refresh_ifram = tab.find('iframe')[0];
					_refresh_ifram.contentWindow.location.href = _url;
				}
			} else {
				var _content = "<iframe scrolling='auto' frameborder='0' src='"
						+ _url + "' style='width:100%; height:100%'></iframe>";
				$(boxId).tabs('add', {
					title : _title,
					content : _content,
					closable : true
				});

			}
		}
	}
}();

$(function() {
	BenFrame.main.init();
});

var setting = {
	treeId : "menuTree",
	treeObj : null,
	async : {
		autoParam : [ "id" ],
		enable : true,
		url : "getFuncList.do"
	},
	check : {// 设置 zTree 的节点上是否显示 checkbox / radio ,默认为false
		enable : false
	},
	callback : {
		onClick : menuOnClick
	}
};

function menuOnClick(event, treeId, treeNode) {
	alert(treeNode.menuUrl);
	BenFrame.main.addTabs(treeNode.name,treeNode.menuUrl);
}


