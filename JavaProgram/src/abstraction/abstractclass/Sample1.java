package abstraction.abstractclass;

public abstract class Sample1 {
	void disp()
	{
		System.out.println("Disp");
	}
	static void test() 
	{
		System.out.println("Test");
			}
	 abstract void demo() ;	 
	 public static void main(String[] args) {
		 Sample1.test();
	}
}

