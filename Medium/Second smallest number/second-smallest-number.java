//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] inp=read.readLine().split(" ");
            int S=Integer.parseInt(inp[0]);
            int D=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.secondSmallest(S,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String secondSmallest(int S, int D){
        // code here
          if(S>D*9 || D==1) return "-1";
        
        int orig=D;
        
        int[] smallest=new int[D];
        S-=1;
        for(int i=D-1;i>=0 && S>=0;i--)
        {
            if(S>=9)
            {
                smallest[i]+=9;
                S-=9;
            }
            else
            {
                smallest[i]+=S;
                break;
            }
        }
        
        smallest[0]+=1;
        
        int index=orig-1;
        
        for(int i=orig-1;i>=0;i--)
        {
            if(smallest[i]!=9) break;
            else
            {
                index=i;
            }
        }
        
        if(index==0) return "-1";
        
        smallest[index]-=1;
        smallest[index-1]+=1;
        
        StringBuffer ans=new StringBuffer("");
        
        for(int i:smallest)
        {
            ans.append(i);
        }
        
            return ans.toString();
    
    }
}