package demo.f_many2many;

import java.util.Set;

public class Stu {
	private Integer sid;
	private String sname;
	private Set<Teacher> teachers;
	public Stu() {
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Set<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	public String toString() {
		return "Stu [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	
}
