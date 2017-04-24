package demo.a_hello;

import java.io.Serializable;

public class User implements Serializable {
	private Integer id;
	private String name;
	public User() {
		System.out.println("ssssssssssssssss");
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
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	

}
