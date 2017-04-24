package demo.c_createbean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@Test
	public void test() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("demo/c_createbean/applicationContext.xml");
		
		User u = (User) ctx.getBean("u");
		User u2 = (User) ctx.getBean("u2");
		User u3 = (User) ctx.getBean("u3");
		
		System.out.println(u);
		System.out.println(u2);
		System.out.println(u3);
	}
}
