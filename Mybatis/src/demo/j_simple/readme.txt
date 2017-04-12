1: 创建IUserDao接口
	这里的dao接口，方法的名字，必须与 配置文件中的id相同
	参数与返回值也要与配置文件中一致
	
2: 把userMapper.xml的名字，改为IUserDao.xml
       记着打开现在的IUserDao.xml文件，把namespace的值也改为：
   <mapper namespace="demo.j_simple.IUserDao">
   
3: 直接获取dao实现 （不用自己写dao层的实现类）

       给SqlSession的getMapper方法传入接口的字节码，mybatis就会帮我们实现该接口，
       并把实现了该接口的实现类的对象，创建出来，返回回来!
   IUserDao dao = session.getMapper(IUserDao.class);