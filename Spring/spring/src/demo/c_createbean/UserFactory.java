package demo.c_createbean;

public class UserFactory {
	public static User getUser() {
		return new User();
	}
	
	public  User getUser2() {
		return new User();
	}
}
