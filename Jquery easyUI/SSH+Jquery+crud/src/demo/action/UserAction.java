package demo.action;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.domain.User;
import demo.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserAction {
	
	@Autowired
	private IUserService service;
	@RequestMapping("/save")
	public void save(User u,HttpServletResponse response) throws IOException{
		service.save(u);
		response.getWriter().println("{}");
		
	}
	@RequestMapping("/delete")
	public void delete(int id,HttpServletResponse response) throws IOException{
		service.delte(id);
		response.getWriter().println("{}");
		
	}
	@RequestMapping("/find")
	public void find(HttpServletResponse response) throws Exception{
		List<User> list=service.find();
		JsonConfig jc=new JsonConfig();
		
		jc.registerJsonValueProcessor(Date.class,new JsonValueProcessor(){
			
			public Object processObjectValue(String arg0, Object arg1,
					JsonConfig arg2) {
				Date dd= (Date) arg1;
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				return sdf.format(dd);
			}
			public Object processArrayValue(Object arg0, JsonConfig arg1) {
				return null;
			}
		});
		response.setCharacterEncoding("utf-8");
		String json=JSONArray.fromObject(list).toString();
		response.getWriter().println(json);
		
		
	}

}
