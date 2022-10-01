class Solution {
    public int numDecodings(String s) {
    
        Integer[] dp = new Integer[s.length() + 1];
        
        // Tabulation
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            
            int ch = s.charAt( i - 1) - '0';
            int num = 0;
            if( i >= 2) num = Integer.parseInt( s.substring(i - 2 , i ) );
            
            if(ch == 0) dp[i] = 0;
            else if( ch > 0 && ch <= 9 ) {
                dp[i] = dp[i - 1];
            }
            if( i >= 2 && num >= 10 && num <= 26 ) dp[i] = dp[i] + dp[i - 2];
        }
        return dp[dp.length - 1];
        
        // return decode( s, 0 , dp);
    }
    
    // Recursion and Memorization
    public int decode(String s, int idx, Integer[] dp){
        
        if(idx>=s.length()) return 1;
        
        if(dp[idx] !=null ) return dp[idx];
        
        int ch = s.charAt(idx) - '0';
        
        int ans = 0;
        
        if(ch == 0) return dp[idx] = ans;
         
        if( ch >= 0 && ch <= 9 ){
             ans+=decode( s, idx + 1 , dp);
        }
        
        if( idx + 2 <= s.length()  ){
            int num = Integer.parseInt( s.substring(idx, idx + 2) );
            if( num >= 10 && num <= 26 ){
                ans+=decode( s, idx + 2 , dp );
            }
        }
        return  ans;
    }
}