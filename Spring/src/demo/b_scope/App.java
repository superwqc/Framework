package demo.b_scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	@Test
	public void test() throws Exception {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo/b_scope/applicationContext.xml");
		
		User u=(User) ctx.getBean("u");
		User u1=(User) ctx.getBean("u");
		User u2=(User) ctx.getBean("u");
//
//		
	}

}