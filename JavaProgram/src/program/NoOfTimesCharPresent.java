package program;

public class NoOfTimesCharPresent {
	public static void main(String[] args) {
		
		String str="Good Friend is needed";
		char ch='e';
		int count=0;
		for(int i=0;i<=str.length()-1;i++) 
		{
			if(str.charAt(i)==ch) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
