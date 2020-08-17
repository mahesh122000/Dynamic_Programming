class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=(int)(s1.charAt(i));
        for(int i=0;i<m;i++)
            sum+=(int)(s2.charAt(i));
        int a[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    a[i][j]=a[i-1][j-1]+(int)(s1.charAt(i-1));
                else
                    a[i][j]=Math.max(a[i-1][j],a[i][j-1]);
            }
        }
        return sum-a[n][m]*2;
    }
}