class Solution {
    public int nthUglyNumber(int n) {
        Integer a[]=new Integer[n];
        if(n==0)
            return 0;
        a[0]=1;
        int i=1;
        int i2=0,i3=0,i5=0;
        while(i<n)
        {Integer min=Math.min(a[i2]*2,Math.min(a[i3]*3,a[i5]*5));
        a[i]=min;
        i++;
        if(min==a[i2]*2)i2++;
        if(min==a[i3]*3)i3++;
        if(min==a[i5]*5)i5++;
        }
        return a[n-1];
    }
}