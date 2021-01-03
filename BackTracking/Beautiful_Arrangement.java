class Solution {
    public int countArrangement(int n) {
        int a[]=new int[n+1];
        return find(n,a,1);
    }
    public int find(int n,int a[],int i)
    {
        if(i-1==n)
            return 1;
        int ans=0;
        for(int j=1;j<=n;j++)
        {
            if(a[j]==0)
            {
                if(j%i==0 || i%j==0)
                {
                    a[j]=1;
                    ans+=find(n,a,i+1);
                    a[j]=0;
                }
            }
        }
        return ans;
    }
}