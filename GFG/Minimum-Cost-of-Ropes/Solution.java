class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
         PriorityQueue<Long> pq = new PriorityQueue<Long>();
         
         for(int i = 0 ; i < n ; i++){
             pq.add(arr[i]);
         }
         
         long sum  = 0;
         while(pq.size() > 1){
             long a = pq.poll();
             long b = pq.poll();
             sum += a + b;
             pq.add(a + b);
        }
         
        return sum;
    }
}
