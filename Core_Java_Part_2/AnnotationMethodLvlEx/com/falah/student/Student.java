package com.falah.student;

import com.falah.annotation.Institute;

public class Student {
	int sid;
	String sname;
	String sadd;
	public Student(int sid, String sname, String sadd) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sadd = sadd;
	}
	@Institute
	public void getStudentDetail() {
		System.out.println("Student Details here-->");
		System.out.println("-----------------------");
		System.out.println("Student Id : "+sid);
		System.out.println("Student Name : "+sname);
		System.out.println("Student Address : "+sadd);
	}

}
