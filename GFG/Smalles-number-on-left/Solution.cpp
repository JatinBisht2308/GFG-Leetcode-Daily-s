class Solution{
public:
    vector<int> leftSmaller(int n, int a[]){
        // code here
        vector<int>ans(n,-1);

        for(int i=1;i<n;i++){

            for(int j=i-1;j>=0;j--){

                if(a[j]<a[i]){

                    ans[i]=a[j];

                    break;

                }

            }

        }

        return ans;
    }
};