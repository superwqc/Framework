package demo.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	private Double money;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String name, Date birthday, Double money) {
		this.name = name;
		this.birthday = birthday;
		this.money = money;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "User [birthday=" + birthday + ", id=" + id + ", money=" + money
				+ ", name=" + name + "]";
	}
	

}