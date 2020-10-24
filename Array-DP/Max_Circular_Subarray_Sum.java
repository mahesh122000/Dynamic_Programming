static int kadane(int a[],int n)
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i:a)
        {
            sum+=i;
            max=Math.max(max,sum);
            if(sum<0)
            sum=0;
        }
        return max;
    }
    static int reverseKadane(int a[],int n)
    {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        int b[]=new int[n];
        b[n-1]=a[n-1];
        int c[]=new int[n];
        for(int i=n-2;i>=0;i--)
        {
            b[i]=b[i+1]+a[i];
        }
        c[0]=a[0];
        for(int i=1;i<n;i++)
        {
            c[i]=c[i-1]+a[i];
        }
        for(int i=1,j=0;i<n;i++,j++)
        {
            sum=Math.max(sum,c[j]);
            ans=Math.max(ans,sum+b[i]);
        }
        return ans;
    }
    static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        return Integer.max(kadane(a,n), reverseKadane(a,n));
    }