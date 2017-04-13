package demo.domain;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private Date birthday;

    private Double money;

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
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getMoney() {
        return money;
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