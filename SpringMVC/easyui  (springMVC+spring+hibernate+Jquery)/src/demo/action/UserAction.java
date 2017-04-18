package demo.action;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.domain.User;

@Controller
@RequestMapping("/user")
public class UserAction {

	@RequestMapping("/f1")
	public void f1(HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();

		List<User> list = new ArrayList<User>();
		User u = new User();
		User u2 = new User();
		User u3 = new User();
		User u4 = new User();
		u.setId(1);
		u.setName("aa");
		u.setBirthday(new Date());
		u.setMoney(500d);
		u2.setId(2);
		u2.setName("bb");
		u2.setBirthday(new Date());
		u2.setMoney(600d);
		u3.setId(3);
		u3.setName("cc");
		u3.setBirthday(new Date());
		u3.setMoney(700d);
		u4.setId(4);
		u4.setName("ddddd");
		u4.setBirthday(new Date());
		u4.setMoney(800d);
		list.add(u);
		list.add(u2);
		list.add(u3);
		list.add(u4);

		JsonConfig jc = new JsonConfig();
		jc.registerJsonValueProcessor(Date.class, new JsonValueProcessor() {
			public Object processObjectValue(String arg0, Object arg1,
					JsonConfig arg2) {
				// System.out.println(arg0+"-"+arg1+"-"+arg2);
				Date dd = (Date) arg1;
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				return sdf.format(dd);
			}

			public Object processArrayValue(Object arg0, JsonConfig arg1) {
				return null;
			}
		});

		String json = JSONArray.fromObject(list, jc).toString();
		System.out.println(json);
		out.println(json);
	}

	@RequestMapping("/save")
	public void save(User user, HttpServletResponse response) throws Exception {
		System.out.println("save:" + user);

		response.getWriter().println("{}");

	}

}
