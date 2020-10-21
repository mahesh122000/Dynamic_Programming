class Solution {
    public int maxWidthRamp(int[] a) {
        int max=0;
        for(int i:a)
        {
            max=Math.max(max,i);
        }
        int b[]=new int[max+1];
        Arrays.fill(b,-1);
        for(int i=0;i<a.length;i++)
        {
            b[a[i]]=i;
        }
        for(int i=max-1;i>=0;i--)
        {
            b[i]=Math.max(b[i],b[i+1]);
        }
        int ans=0;
        for(int i=0;i<a.length;i++)
        {
            ans=Math.max(ans,b[a[i]]-i);
        }
        return ans;
    }
}