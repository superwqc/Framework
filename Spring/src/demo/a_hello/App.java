package demo.a_hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	@Test
	public void test() throws Exception {
		//启动spring容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo/a_hello/applicationContext.xml");
		//向容器索取名字叫u的对象
		User u=(User) ctx.getBean("u");

		
	}

}