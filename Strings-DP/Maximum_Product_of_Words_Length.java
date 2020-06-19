class Solution {
    public int maxProduct(String[] words) {
        int n=words.length;
        if(n==0)
            return 0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=convert(words[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((a[i]&a[j])==0)
                    ans=Math.max(ans,words[i].length()*words[j].length());
            }
        }
        return ans;
    }
    public int convert(String s)
    {
        int val=0;
        for(int i=0;i<s.length();i++)
            val|=1<<(s.charAt(i)-'a');
        return val;
    }
}


