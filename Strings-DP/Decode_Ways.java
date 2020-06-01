public int numDecodings(String s) {
        int n=s.length();
        if(s.charAt(0)=='0')
            return 0;
        int a[]=new int[n+1];
        a[0]=1;
        a[1]=1;
        for(int i=2;i<=n;i++)
        {a[i]=0;
        if(s.charAt(i-1)>'0')
         a[i]=a[i-1];
        if((s.charAt(i-2)=='1')||(s.charAt(i-2)=='2' && s.charAt(i-1)<'7'))
         a[i]+=a[i-2];
        }
        return a[n];
    }