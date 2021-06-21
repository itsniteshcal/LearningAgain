package abstraction.abstractclass;

public abstract class Sample3 {
	abstract void demo();
	abstract void test();

}
 abstract class Sample4 extends Sample3{
	 void demo(){
		System.out.println("demo");
	}
}
 
 class Sample5 extends Sample4{
	 void test() {
		 System.out.println("testing");
	 }
	 
 }
