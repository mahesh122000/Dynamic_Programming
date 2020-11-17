class Solution {
    public int clumsy(int n) {
        int sum=0,val=n,ans=0;
        boolean flag=false;
        for(int i=n-1;i>=1;)
        {
            if(i>=1)
            {
                val*=i;
            }
            if(i-1>=1)
            {
                val=(int)Math.floor(val/(i-1));
            }
            ans+=val;
            if(i-2>=1)
            {
                sum+=i-2;
            }
            if(i-3>=1)
            {
                val=-(i-3);
                if(i-3==1)
                    flag=true;
            }
            i=i-4;
        }
        if(n==1)
            return 1;
        if(flag)
            return ans+sum+val;
        return ans+sum;
    }
}