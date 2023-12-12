package Introspection;

import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Method;

class Employee implements Serializable{
	private int eno;
	private String ename;
	private int esal;
	private String eadd;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	
	
}

public class JavaBeanEx {

	public static void main(String[] args) throws Exception{
		/*	Employee emp = new Employee();
		emp.setEno(111);
		emp.setEname("parvez");
		emp.setEsal(25000);
		emp.setEadd("jaipur");
		
		System.out.println("Employee Details ---->");
		System.out.println("Employee number : "+emp.getEno());
		System.out.println("Employee name : "+emp.getEname());
		System.out.println("Employee salary : "+emp.getEsal());
		System.out.println("Employee address : "+emp.getEadd());
	*/
		BeanInfo beanInfo = Introspector.getBeanInfo(Employee.class);
		BeanDescriptor bds = beanInfo.getBeanDescriptor();
		System.out.println(bds.getName());
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		for(PropertyDescriptor pd : pds) {
			System.out.print(pd.getName()+"\t");
		}
		System.out.println();
		MethodDescriptor[] mds = beanInfo.getMethodDescriptors();
		for(MethodDescriptor md : mds ) {
			System.out.print(md.getName()+"\t");
		}
		
		
		
		
	}

}
