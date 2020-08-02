static long mod=1000000007;
    // Complete the boardCutting function below.
    static long boardCutting(long[] y, long[] x) {
        int x_count=1,y_count=1;
        int i=x.length-1,j=y.length-1;
        long cost=0;
        Arrays.sort(x);
        Arrays.sort(y);
        while(i>=0 && j>=0)
        {
            if(x[i]>=y[j])
            {
                x_count++;
                cost+=x[i]*y_count;
                cost%=mod;
                i--;
            }
            else
            {
                y_count++;
                cost+=y[j]*x_count;
                cost%=mod;
                j--;
            }
        }
        while(i>=0)
        {
            cost+=x[i]*y_count;
            cost%=mod;
            i--;
        }
        while(j>=0)
        {
            cost+=y[j]*x_count;
            cost%=mod;
            j--;
        }
        return cost%mod;
    }
