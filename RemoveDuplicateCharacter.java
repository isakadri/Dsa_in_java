package arrays;

public class RemoveDuplicateCharacter {
		public static void main(String[] args) {
			String dup="";
			String str="programming";
			for(int i=0;i<str.length();i++) {
				boolean duplicate=false;
				for(int j=i+1;j<str.length();j++) {
					if(str.charAt(i)==str.charAt(j)) {
						duplicate=true;
					}
					
				}
				
				if(!duplicate) {
					System.out.print(str.charAt(i)+"");
				}else {
					dup+=str.charAt(i);
				}
				
				
				
				
				
			}
			System.out.println();
			System.out.println(dup);
		}
}
