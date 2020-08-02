class Solution {
    public int minSteps(int n) {
        int a[]=new int[n+1];
        if(n==0||n==1)
            return 0;
        a[0]=a[1]=0;
        a[2]=2;
        for(int i=3;i<=n;i++)
        {
            a[i]=i;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                    a[i]=Math.min(a[i],a[j]+i/j);
            }
        }
        return a[n];
    }
}