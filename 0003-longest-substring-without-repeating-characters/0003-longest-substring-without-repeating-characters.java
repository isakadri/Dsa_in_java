class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLen=0;
        HashSet<Character>set=new HashSet<>();

        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
        

            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
          set.add(ch);
          maxLen = Math.max(maxLen, i - left + 1);

        }
        return maxLen;


        
    }

    public static void main(String[] args){
        String s="abcabcbb";
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(s));
    }
}
