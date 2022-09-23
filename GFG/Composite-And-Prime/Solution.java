class Solution{

    public int Count(int L, int R){

        if(L==1)L++;

        boolean[] prime = new boolean[R+1];

        Arrays.fill(prime, true);

        prime[0] = prime[1] = false;

        for(int i=2; i<R+1; i++){

            if(prime[i]){

                for(int j=i+i; j<=R; j+=i){

                    prime[j] = false;

                }

            }

        }

        int cnt = 0;

        for(int i=L; i<=R; i++){

            if(prime[i]) cnt++;

        }

        return R-L+1 - 2*cnt;

    }

}