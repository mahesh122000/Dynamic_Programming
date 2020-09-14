class Solution {
    long mod=1000000007;
    long a[][][];
    public int profitableSchemes(int G, int P, int[] group, int[] profit) {
        int n=group.length;
        a=new long[n+1][G+1][P+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=G;j++)
            {
                for(int k=0;k<=P;k++)
                    a[i][j][k]=-1;
            }
        }
        return (int)find(group,profit,0,G,P);
    }
    long find(int gr[],int pr[],int index,int g,int p)
    {
        if(index>=gr.length)
        {
            if(p==0)
                return 1;
            return 0;
        }
        if(a[index][g][p]!=-1)
            return a[index][g][p];
        long ans=0;
        int people=gr[index];
        int profit=pr[index];
        ans+=find(gr,pr,index+1,g,p);
        if(g>=people)
        {
            ans+=find(gr,pr,index+1,g-people,Math.max(0,p-profit));
        }
        ans=ans%mod;
        a[index][g][p]=ans;
        return ans;
    }
}