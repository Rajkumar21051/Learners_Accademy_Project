package com.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Teachers {
	@Id
	@GeneratedValue
	private int Teacher_Id;
	private String Teacher_Name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Teacher_Table", joinColumns = {@JoinColumn(name = "Teacher_ID1")}, inverseJoinColumns = {@JoinColumn(name = "Student_ID1")} )
	Students Tstd;

	public int getTeacher_Id() {
		return Teacher_Id;
	}

	public void setTeacher_Id(int teacher_Id) {
		Teacher_Id = teacher_Id;
	}

	public String getTeacher_Name() {
		return Teacher_Name;
	}

	public void setTeacher_Name(String teacher_Name) {
		Teacher_Name = teacher_Name;
	}

	public Students getTstd() {
		return Tstd;
	}

	public void setTstd(Students tstd) {
		Tstd = tstd;
	}

	public Teachers(int teacher_Id, String teacher_Name, Students tstd) {
		super();
		Teacher_Id = teacher_Id;
		Teacher_Name = teacher_Name;
		Tstd = tstd;
	}

	public Teachers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
