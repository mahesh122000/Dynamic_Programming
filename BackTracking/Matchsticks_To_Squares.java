class Solution {
    static boolean flag;
    public boolean makesquare(int[] nums) {
        long sum=0;
        flag=false;
        for(int i:nums)
            sum+=i;
        if(sum%4!=0|nums.length==0)
            return false;
        int n=nums.length;
        long v=sum/4;
        int b[]=new int[n];
        return find(nums,b,4,n,0,0,v);
    }
    public boolean find(int a[],int b[],int k,int n,int i,long cv,long v)
    {
        if(k==0)
            return true;
        if(cv==v)
        {
            return find(a,b,k-1,n,0,0,v);
        }
        if(k<0|i>=n)
            return false;
        for(int j=i;j<n;j++)
        {
        if(cv+a[j]<=v && b[j]==0)
        {cv=cv+a[j];
         b[j]=1;
         if(find(a,b,k,n,j+1,cv,v))
         return true;
        cv-=a[j];
        b[j]=0;}}
        return false;
    }
}