class Solution {
    static int dp[][];
    static HashMap<Integer,Integer>hm;
    public boolean canCross(int[] stones) {
        int n=stones.length;
        int start=0;
        int k=0;
        hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(stones[i],i);
        }
        dp=new int[2000][n+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }  
        int j=hm.get(0);
        boolean ans=find(start+k,k,j,stones,n)|find(start+k+1,k+1,j,stones,n);
        return ans;
    }
    public boolean find(int val,int k,int j,int a[],int n)
    {
        if(j>=n||k<0)
            return false;
        if(!hm.containsKey(val))
            return false;
        int ind=hm.get(val);
        if(j>=ind)
            return false;
        if(ind==n-1)
            return true;
        if(dp[k][j]!=-1)
            return dp[k][j]==1;
        boolean ans=find(val+k,k,ind,a,n)|find(val+k+1,k+1,ind,a,n)|find(val+k-1,k-1,ind,a,n);
        if(ans)
            dp[k][j]=1;
        else
            dp[k][j]=0;  
        return ans;
    }
}