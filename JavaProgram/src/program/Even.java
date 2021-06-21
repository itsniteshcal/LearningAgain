package program;

public class Even {
	public static void main(String[] args) {
		int num=28;
		if(num%3==0) {
			System.out.println("fizz");
		}
		else	if (num % 7 ==0) {
			System.out.println("buzz");
			
		}
		else if (num%4==0 && num%7==0) {
			System.out.println("fizz bizz");
		}
		else {
			System.out.println("Not divisible by any no.");
		}
}
}