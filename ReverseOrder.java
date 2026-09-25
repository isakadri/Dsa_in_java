package arrays;

public class ReverseOrder {
	public static void main(String[] args) {
		String str="java is easy";
		String []arr= str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
