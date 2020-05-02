 public long maximumSum(int a[], int n)
    {
      long b[]=new long[n];
      if(n>=1)
      b[0]=(long)a[0];
      if(n>=2)
      b[1]=(long)Math.max(a[0],a[1]);
      long max=Integer.MIN_VALUE;
      for(int i=2;i<n;i++)
      {
       if(b[i-2]>=0)
       b[i]=Math.max(b[i-1],b[i-2]+a[i]);
       else
       b[i]=Math.max(b[i-1],a[i]);
       max=Math.max(max,b[i]);
      }
      return max;
    }