package yonyou.marketing.web.wechat.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.sd4324530.fastweixin.handle.EventHandle;
import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.TextMsg;
import com.github.sd4324530.fastweixin.message.req.TextReqMsg;
import com.github.sd4324530.fastweixin.servlet.WeixinControllerSupport;

@Controller
@RequestMapping("/weixin")
public class WeixinController extends WeixinControllerSupport {
	Logger log = Logger.getLogger(this.getClass());
        private static final String TOKEN = "123";
        //设置TOKEN，用于绑定微信服务器
        @Override
        protected String getToken() {
        	System.out.println("123");
            return TOKEN;
        }
        //使用安全模式时设置：APPID
        @Override
        protected String getAppId() {
            return null;
        }
        //使用安全模式时设置：密钥
        @Override
        protected String getAESKey() {
            return null;
        }
        //重写父类方法，处理对应的微信消息
        @Override
        protected BaseMsg handleTextMsg(TextReqMsg msg) {
            String content = msg.getFromUserName();
            System.out.println(content);
            log.debug("用户发送到服务器的内容:{}"+content);
            return new TextMsg("123123!");
        }
        /*1.1版本新增，重写父类方法，加入自定义微信消息处理器
         *不是必须的，上面的方法是统一处理所有的文本消息，如果业务觉复杂，上面的会显得比较乱
         *这个机制就是为了应对这种情况，每个MessageHandle就是一个业务，只处理指定的那部分消息
         */
        @Override
        protected List<MessageHandle> initMessageHandles() {
                List<MessageHandle> handles = new ArrayList<MessageHandle>();
                handles.add(new MyMessageHandle());
                return handles;
        }
        //1.1版本新增，重写父类方法，加入自定义微信事件处理器，同上
        @Override
        protected List<EventHandle> initEventHandles() {
                List<EventHandle> handles = new ArrayList<EventHandle>();
                //handles.add(new MyEventHandle());
                return handles;
        }
}
