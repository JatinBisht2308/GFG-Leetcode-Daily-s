class Solution
{
public:
    string ReFormatString(string S, int K)
    {

        string res{""};

        vector<char> v;

        int i = 0;

        int j = 0;

        for (auto &c : S)

        {

            if (c != '-')

                v.push_back(c);
        }

        int numChars = v.size();

        int rem = numChars % K;

        int grp = numChars / K;

        if (rem != 0)

        {

            for (i = 0; i < rem; i++)

            {

                res += v[i];
            }

            if (numChars > K)

                res += '-';
        }

        else

        {

            i = 0;
        }

        int cnt = 0;

        for (j = i; j < numChars; j++)

        {

            cnt++;

            if (cnt <= K)

            {

                res += v[j];
            }

            else if (cnt > K)

            {

                cnt = 0;

                if (numChars > K)

                    res += '-';

                j--;
            }
        }

        transform(res.begin(), res.end(), res.begin(), ::toupper);

        return res;
    }
};