package com.falah.main;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.falah.annotation.Institute;
import com.falah.student.Student;

public class main2{

	public static void main(String[] args) throws Exception {
		Student st = new Student(111, "Junaid", "Jaipur");
		st.getStudentDetail();
		System.out.println();
		
		Class cl = Class.forName("com.falah.student.Student");
		Method m =cl.getMethod("getStudentDetail");
		Annotation ann =m.getAnnotation(Institute.class);
		Institute ins =(Institute)ann;
		System.out.println("Institute Details Here: ");
		System.out.println("------------------------");
		System.out.println("Institute Name : "+ins.iname());
		System.out.println("Institute Address : "+ins.iadd());
		System.out.println("Institute Website : "+ins.iweb());
		
		

	}

}
