package arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="listen";
		String s2="silents";
		
		if(s1.length()!=s2.length()) {
			System.out.println("not anagram");
			return;
		}
		
		int count[]=new int [26];
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)-'a']++;
			count[s2.charAt(i)-'a']--;
			
		}
		boolean anagram=true;
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				anagram=false;
			}
		}
		
		if(anagram) {
			System.out.println("anagram");
		
		}else {
			System.out.println("not anagram");
		}
	}
}
