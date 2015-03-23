package test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import yonyou.marketing.api.user.entity.SysUser;
import yonyou.marketing.api.user.services.UserService;


public class ConsumerTest {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring/spring-context.xml" });
		context.start();

		UserService userService = (UserService) context.getBean("userService");
		String hello = userService.findUserByNo("E521");
		System.out.println(hello);
		System.in.read();
	}

}