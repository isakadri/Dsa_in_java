class Solution {

    public static boolean checkpalindrome(String  num){
        int left=0;
        int right=num.length()-1;
        while(left<right){
            if(num.charAt(left)!=num.charAt(right)){
                return false;

            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean isPalindrome(int x) {
      if(x<0){
        return false;
      }  
     String num = Integer.toString(x);
      return checkpalindrome(num);
    }

    public static void main(String [] args ){
        int x=121;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
}