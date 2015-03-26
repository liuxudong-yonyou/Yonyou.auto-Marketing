$package('BenFrame.main');
BenFrame.main = function(){
	return {
		init:function(){
			this.treeInit();
		},
		treeInit:function(){
			try{
				$.fn.zTree.init($("#treeDemo"), setting);
			}catch(e){
				BenFrame.alert('提示',e,'error');  
			}
		},
		addTabs:function(_title,_url){
			var boxId = '#tab-box';
			if($(boxId).tabs('exists',_title) ){
				var tab = $(boxId).tabs('getTab',_title);
				var index = $(boxId).tabs('getTabIndex',tab);
				$(boxId).tabs('select',index);
				if(tab && tab.find('iframe').length > 0){  
					 var _refresh_ifram = tab.find('iframe')[0];  
				     _refresh_ifram.contentWindow.location.href=_url;
			    } 
			}else{		
				var _content ="<iframe scrolling='auto' frameborder='0' src='"+_url+"' style='width:100%; height:100%'></iframe>";
				$(boxId).tabs('add',{
					    title:_title,
					    content:_content,
					    closable:true});
				
			}
		}
	}
}();

$(function(){
	BenFrame.main.init();
});		


var setting = {
		async: {
			enable: true,
			url:"getFuncList.do",
			autoParam:["id", "name=n", "level=lv"],
			otherParam:{"otherParam":"zTreeAsyncTest"}
			//dataFilter: filter
		}
};
