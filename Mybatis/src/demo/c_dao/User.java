package demo.c_dao;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private Integer id;
	private String name;
	private Date birthday;
	private double money;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "User [birthday=" + birthday + ", id=" + id + ", money=" + money
				+ ", name=" + name + "]";
	}
	
	

}
