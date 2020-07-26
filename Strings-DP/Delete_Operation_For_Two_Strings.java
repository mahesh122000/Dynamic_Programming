class Solution {
    public int minDistance(String w1, String w2) {
        int n=w1.length();
        int m=w2.length();
        int a[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0)
                    a[i][j]=j;
                else if(j==0)
                    a[i][j]=i;
                else
                {if(w1.charAt(i-1)==w2.charAt(j-1))
                    a[i][j]=a[i-1][j-1];
                else
                    a[i][j]=Math.min(a[i-1][j]+1,a[i][j-1]+1);
                }
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        return a[n][m];
    }
}