class Solution {
    public int numSubarraysWithSum(int[] a, int k) {
        ArrayList<int[]>al=new ArrayList<>();
        ArrayList<Integer>bl=new ArrayList<>();
        int n=a.length;
        int count=0;
        if(n==0)
            return 0;
        if(n==1)
        {
            if(k==1 && a[0]==1)
                return 1;
            else if(k==1)
                return 0;
            if(k==0 && a[0]==0)
                return 1;
            return 0;
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
                count++;
            else
            {
                al.add(new int[]{i,count,0});
                bl.add(count);
                count=0;
            }
        }
        if(count!=0)
            bl.add(count);
        if(k==0)
        {
            int ans=0;
            for(Integer i:bl)
            {
                ans+=(i*(i+1))/2;
            }
            return ans;
        }
        int s=al.size();
        count=0;
        for(int i=n-1,j=s-1;i>=0;i--)
        {
            if(a[i]==0)
                count++;
            else
            {
                int x[]=al.get(j);
                x[2]=count;
                count=0;
                al.set(j,x);
                j--;
            }
        }
        if(s<k)
            return 0;
        int sum=0;
        for(int i=0;i<=s-k;i++)
        {
            int x[]=al.get(i);
            int y[]=al.get(i+k-1);
            sum+=(x[1]+1)*(y[2]+1);
        }
        return sum;
    }
}