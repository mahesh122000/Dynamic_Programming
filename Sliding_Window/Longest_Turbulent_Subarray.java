class Solution {
    public int maxTurbulenceSize(int[] a) {
        int n=a.length;
        int start=0,max=1,f=0;
        for(int end=1;end<n;end++)
        {
            if(a[end]>a[end-1])
            {
                if(f==0||f==-1)
                {
                    f=1;
                    max=Math.max(max,end-start+1);
                }
                else
                {
                    start=end-1;
                }
            }
            else if(a[end]<a[end-1])
            {
                if(f==0||f==1)
                {
                    f=-1;
                    max=Math.max(max,end-start+1);
                }
                else
                {
                    start=end-1;
                }
            }
            else
            {
                f=0;
                start=end;
            }
        }
        return max;
    }
}
// f=-1 means pervious trend is decreasing
// f=1 means previous trend is increasing