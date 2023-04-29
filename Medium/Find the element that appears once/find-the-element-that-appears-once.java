//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int nums[], int N)
    {
        // your code here
        Map<Integer,Integer> single = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int value = single.getOrDefault(nums[i],0);
            single.put(nums[i],value + 1);
        }

        for(Map.Entry<Integer,Integer> it: single.entrySet())
        {
            if(it.getValue()==1)
            {
                return it.getKey();
            }
        }
        return -1;
    }
}