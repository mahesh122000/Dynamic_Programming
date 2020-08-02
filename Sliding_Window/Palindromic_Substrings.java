class Solution {
    public int countSubstrings(String s) {
        int count=0;
        int n=s.length();
        int l=0,h=0;
        for(int i=0;i<n;i++)
        {
            l=i;
            h=i+1;
            while(l>=0 && h<n && s.charAt(l)==s.charAt(h))
            {
                count++;
                l--;
                h++;
            }
            l=i;
            h=i;
            while(l>=0 && h<n && s.charAt(l)==s.charAt(h))
            {
                count++;
                l--;
                h++;
            }
        }
        return count;
    }
}