package demo.i_where;

import java.util.List;

public class UserExample {
	private Integer id;
	private Integer minId;
	private Integer maxId;
	private double money;
	private double minMoney;
	private double maxMoney;
	private List<Integer> ids;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMinId() {
		return minId;
	}
	public void setMinId(Integer minId) {
		this.minId = minId;
	}
	public Integer getMaxId() {
		return maxId;
	}
	public void setMaxId(Integer maxId) {
		this.maxId = maxId;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public double getMinMoney() {
		return minMoney;
	}
	public void setMinMoney(double minMoney) {
		this.minMoney = minMoney;
	}
	public double getMaxMoney() {
		return maxMoney;
	}
	public void setMaxMoney(double maxMoney) {
		this.maxMoney = maxMoney;
	}
	public List<Integer> getIds() {
		return ids;
	}
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	@Override
	public String toString() {
		return "UserExample [id=" + id + ", ids=" + ids + ", maxId=" + maxId
				+ ", maxMoney=" + maxMoney + ", minId=" + minId + ", minMoney="
				+ minMoney + ", money=" + money + "]";
	}
	

}
