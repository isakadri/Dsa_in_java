package explore;

import java.util.ArrayList;

public class Seperation {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("isa@gmail.com");
		list.add("suraj@gmail.com");
		list.add("ramesh@gmail.com");
		
		int count=0;
		for(int i=0;i<list.size();i++) {
			String name="";
			String specialSym="";
			String domain="";
			
			
			String str=list.get(i);
			for(int j=0;j<str.length();j++) {
				
				if(str.charAt(j)=='@') {
					
					specialSym+=str.charAt(j);
					count++;
					
				}else if(count==0) {
					
					name+=str.charAt(j);
				}else {
					
					domain+=str.charAt(j);
				}
			}
			count=0;
			System.out.println("name : "+ name +"\nSymbol : "+specialSym+"\nDomain : "+domain);
			System.out.println();
		}
		
		
	}

}
