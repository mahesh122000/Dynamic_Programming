class Solution {
    public int longestOnes(int[] a, int k) {
        int max=0,count=0,len=0;
        int start=0;
        if(k==0)
        {
            for(int i:a)
            {
                if(i==1)
                    len++;
                else
                    len=0;
                max=Math.max(max,len);
            }
            return max;
        }
        for(int end=0;end<a.length;end++)
        {
            if(a[end]==1)
            {
                len++;
            }
            else
            {
                if(count<k)
                {
                    len++;
                    count++;
                }
                else
                {
                    while(start<end && a[start]==1)
                    {
                        start++;
                        len--;
                    }
                    if(start<end && a[start]==0)
                    {
                        len--;
                        start++;
                    }
                    len++;
                }
            }
            max=Math.max(max,len);
        }
        
        return max;
    }
}