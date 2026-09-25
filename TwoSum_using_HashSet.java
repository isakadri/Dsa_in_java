import java.util.*;
class TwoSum_using_HashSet{
  void find(int t,int ar[],HashSet<Integer> set){
    for(int e :ar){
      int remaining=t-e;
      if(set.contains(remaining)){
        System.out.println(e+" "+remaining);
      }
      set.add(e);
    }
  }
  public static void main (String []args){

        int arr[]={1,2,3,4,5,6,7,13};
        Set<Integer> set=new HashSet<>();
        TwoSum_using_HashSet s1=new TwoSum_using_HashSet();
        s1.find(14,arr,set);
        
  }
}
