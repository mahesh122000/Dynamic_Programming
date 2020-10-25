class Solution {
    public boolean winnerSquareGame(int n) {
        if(n==1)
            return true;
        boolean a[]=new boolean[n+1];
        for(int i=0;i<=n;i++)
        {
            for(int k=1;k*k<=i;k++)
            {
                if(a[i-k*k]==false)
                {
                    a[i]=true;
                    break;
                }
            }
        }
        return a[n];
    }
}