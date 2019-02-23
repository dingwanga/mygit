package cn.bdqn.test;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.entity.User;
import cn.bdqn.service.UserService;

public class Test1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		// 使用ApplicationContext接口的实现类ClassPathXmlApplicationContext加载Spring配置文件
		ApplicationContext acx=new ClassPathXmlApplicationContext("applicationContext.xml");
		// 通过ApplicationContext接口的getBean()方法获取id或name为userService的Bean实例
		UserService service=(UserService) acx.getBean("userService");
		User user = new User();
		user.setId(1);
		user.setUsername("test");
		user.setPassword("123456");
		user.setEmail("test@xxx.com");
		service.addNewUser(user);
	}

}
