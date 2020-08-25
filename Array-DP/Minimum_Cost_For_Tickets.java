class Solution {
    int dp[];
    public int mincostTickets(int[] days, int[] costs) {
        int n=days.length;
        dp=new int[n+1];
        int min=days[0];
        int max=days[n-1];
        int ans=costs[0]+find(days,1,n,costs);
        int val=min+7;
        int i=0;
        while(i<n && days[i]<val)
            i++;
        ans=Math.min(ans,costs[1]+find(days,i,n,costs));
        val=min+30;
        i=0;
        while(i<n && days[i]<val)
            i++;
        ans=Math.min(ans,costs[2]+find(days,i,n,costs));
        return ans;
    }
    int find(int days[],int i,int n,int costs[])
    {
        if(i>=n)
            return 0;
        if(dp[i]!=0)
            return dp[i];
        int min=days[i];
        int max=days[n-1];
        int ans=costs[0]+find(days,i+1,n,costs);
        int val=min+7;
        int j=i;
        while(j<n && days[j]<val)
            j++;
        ans=Math.min(ans,costs[1]+find(days,j,n,costs));
        val=min+30;
        j=0;
        while(j<n && days[j]<val)
            j++;
        ans=Math.min(ans,costs[2]+find(days,j,n,costs));
        dp[i]=ans;
        return ans;
    }
}