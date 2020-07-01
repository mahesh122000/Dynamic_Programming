class Solution {
    static int a[]; 
    public boolean canIWin(int m, int d) {
        if(d==0)
            return true;
        if((m*(m+1))/2<d)
            return false;
        int n=1<<m;
        a=new int[n+1];
        Arrays.fill(a,-1);
        return find(d,m,0,0);
    }
    public boolean find(int sum,int n,int mask,int val)
    {
        if(val>=sum)
            return false;
        if(a[mask]!=-1)
            return a[mask]==1;
        a[mask]=0;
        for(int i=0;i<n;i++)
        {
            if(((1<<i)&mask)>0)
            {}
            else
            {
                if(!find(sum,n,mask|(1<<i),val+i+1))
                {
                    a[mask]=1;
                    return true;
                }
            }
        }
        return a[mask]==1;
    }
    
}




