$package('BenFrame.login');
BenFrame.login = function(){
	return {
		toLogin:function(){
			try{
				var form = $("#loginForm");
				if(form.form('validate')){
					BenFrame.progress('Please waiting','Loading...');
					BenFrame.submitForm(form,function(data){
						BenFrame.closeProgress();
						if(data.success){
					 		window.location= "mainPre.do";
				        }else{
				       	   BenFrame.alert('提示',data.msg,'error');  
				        }
				        //BenFrame.login.loadVrifyCode();//刷新验证码
					});
				}
			}catch(e){
				alert(e);
			}
			return false;
		},
		loadVrifyCode:function(){//刷新验证码
			var _url = "ImageServlet?time="+new Date().getTime();
			$(".vc-pic").attr('src',_url);
		},
		init:function(){
			
			if(window.top != window.self){
				window.top.location =  window.self.location;
			}
			//验证码图片绑定点击事件
			//$(".vc-pic").click(BenFrame.login.loadVrifyCode);
			
			var form = $("#loginForm");
			form.submit(BenFrame.login.toLogin);
		} 
	}
}();

$(function(){
	BenFrame.login.init();
});		

function logon(){
	BenFrame.login.toLogin();
}