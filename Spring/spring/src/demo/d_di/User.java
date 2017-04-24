package demo.d_di;

import java.io.Serializable;

public class User implements Serializable {
	private Integer id;
	private String name;
	public User() {
		System.out.println("User()");
	}
	
	public User(Integer id) {
		System.out.println("User(Integer)");
		this.id = id;
	}
	public User(Integer id, String name) {
		System.out.println("User(Integer, String)");
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}
