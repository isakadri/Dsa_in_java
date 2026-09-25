package arrays;

public class RemoveAllDuplicates {
		public static void main(String[] args) {
			int arr[]= {1,2,3,4,4,5,6,6,1,2};
			
			
			boolean visited[]=new boolean[arr.length];
			
			for(int i=0;i<arr.length;i++) {
				boolean duplicate=false;
				
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						
						duplicate=true;
						break;
					}
					
					
				}
				if(!duplicate) {
					System.out.print(arr[i]+" ");
				}
				
				
				
			}
				
				
				
				
			}
		}

