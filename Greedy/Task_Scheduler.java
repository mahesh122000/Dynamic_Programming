class Solution {
    public int leastInterval(char[] t, int n) {
        int l=t.length;
        int a[]=new int[26];
        for(int i=0;i<l;i++)
        {
            a[t[i]-'A']++;
        }
        Arrays.sort(a);
        int max=a[25]-1;
        int ans=max*n;
        for(int i=24;i>=0;i--)
            ans-=Math.min(max,a[i]);
        return ans>0?ans+l:l;
    }
}