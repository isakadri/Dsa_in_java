class Solution {
    public static int lengthOfLastWord(String s) {
        
        int track=0;
        int left=s.length()-1;
        while(left>=0 && s.charAt(left)==' '){
            left--;
        }
       
        while(left>=0 && s.charAt(left)!=' '){
             left--;
             track++;
        }
        return track;
    }
    public static void main (String[] args){
        String s="hello world";
        System.out.println(lengthOfLastWord(s));
    }
}