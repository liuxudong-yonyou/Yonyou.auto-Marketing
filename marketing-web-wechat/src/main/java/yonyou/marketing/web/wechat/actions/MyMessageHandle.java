package yonyou.marketing.web.wechat.actions;

import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.req.BaseReqMsg;

public class MyMessageHandle implements MessageHandle{

	@Override
	public BaseMsg handle(BaseReqMsg message) {
		BaseMsg base = new BaseMsg();
		base.setToUserName(message.getToUserName());
		return base;
	}

	@Override
	public boolean beforeHandle(BaseReqMsg message) {
		// TODO Auto-generated method stub
		return false;
	}

}
