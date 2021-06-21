package abstraction.abstractclass;

public abstract class Sample 
{
	void disp() 
	{
		System.out.println("Disp");
	}
	abstract void demo();

}
class Sample2 extends Sample{
	void demo() {
		System.out.println("demo in sample 2");
	}
	
public static void main(String[] args) {
		Sample2 ref = new Sample2();
		ref.demo();
		ref.disp();
		
	}

}

	