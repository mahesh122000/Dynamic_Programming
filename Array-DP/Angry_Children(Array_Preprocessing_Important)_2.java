static long angryChildren(int k, long[] a) {
        long ans=0;
        long cur=0;
        Arrays.sort(a);
        int n=a.length;
        long b[]=new long[n+1];
        b[0]=0;
        for(int i=0;i<n;i++)
        b[i+1]=b[i]+a[i];
        for(int i=0;i<k;i++)
        {
            cur+=i*a[i]-b[i];
        }
        ans=cur;
        for(int i=1;i<n-k+1;i++)
        {
            cur-=b[i+k-1]-b[i-1]-k*a[i-1];
            cur+=k*a[i+k-1]-b[i+k]+b[i];
            ans=Math.min(ans,cur);
        }
        return ans;
    }

//this problem has finding the difference of pairs formed from k array values could be //done in O(k) for first time and O(1) from then on.