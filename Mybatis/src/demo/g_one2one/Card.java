package demo.g_one2one;

import java.io.Serializable;

public class Card implements Serializable {
	private Integer cid;
	private String cname;
	private Person person;
	public Card() {
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String toString() {
		return "Card [cid=" + cid + ", cname=" + cname + "]";
	}
}
