//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution
{
    public:
    //Function to perform case-specific sorting of strings.
    string caseSort(string s, int n)

    {

        string s1,s2;

        for(int i=0;i<n;i++)

        {

            if(s[i]>='a' and s[i]<='z')

            s1+=s[i];

            else

            s2+=s[i];

        }

        

        sort(s1.begin(),s1.end());

        sort(s2.begin(),s2.end());

        int j=0;

        int k=0;

        for(int i=0;i<n;i++)

        {

            if(s[i]>='a' and s[i]<='z')

            {

                s[i]=s1[j++];

            }

            else

            s[i]=s2[k++];

        }

        

        return s;

    }
};

//{ Driver Code Starts.

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		string str;
		cin>>str;
		Solution obj;
		cout<<obj.caseSort (str, n)<<endl;
	}
}
// } Driver Code Ends