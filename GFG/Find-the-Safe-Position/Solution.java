class Solution {
    static int safePos(int n, int k) {
              // code here
            if(n==1){
    
                return 1;
            }
            int a = safePos(n-1, k);
    
            return (a+k-1) % n+1;
        }
    };