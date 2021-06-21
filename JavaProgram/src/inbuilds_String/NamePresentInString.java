package inbuilds_String;

public class NamePresentInString {
	public static void main(String[] args) {
		String str="Good Friend Is needed";
		int j=23;
		String str1 = String.valueOf(j);
		String[] name=str.split(" ");
		
		for(int i=0;i<=name.length-1;i++) {
			System.out.println(name[i]);
			String g=name[i];
			if(name[i].contains("good")) {
				System.out.println("present");
				
				
			}
			
		}
	}

}
