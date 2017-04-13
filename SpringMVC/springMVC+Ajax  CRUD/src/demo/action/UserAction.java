package demo.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.domain.User;

@Controller
@RequestMapping("/user")
public class UserAction {
	 @RequestMapping("/save")
	public String save(User u){
	System.out.println(u);	 
		return null;
	}
}
