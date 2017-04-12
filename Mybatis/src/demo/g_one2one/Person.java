package demo.g_one2one;

import java.io.Serializable;

public class Person implements Serializable {
	private Integer pid;
	private String pname;
	private Card card;
	public Person() {
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}
}
