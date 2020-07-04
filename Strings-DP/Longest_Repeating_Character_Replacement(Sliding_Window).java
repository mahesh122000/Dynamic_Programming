class Solution {
    public int characterReplacement(String s, int k) {
        int start=0;
        int ans=0;
        int count=0;
        int a[]=new int[26];
        for(int end=0;end<s.length();end++)
        {
            char c=s.charAt(end);
            a[c-'A']++;
            count=Math.max(count,a[c-'A']);
            if(end-start-count+1>k)
            {
                char d=s.charAt(start);
                a[d-'A']--;
                start++;
            }
            ans=Math.max(ans,end-start+1);
        }
        return ans;
    }
}