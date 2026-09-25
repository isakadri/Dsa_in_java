package explore;

import java.util.ArrayList;
import java.util.Arrays;

public class ListOperation {
		public static void main(String[] args) {
			ArrayList<String>list=new ArrayList<>(Arrays.asList("isa","kadri","banana","jpmorgan",
					"TCS","Infosys","Google","Microsoft","CodeSoft","Mastercard","Creatz","infoTech","MySql",
					"IBM","Oracle","Joho","Meta","BMW"));
			for (String string : list) {
				string=string.toUpperCase();
				System.out.print(string+",");
			}
		}
}
