class Solution{
    static long largestPrimeFactor(int n) {
        long val=-1;
        while(n%2==0)
        {
            val=2;
            n=n/2;
        }
        for(int i=3;i<=(int)Math.sqrt(n);i+=2)
        {
            while(n%i==0)
            {
                val=i;
                n=n/i;
            }
        }
        if(n>2)
        val=n;
        return val;
    }
}