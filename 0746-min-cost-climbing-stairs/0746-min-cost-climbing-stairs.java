class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        // int dp[]=new int[n+1];

        // dp[0]=0;
        // dp[1]=0;

        int previus1=0;
        int previus2=0;
        int result=previus2;

        for(int i=2;i<n+1;i++){
            result=Math.min(previus1+cost[i-1],previus2+cost[i-2]);
            previus2 = previus1;
            previus1 = result;
        }

        return result;


    }
}