class Solution {
    public int findNumberOfLIS(int[] a) {
        int n=a.length;
        int b[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            b[i][0]=1;
            b[i][1]=1;
        }
        int max=1;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i]>a[j])
                {
                    if(b[j][0]+1>b[i][0])
                    {
                        b[i][0]=b[j][0]+1;
                        b[i][1]=b[j][1];
                    }
                    else if(b[j][0]+1==b[i][0])
                    {
                        b[i][1]+=b[j][1];
                    }
                }
            }
            max=Math.max(max,b[i][0]);
            
        }
       //System.out.println(b[4][0]);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(max==b[i][0])
                count+=b[i][1];
        }
        return count;
    }
}