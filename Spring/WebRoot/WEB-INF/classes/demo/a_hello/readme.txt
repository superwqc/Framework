IOC : inversion of control控制反转

不用框架时，需要实例化一个对象时：
	User user=new User();
所谓控制反转，是指实例化对象时，过程不需要再硬编码在源代码中，而是将实例化过程交给spring的IOC容器（map），
启动spring容器的时候，spring容器就可以立刻实例化bean配置。


控制反转好处：
	1.程序的实例化由配置文件控制，当修改配置文件，程序中new的对象也无需修改源代码。
	2.spring容器可实现自动装配的功能。