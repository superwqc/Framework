package demo.test;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.domain.User;
import demo.service.IUserService;

public class App {
	@Test
	public void testSave() throws Exception {
		
		ApplicationContext acx=new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService service=(IUserService) acx.getBean("userServiceImpl");
		
//		service.save(new User("Geogle",new Date(),899d));
		service.delte(17);
	}

}
