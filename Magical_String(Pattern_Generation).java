class Solution {
    public int magicalString(int n) {
        int a[]=new int[n+2];
        int f=1;
        int s=1;
        int val=1;
        while(f<=n)
        {
            a[f++]=val;
            if(a[s++]==2)
                a[f++]=val;
            val=3-val;
        }
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            if(a[i]==1)
                ans++;
        }
        return ans;
    }
}