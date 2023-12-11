package ReflectionApi;

import java.io.Serializable;
import java.rmi.Remote;

public class Employee implements Serializable , Cloneable ,Comparable , Remote{

		int eno;
		String ename;
		int esal;
		String eadd;
		
		public Employee(int eno) {
			
		}
		public Employee(int eno , String ename) {
			
		}
		public Employee(int eno , String ename , int esal) {
			
		}
		public Employee(int eno , String ename , int esal , String eadd) {
			
		}
		
		public void add(int eno , String ename , int esal , String eadd) {
			
		}
		public String search(int eno) {
			return "";
		}
		public void Update(int eno , String ename , int esal , String eadd) {
			
		}
		public void delete(int eno , String ename , int esal , String eadd) {
			
		}
}
