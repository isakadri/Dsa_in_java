class Solution {

    static int [][] dp;
    int helper(String s1,String s2,int i,int j){
        if(i<0 || j<0) return 0;

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s1.charAt(i)==s2.charAt(j)) {
            return dp[i][j]=1+helper(s1,s2,i-1,j-1);
        }

        return dp[i][j]=Math.max(helper(s1,s2,i-1,j),helper(s1,s2,i,j-1));
    }


    public int longestCommonSubsequence(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();

       dp=new int[n1][n2];
       for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
       return helper(s1,s2,n1-1,n2-1);
    }
}