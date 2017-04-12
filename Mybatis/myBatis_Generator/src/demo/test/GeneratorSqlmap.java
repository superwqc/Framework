package demo.test;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSqlmap {
	public void generator() throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		// 指定逆向工程配置文件
		File configFile = new File("src/generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback, warnings);
		myBatisGenerator.generate(null);
		
		//输出over则证明逆向工程完毕  只能执行一次 否则会叠加
		System.out.println("over");
	}
	public static void main(String[] args) throws Exception {
		try {
			GeneratorSqlmap t = new GeneratorSqlmap();
			t.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
