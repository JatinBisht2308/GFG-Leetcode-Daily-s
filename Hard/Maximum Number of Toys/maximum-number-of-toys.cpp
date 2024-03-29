//{ Driver Code Starts
//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution{
public:
  vector<int> maximumToys(int N,vector<int> A,int Q,vector<vector<int>> Queries){
      vector<pair<long long int,int>>P;
      for(int i=0;i<N;++i){
        P.push_back({A[i],i});   
      }
      sort(P.begin(),P.end());
      for(int i=1;i<N;++i){
          P[i].first = P[i].first + P[i-1].first;
      }
      vector<int>ans;
      
      for(int i=0;i<Queries.size();++i){
        long long int sum = Queries[i][0];
        int keys = Queries[i][1];
        unordered_map<int,int>um;
        long long int key_val = 0;
        int k_c = 0;
        for(int j=0;j<keys;++j){
         int ele = Queries[i][j+2];
         ele = ele - 1;
         if(ele<0){
             continue;
         }
         key_val = key_val + A[ele];
         ++um[ele];
         ++k_c;
        }
        
        if(sum>= P.back().first - key_val){
            ans.push_back(N-k_c);
            continue;
        }
        
        pair<long long int,int>a;
        a = {sum,100000000};
        int pos = upper_bound(P.begin(),P.end(),a) - P.begin();
        int pre = P[pos-1].second;
        
        
        int count = 0;
        for(auto it:um){
            int ele = it.first;
            if(A[ele]<A[pre]){
                sum = sum + A[ele];
                ++count;
            }
            if(A[ele]==A[pre]){
                if(ele<=pre){
                    sum = sum + A[ele];
                    ++count;
                }
            }
        }
        int done = 0;
        int j=0;
        for(j=pos;j<N;++j){
            int p_i = P[j].second;
             if(P[j].first>sum){
                ans.push_back(j-count);
                done = 1;
                break;
            }
            if(um.find(p_i)!= um.end()){
                ++count;
                sum = sum + A[p_i];
                continue;
            }
           
            
        }
        if(done == 1){
            continue;
        }
        ans.push_back(j);
        
      }
      return ans;
  }
};

//{ Driver Code Starts.
int main() {
 int t=1;
 cin>>t;
 for(int i=1;i<=t;i++){
    int N;
    cin>>N;
    vector<int>A(N);
    for(auto &i:A){
      cin>>i;
    }
    int Q;
    cin>>Q;
    vector<vector<int>> Queries(Q);
    for(int i=0;i<Q;i++){
      int x,y;
      cin>>x>>y;
      Queries[i].push_back(x);
      Queries[i].push_back(y);
      for(int j=0;j<Queries[i][1];j++){
        cin>>x;
        Queries[i].push_back(x);
      }
    }
    Solution obj;
    auto ans =obj.maximumToys(N,A,Q,Queries);
    for(auto i:ans)
      cout<<i<<" ";
    cout<<endl;
 }
}
// } Driver Code Ends