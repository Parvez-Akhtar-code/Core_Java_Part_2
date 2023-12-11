package ReflectionApi;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Person{
	public static int pno=111;
	protected static final String pname="parvez";
	private static  int psalary = 25000;
	public static volatile String padd = "jaipur";
}


public class Ex3 {

	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		Class c = Class.forName("ReflectionApi.Person");
		Field[] fl = c.getDeclaredFields();
		for(Field fls : fl) {
			fls.setAccessible(true);
			System.out.print("Field Name : ");
			System.out.println(fls.getName());
			System.out.print("Field Datatype : ");
			System.out.println(fls.getType());
			System.out.print("Field Value : ");
			System.out.println(fls.get(fls));
			System.out.print("Field Access Modifiers : ");
			int mod = fls.getModifiers();
			System.out.println(Modifier.toString(mod));
			System.out.println("-------------------------");
		}
	}

}
