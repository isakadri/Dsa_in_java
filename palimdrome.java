class palimdrome{
  public boolean check(String str){
    
    int low=0;
    int  high= str.length()-1;
    while(low<high){
      if(str.charAt(low)!=str.charAt(high)){
        return false;
      }
        
      
      low++;
      high--;
      
        
    }
    return true;
  }
  public static void main (String []args){
    String str="III";
    palimdrome p=new palimdrome();
    boolean result=p.check(str);
    if(result){ // result
      System.out.println("yes its a pamimdrome");
    }else{
      System.out.println("no not a palimdrome");
    }
  }
}
