//package yonyou.marketing.web.wechat.actions;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.alibaba.dubbo.common.logger.Logger;
//import com.alibaba.dubbo.common.logger.LoggerFactory;
//import com.github.sd4324530.fastweixin.handle.EventHandle;
//import com.github.sd4324530.fastweixin.handle.MessageHandle;
//import com.github.sd4324530.fastweixin.message.BaseMsg;
//import com.github.sd4324530.fastweixin.message.TextMsg;
//import com.github.sd4324530.fastweixin.message.req.TextReqMsg;
//import com.github.sd4324530.fastweixin.servlet.WeixinServletSupport;
//
//public class WeixinServlet extends WeixinServletSupport {
//    private static final Logger log = LoggerFactory.getLogger(WeixinServlet.class);
//    private static final String TOKEN = "myToken";
//    //设置TOKEN，用于绑定微信服务器
//    @Override
//    protected String getToken() {
//        return TOKEN;
//    }
//    //使用安全模式时设置：APPID
//    @Override
//    protected String getAppId() {
//        return null;
//    }
//    //使用安全模式时设置：密钥
//    @Override
//    protected String getAESKey() {
//        return null;
//    }
//    //重写父类方法，处理对应的微信消息
//    @Override
//    protected BaseMsg handleTextMsg(TextReqMsg msg) {
//        String content = msg.getContent();
//        System.out.println(content);
//        log.debug("用户发送到服务器的内容:{}"+content);
//        return new TextMsg("服务器回复用户消息!");
//    }
//    //1.1版本新增，重写父类方法，加入自定义微信消息处理器
//    protected List<MessageHandle> initMessageHandles() {
//        List<MessageHandle> handles = new ArrayList<MessageHandle>();
//        //handles.add(new MyMessageHandle());
//        return handles;
//    }
//    //1.1版本新增，重写父类方法，加入自定义微信事件处理器
//    protected List<EventHandle> initEventHandles() {
//        List<EventHandle> handles = new ArrayList<EventHandle>();
//        //handles.add(new MyEventHandle());
//        return handles;
//    }
//}
