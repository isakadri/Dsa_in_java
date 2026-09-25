package arrays;

public class FindDupluicate {
	public static void main(String[] args) {
		int arr[]= {1,7,2,3,4,5,2,6,7};
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			if(count>1) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
