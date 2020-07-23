class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int a[]=new int[n+1];
        if(n==0)
            return 1;
        a[1]=10;
        if(n>=2)
            a[2]=9*9;
        for(int i=3;i<=n;i++)
        {
            a[i]=a[i-1]*(9-i+2);
        }
        int sum=0;
        for(int i=1;i<=n;i++)
            sum+=a[i];
        return sum;
    }
}
/*
Let f(k) = count of numbers with unique digits with length equals k.
f(1) = 10, ..., f(k) = 9 * 9 * 8 * ... (9 - k + 2) [The first factor is 9 because a number cannot start with 0].
*/