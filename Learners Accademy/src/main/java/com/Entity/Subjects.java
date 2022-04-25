package com.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;


@Entity
public class Subjects {
@Id	
@GeneratedValue
private int Subject_Id;
private String Subject;
@ManyToOne(cascade = CascadeType.ALL)
@JoinTable(name = "Subject_Course_Table", joinColumns = {@JoinColumn(name = "Subject_ID1")}, inverseJoinColumns = {@JoinColumn(name = "Student_ID")} )
Students subs;
public int getSubject_Id() {
	return Subject_Id;
}
public void setSubject_Id(int subject_Id) {
	Subject_Id = subject_Id;
}
public String getSubject() {
	return Subject;
}
public void setSubject(String subject) {
	Subject = subject;
}
public Students getSubs() {
	return subs;
}
public void setSubs(Students subs) {
	this.subs = subs;
}
public Subjects(int subject_Id, String subject, Students subs) {
	super();
	Subject_Id = subject_Id;
	Subject = subject;
	this.subs = subs;
}
public Subjects() {
	super();
	// TODO Auto-generated constructor stub
}




}
