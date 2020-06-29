class Solution {
    public int nthSuperUglyNumber(int n, int[] p) {
        int count=0;
        int m=p.length;
        if(m==0||n==0)
            return 0;
        int a[]=new int[n];
        int b[]=new int[m];
        a[0]=1;
        for(int i=1;i<n;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<m;j++)
            {
                if(a[b[j]]*p[j]<min)
                {
                    min=a[b[j]]*p[j];
                }
            }
            a[i]=min;
            for(int j=0;j<m;j++)
            {
                if(a[b[j]]*p[j]==min)
                    b[j]++;
            }
        }
        return a[n-1];
    }
}


