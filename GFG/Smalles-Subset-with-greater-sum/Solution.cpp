class Solution{
    public:
    int minSubset(vector<int> &Arr,int N){

        int n=N;

        long long sum=0;

        for(int i=0;i<n;i++){

            sum+=Arr[i];

        }

        sort(Arr.begin(),Arr.end());

        int cnt=0;

        long long temp=0;

        for(int i=n-1;i>=0;i--){

            temp+=Arr[i];cnt++;

        

        if(temp>sum-temp){

            return cnt;

        }}

    }
};