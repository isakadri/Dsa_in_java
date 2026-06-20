// find unique elements in array
class Hashset_problem{
  public static void main(String [] args){
    int arr[]={1,2,3,4,5,6};
    HashSet<Integer>set=new HashSet();
    for(int e :arr){set.add(e);}
    System.out.println(set.size());
    
  }
