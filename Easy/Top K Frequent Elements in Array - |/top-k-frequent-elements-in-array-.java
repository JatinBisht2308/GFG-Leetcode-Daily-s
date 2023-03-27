//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        int[] ans = new int[k];
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(result.containsKey(nums[i]))
            {
                result.put(nums[i],result.get(nums[i])+1);
            }
            else{
                result.put(nums[i],1);
            }
        }
        // System.out.println(result);
         ArrayList< Map.Entry<Integer, Integer>> list = new ArrayList<>(result.entrySet());
        list.sort((a,b) -> Objects.equals(a.getValue(), b.getValue())? b.getKey()-a.getKey():b.getValue()-a.getValue());
        for(int i=0;i<k;i++)
        {
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}