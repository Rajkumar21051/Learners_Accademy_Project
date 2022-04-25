package com.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Students {
	@Id
	@GeneratedValue
	private int Student_ID;
	private String Student_Name;
	private String Course_Name;
	
	@OneToMany(mappedBy = "Tstd",cascade = CascadeType.ALL)
	List<Teachers> steac;
	@OneToMany(mappedBy = "subs",cascade = CascadeType.ALL)
	List<Subjects> ssub;
	public int getStudent_ID() {
		return Student_ID;
	}
	public void setStudent_ID(int student_ID) {
		Student_ID = student_ID;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public String getCourse_Name() {
		return Course_Name;
	}
	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}
	public String getSteac() {
		StringBuilder sbt = new StringBuilder();
		if(steac != null) {
			for(Teachers te : steac) {
				sbt.append(te.getTeacher_Name()+" ,");
			}
			
		}
		return sbt.toString();
	}
	public void setSteac(List<Teachers> steac) {
		this.steac = steac;
	}
	public String getSsub() {
		StringBuilder sbs = new StringBuilder();
		if(ssub != null) {
			for(Subjects suj : ssub) {
				sbs.append(suj.getSubject()+" ,");
			}
			
		}
		return sbs.toString();
	}
	public void setSsub(List<Subjects> ssub) {
		this.ssub = ssub;
	}
	public Students(int student_ID, String student_Name, String course_Name, List<Teachers> steac,
			List<Subjects> ssub) {
		super();
		Student_ID = student_ID;
		Student_Name = student_Name;
		Course_Name = course_Name;
		this.steac = steac;
		this.ssub = ssub;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
