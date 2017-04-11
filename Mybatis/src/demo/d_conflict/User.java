package demo.d_conflict;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private Integer id2;
	private String name2;
	private Date birthday2;
	private Double money2;
	public User() {
	}
	public Integer getId2() {
		return id2;
	}
	public void setId2(Integer id2) {
		this.id2 = id2;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public Date getBirthday2() {
		return birthday2;
	}
	public void setBirthday2(Date birthday2) {
		this.birthday2 = birthday2;
	}
	public Double getMoney2() {
		return money2;
	}
	public void setMoney2(Double money2) {
		this.money2 = money2;
	}
	public String toString() {
		return "User [birthday2=" + birthday2 + ", id2=" + id2 + ", money2="
				+ money2 + ", name2=" + name2 + "]";
	}
	
		
	
}
