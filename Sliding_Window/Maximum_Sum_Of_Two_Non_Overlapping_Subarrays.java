class Solution {
    public int maxSumTwoNoOverlap(int[] a, int l, int m) {
        int n=a.length;
        int b[]=new int[n+1];
        b[0]=0;
        b[1]=a[0];
        for(int i=1;i<n;i++)
            b[i+1]=a[i]+b[i];
        int max=0;
        for(int i=l;i<=n-m;i++)
        {
            int sum=b[i]-b[i-l];
            for(int j=i+m;j<=n;j++)
            {
                max=Math.max(max,sum+b[j]-b[j-m]);
            }
        }
        for(int i=m;i<=n-l;i++)
        {
            int sum=b[i]-b[i-m];
            for(int j=i+l;j<=n;j++)
            {
                max=Math.max(max,sum+b[j]-b[j-l]);
            }
        }
        return max;
    }
}