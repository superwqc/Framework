package demo.c_createbean;

import java.io.Serializable;

public class User implements Serializable {
	private Integer id;
	private String name;
	public User() {
		System.out.println("ÊµÀý»¯User");
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
