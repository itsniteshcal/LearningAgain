package inbuilds_String;

public class CharAt {
	public static void main(String[] args) {
		String str="java developer";
		System.out.println(str.charAt(1));
		char a=str.charAt(5);
		System.out.println("1st index is "+a+" printed" );
          System.out.println(str);
		String string="java developer";
		int ch=string.indexOf('v');
		System.out.println(ch);

		String con_tains="java developer";
		boolean contain=con_tains.contains("va De");
		System.out.println(contain);

		String concat="java";
		String concatination=concat.concat(" developer");
		System.out.println(concatination);

		String sub_string="java developer";
		sub_string=sub_string.toUpperCase();
		System.out.println(sub_string);
		String sub=sub_string.substring(1,5);
		System.out.println(sub);
		
		String st1="    java  developer    ";
		st1.trim();
		st1=st1.replace("j","");
		System.out.println(st1);







	}

}
