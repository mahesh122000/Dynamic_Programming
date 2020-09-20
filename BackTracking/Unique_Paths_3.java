 class Solution {
    static int ans;
    static HashSet<String>hs;
    static int n,m,count;
    static int row[]={0,1,0,-1};
    static int col[]={1,0,-1,0};
    public int uniquePathsIII(int[][] a) {
        n=a.length;
        if(n==0)
            return 0;
        m=a[0].length;
        if(m==0)
            return 0;
        ans=0;
        hs=new HashSet<>();
        int p=0,q=0,r=0,s=0;
        count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==0)
                    count++;
                if(a[i][j]==1)
                {
                    p=i;
                    q=j;
                }
                if(a[i][j]==2)
                {
                    r=i;
                    s=j;
                }
            }
        }
        for(int k=0;k<4;k++)
        {
            if(safe(p+row[k],q+col[k],a))
            {
                int i=p+row[k],j=q+col[k];
                hs.add(i+"&"+j);
                find(a,p+row[k],q+col[k],r,s);
                hs.remove(i+"&"+j);
            }
        }
        return ans;
    }
    boolean safe(int i,int j,int a[][])
    {
        if(i<0||j<0||i>=n||j>=m)
            return false;
        if(a[i][j]==-1||a[i][j]==1)
            return false;
        if(hs.contains(i+"&"+j))
            return false;
        return true;
    }
    void find(int a[][],int i,int j,int r,int s)
    {
        if(i==r && j==s)
        {
            if(hs.size()-1==count)
                ans++;
            //System.out.println(hs.size());
            return ;
        }
        for(int k=0;k<4;k++)
        {
            if(safe(i+row[k],j+col[k],a))
            {
                int p=i+row[k],q=j+col[k];
                hs.add(p+"&"+q);
                find(a,p,q,r,s);
                hs.remove(p+"&"+q);
            }
        }
    }
}