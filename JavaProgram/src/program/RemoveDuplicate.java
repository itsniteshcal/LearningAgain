package program;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
//		String str="Neetii";
//		Set<Character> set=new HashSet<>();
//		StringBuffer sb = new StringBuffer();
//		for(int i=0;i<str.length();i++) {
//		Character	ch=str.charAt(i);
//		if(!set.contains(ch)) {
//			set.add(ch);
//			sb.append(ch);
//		}
//		}
//	System.out.println(sb);
		
		String str="Neetiiiishhh";
		Set<Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<=str.length()-1;i++)
		{
			
			Character ch=str.charAt(i);
			if(!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		
		
		
		System.out.println(set);
		System.out.println(sb);
		
		
		
		
		
}
}
//Set<Character> set=new HashSet<>(); 
//StringBuffer sf = new StringBuffer();
//for(int i=0;i<str.length();i++) {
//	Character c = str.charAt(i);
//	if(!set.contains(c)) {
//		set.add(c);
//		sf.append(c);
//	}
//}
//System.out.println(set);
//System.out.println(sf);