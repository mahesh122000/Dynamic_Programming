class Solution {
    public int minOperations(int[] a, int x) {
        int n=a.length;
        int l=0,r=n-1,ans=-1,sum=0;
        while(l<=r && sum<x)
        {
            sum+=a[l++];
        }
        while(l>=0)
        {
            if(sum==x)
            {
                int k=l+n-r-1;
                if(ans==-1||ans>k)
                    ans=k;
            }
            if(sum>=x)
            {
                if(l==0)
                    break;
                sum-=a[--l];
            }
            else
            {
                if(l>=r)
                    break;
                sum+=a[r--];
            }
        }
        return ans;
    }
}

