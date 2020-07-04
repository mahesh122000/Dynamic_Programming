class Solution {
    public int findSubstringInWraproundString(String p) {
        int n=p.length();
        if(n==0)
            return 0;
        int a[]=new int[26];
        int ans=0;
        int len=0;
        for(int i=0;i<n;i++)
        {
            if((i>0) &&((p.charAt(i)-p.charAt(i-1)==1)||(p.charAt(i-1)=='z' && p.charAt(i)=='a')))
            {
                len++;
                a[p.charAt(i)-'a']=Math.max(len,a[p.charAt(i)-'a']);
            }
            else
            {
                len=1;
                a[p.charAt(i)-'a']=Math.max(len,a[p.charAt(i)-'a']);
            }
        }
        for(int i=0;i<26;i++)
        {
            ans+=a[i];
        }
        return ans;
    }
}