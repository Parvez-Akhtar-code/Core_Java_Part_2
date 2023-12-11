package ReflectionApi;

class A{
	A(){
		System.out.println("object is creating");
	}
}

public class Ex1 {

	public static void main(String[] args) throws ClassNotFoundException {
		A a = new A();
		Class c =Class.forName("ReflectionApi.A");
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
	}

}
