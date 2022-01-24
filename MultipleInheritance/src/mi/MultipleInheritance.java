package mi;

public class MultipleInheritance implements Interface2{
	public void test1() 
	{
		System.out.println("Interface 1");
	}
	public void test2() 
	{
		System.out.println("Interface 2");
	}
	public static void main(String[] args) {
		MultipleInheritance obj=new MultipleInheritance();
		obj.test1();
		obj.test2();

	}

}
