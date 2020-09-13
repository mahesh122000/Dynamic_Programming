long mod=1000000007;
    long countStrings(int n) {
        long a[]=new long[n];
        long b[]=new long[n];
        a[0]=b[0]=(long)(1);
        for(int i=1;i<n;i++)
        {
            a[i]=(a[i-1]+b[i-1])%mod;
            b[i]=a[i-1]%mod;
        }
        return (a[n-1]+b[n-1])%mod;
        
    }