package JVMArchitecture;

class Employee{
	public Employee() {
		System.out.println("Objecct Creating......");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object Destroying......");
	}
	
	
}


public class GarbageCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp=null;
		System.gc();
	}

}
