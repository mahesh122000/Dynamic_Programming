class Solution {
    public int maxSubarraySumCircular(int[] a) {
        int n=a.length;
        if(n==0)
            return 0;
        int p=find(a);
        int min=Integer.MIN_VALUE;
        int q=0;
        boolean flag=true;
        for(int i=0;i<n;i++)
        {if(a[i]<0)
         min=Math.max(min,a[i]);
        else
        flag=false;
        q+=a[i];
        a[i]=-a[i];}
        q+=find(a);
        if(flag)
            return min;
        return Math.max(p,q);
    }
    public int find(int a[])
    {
        int val=0,sum=0;
        for(int i=0;i<a.length;i++)
        {sum+=a[i];
         if(sum<0)
             sum=0;
         val=Math.max(val,sum);
         }
        return val;
    }
}