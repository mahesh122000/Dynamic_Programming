class Solution {
    int dp[][];
    public int findRotateSteps(String ring, String key) {
        dp=new int[201][201];
        return find(ring,key,0,0);
    }
    int find(String r,String k,int r_i,int k_i)
    {
        if(k_i==k.length())
            return 0;
        int clv=Integer.MAX_VALUE,aclv=Integer.MAX_VALUE;
        if(dp[r_i][k_i]!=0)
            return dp[r_i][k_i];
        for(int j=0;j<r.length();j++)
        {
            int cur=(j+r_i)%r.length();
            if(r.charAt(cur)==k.charAt(k_i))
            {
                clv=j+find(r,k,cur,k_i+1);
                break;
            }
        }
        for(int j=0;j<r.length();j++)
        {
            int cur=r_i-j;
            if(cur<0)
                cur=r.length()+r_i-j;
            if(r.charAt(cur)==k.charAt(k_i))
            {
                aclv=j+find(r,k,cur,k_i+1);
                break;
            }
        }
        dp[r_i][k_i]=Math.min(clv,aclv)+1;
        return dp[r_i][k_i];
    }
}



