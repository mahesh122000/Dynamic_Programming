//a,b,c belong to condition where A isn't present
//there are 3 subsections like a,b,c because they represent ending with ll, l and other.


class Solution {
    static long mod=1000000007;
    public int checkRecord(int n) {
        long a=0,b=1,c=1,d=0,e=0,f=1;
        for(int i=0;i<n;i++)
        {
            long t1=b;
            long t2=c;
            long t3=(a+b+c)%mod;
            long t4=e;
            long t5=f;
            long t6=(a+b+c+d+e+f)%mod;
            a=t1;
            b=t2;
            c=t3;
            d=t4;
            e=t5;
            f=t6;
        }
        return (int)(f%mod);
    }
}