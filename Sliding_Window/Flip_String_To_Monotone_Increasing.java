class Solution {
    public int minFlipsMonoIncr(String s) {
        int n=s.length();
        int start=0,count1=0,count2=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='0')
                count2++;
        }
        int ans=count1+count2;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='0')
                count2--;
            else
                count1++;
            ans=Math.min(ans,count1+count2);
        }
        return ans;
    }
}