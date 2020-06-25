class Solution {
    ArrayList<Integer>al;
    int a[][][];
    public int countDigitOne(int n) {
        al=new ArrayList<>();
        if(n==0)
            return 0;
        a=new int[20][20][2];
        for(int i=0;i<20;i++)
        {
            for(int j=0;j<20;j++)
            {
                for(int k=0;k<2;k++)
                    a[i][j][k]=-1;
            }
        }
        return find(n);
    }
    public int find(int n)
    {
        while(n>0)
        {
            int r=n%10;
            al.add(0,r);
            n=n/10;
        }
        return solve(0,0,0);
    }
    public int solve(int pos,int cnt,int set)
    {
        if(pos==al.size())
            return cnt;
        if(a[pos][cnt][set]!=-1)
            return a[pos][cnt][set];
        int ans=0;
        int limit=9;
        if(set==0)
            limit=al.get(pos);
        for(int digit=0;digit<=limit;digit++)
        {
            int c_cnt=cnt;
            int c_set=set;
            if(digit==1)
                c_cnt++;
            if(digit<al.get(pos))
                c_set=1;
            ans+=solve(pos+1,c_cnt,c_set);
        }
        a[pos][cnt][set]=ans;
        return ans;
    }
}


