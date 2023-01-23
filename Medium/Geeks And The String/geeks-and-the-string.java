//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.removePair(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removePair(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty())stack.add(s.charAt(i));
            else{
                char ch = stack.pop();

                if (ch==s.charAt(i))continue;
                stack.add(ch);
                stack.add(s.charAt(i));

            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()) ans.insert(0, stack.pop());

        return ans.length()==0?"-1": ans.toString();
    }

}
        
