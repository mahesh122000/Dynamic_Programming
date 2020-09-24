class Solution {
    public int matrixScore(int[][] a) {
        int n=a.length;
        if(n==0)
            return 0;
        int m=a[0].length;
        if(m==0)
            return 0;
        for(int i=0;i<n;i++)
        {
            if(a[i][0]==0)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=a[i][j]^1;
                }
            }
        }
        for(int j=0;j<m;j++)
        {
            int count1=0,count2=0;
            for(int i=0;i<n;i++)
            {
                if(a[i][j]==0)
                    count1++;
                else
                    count2++;
            }
            if(count1>count2)
            {
                for(int i=0;i<n;i++)
                {
                    a[i][j]=a[i][j]^1;
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int val=0,mul=1;
            for(int j=m-1;j>=0;j--)
            {
                val+=a[i][j]*mul;
                mul<<=1;
            }
            ans+=val;
        }
        return ans;
    }
}