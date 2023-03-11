//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
         int result = checkPalindrome(0,S);
         return result;
    }
    public int checkPalindrome(int i,String str)
    {
    // base condition
    if(i>= str.length()/2)
    {
        return 1;
    }
    if(str.charAt(i)!=str.charAt(str.length()-i-1))
    {
        return 0;
    }
    return checkPalindrome(i+1,str);
    }
};