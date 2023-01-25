//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String s = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.minOperation(s);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minOperation(String s) {
        // code here
          int i = s.length()/2-1;

        int j = 2*i+1;

        int len = 0;

        while(i>=0){

            if(s.charAt(i)!=s.charAt(j)){

                i--;

                j -= 2;

            }

            else{

                int temp1=i;

                int temp2=j;

                while(i>=0 && s.charAt(i)==s.charAt(j)){

                    i--;j--;

                }

                if(i<0){

                    len = j+1;

                    break;

                }

                else{

                    i=temp1-1;

                    j=temp2-2;

                }

            }

        }

        return Math.min(s.length(),s.length()-len+1);
    }
}