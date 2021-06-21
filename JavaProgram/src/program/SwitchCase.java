package program;

public class SwitchCase {
	public static void main(String[] args) {
		String color="Green";
		switch(color) 
		{
		default :
			System.out.println("Not found any color");
			break;
		case "Red":
			System.out.println("Red Found Stop");
			break;
		case "Green":
			System.out.println("Green Found Stop");
			//break;
		case "Yellow":
			System.out.println("Yellow Found Stop");
			break;
			
		}
	}

}
