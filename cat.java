public class Cat{
	
	public static void main(String args[]){
			
		int arr[]={1, -2, 3, -4, 5, -6, 0};
		
		for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){

		if(arr[i]>=0 && arr[j] <0){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		
		}
		}


		for(int i:arr){System.out.print(i+" ");}
	}

}