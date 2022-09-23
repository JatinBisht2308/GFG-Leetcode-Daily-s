class Solution
{
    public:
    long long int numberOfSquares(long long int base)
    {
        //code here
        long long int c=0,sum=0;

        sum=base/2 -1;

        c=(sum*(sum+1))/2;

        return c;
    }
};