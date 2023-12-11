package ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Ex2 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("ReflectionApi.Employee");
		System.out.print("Class Name : ");
		System.out.println(c.getName());
		
		System.out.print("Class Simple Name : ");
		System.out.println(c.getSimpleName());
		
		System.out.print("Class SuperClass Name :");
		System.out.println(c.getSuperclass());
		
		System.out.print("Class Modifier Name : ");
		int modd =c.getModifiers();
		System.out.println(Modifier.toString(modd));
		
		System.out.print("Class Interfaces Name : ");
		Class[] cl = c.getInterfaces();
				for(Class cls : cl) {
					System.out.print(cls.getSimpleName()+"\t");
				}
				System.out.println();
				
		System.out.print("Class Fields Names : ");
		Field[] fl = c.getDeclaredFields();
		for(Field fls : fl) {
			System.out.print(fls.getName()+"\t");
		}
		System.out.println();
		
		System.out.print("Class Constructors Names : ");
		Constructor[] cn = c.getDeclaredConstructors();
		for(Constructor cns : cn ) {
			System.out.print(cns.getName()+"\t");
		}
		System.out.println();
		
		System.out.print("Class Methods Names : ");
		Method[] mt = c.getDeclaredMethods();
		for(Method mts : mt) {
			System.out.print(mts.getName()+"\t");
		}
		
	}

}
