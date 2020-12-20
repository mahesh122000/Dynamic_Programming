class Solution {
    public String decodeAtIndex(String s, int k) {
        int n=s.length();
        long l=0;
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(c>='0' && c<='9')
                l*=(c-'0');
            else
                l++;
        }
        for(int i=n-1;i>=0;i--)
        {
            k%=l;
            char c=s.charAt(i);
            if(k==0 && Character.isAlphabetic(c))
                return c+"";
            if(c>='0' && c<='9')
                l/=(c-'0');
            else
                l--;
        }
        return "";
    }
}