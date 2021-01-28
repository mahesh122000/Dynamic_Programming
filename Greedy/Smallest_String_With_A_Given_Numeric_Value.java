class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder ans=new StringBuilder();
        char a[]=new char[n];
        for(int i=0;i<n;i++)
            a[i]='a';
        k-=n;
        for(int i=n-1;i>=0 && k>0;i--)
        {
            if(k-25>=0)
            {
                k-=25;
                a[i]=(char)(a[i]+25);
            }
            else
            {
                a[i]=(char)(a[i]+k);
                k=0;
                break;
            }
        }
        for(char c:a)
            ans.append(c+"");
        return ans.toString();
    }
}