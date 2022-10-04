class Solution
{
     private int mod=(int) 1e9 + 7;
    long numberOfPaths(int m, int n)
    {
        // code here
        long[][] dp=new long[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 && j==1) dp[i][j]=1;
                else{
                    dp[i][j]=(dp[i-1][j]%mod+dp[i][j-1]%mod)%mod;
                }
            }
        }
        return dp[m][n]%mod;
    }
}