package program;

public class Test {
	
	public void getCity() {
		System.out.println("Hyderabad");
			
	}	
	}
 class Demo extends Test {
	 public void getCity() {
		 System.out.println("Bangalore");
	 }
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.getCity();
		demo.getCity();
	}
}

