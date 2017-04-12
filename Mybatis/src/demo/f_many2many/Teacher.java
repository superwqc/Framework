package demo.f_many2many;

import java.io.Serializable;
import java.util.Set;

public class Teacher implements Serializable {
	private Integer tid;
	private String tname;
	private Set<Stu> stus;
	public Teacher() {
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Set<Stu> getStus() {
		return stus;
	}
	public void setStus(Set<Stu> stus) {
		this.stus = stus;
	}
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + "]";
	}
}
