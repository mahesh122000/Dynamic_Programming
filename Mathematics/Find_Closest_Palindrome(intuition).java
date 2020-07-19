class Solution {
    int find(long a)
    {
        char c[]=(""+a).toCharArray();
        int n=c.length;
        int v=0;
        int l=0,r=0;
        if(n%2==1)
        {
            l=r=n/2;
        }
        else
        {
            l=n/2-1;
            r=n/2;
        }
        while(l>=0 && r<n && c[l]==c[r])
        {
            v++;
            l--;
            r++;
        }
        return v;
    }
    public String nearestPalindromic(String n) {
        long val=Long.parseLong(n);
        long large=val;
        long small=val;
        long temp=val;
        int unit=1;
        int k=find(val);
        for(int i=1;i<n.length()/2-k;i++)
            unit*=10;
        while(large<=val)
        {
            large=findPalindrome(temp+=unit);
        }
        temp=val;
        while(small>=val)
        {
            small=findPalindrome(temp-=unit);
        }
        return large-val<val-small?""+large:""+small;
    }
    long findPalindrome(long n)
    {
        char c[]=(""+n).toCharArray();
        int l=0,r=c.length-1;
        while(l<r)
        {
            c[r--]=c[l++];
        }
        return Long.parseLong(new String(c));
    }
}