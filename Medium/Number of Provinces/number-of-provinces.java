//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int count = 0;
        boolean[] visited = new boolean[V+1];
        for(int i=1;i<=V;i++)
        {
            if(visited[i]==false)
            {
                count++;
                DFS(adj,visited,i);
            }
        }
        return count;
    }
    public static void DFS(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int current)
    {
        visited[current] = true;
        for(int i=0;i<adj.get(current-1).size();i++)
        {
            int edge = adj.get(current-1).get(i);// edge = 1 or 0
            //  if edge exists then go check for dfs and not then do nothing
            if(edge==1)
            {
                if(visited[i+1]==false)
                {
                    DFS(adj,visited,i+1);
                }
            }
        }
    }
};