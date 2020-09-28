class Solution {
    public int maxChunksToSorted(int[] arr) {
        return sort(arr,0,arr.length-1);
    }
    int sort(int a[],int l,int r)
    {
        if(l>r)
            return 0;
        if(l==r)
            return 1;
        if(a[l]==l)
            return 1+sort(a,l+1,r);
        int max=l;
        int ind=-1;
        for(int i=l;i<=r;i++)
        {
            if(a[i]==l)
            {
                ind=i;
                break;
            }
            max=Math.max(max,a[i]);
        }
        if(max==ind)
            return 1+sort(a,ind+1,r);
        for(int i=ind+1;i<=max;i++)
            max=Math.max(max,a[i]);
        return 1+sort(a,max+1,r);
    }
}