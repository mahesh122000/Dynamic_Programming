 public int numDecodings(String st) {
        int n=st.length();
        long a[]=new long[n+1];
        a[0]=1;
        for(int i=1;i<=n;i++)
        {
            char f=st.charAt(i-1);
            if(f=='*')
                a[i]+=a[i-1]*9;
            if(f>='1' && f<='9')
                a[i]+=a[i-1];
            if(i>=2)
            {
                char s=st.charAt(i-2);
                if(s=='*')
                {
                     if(f=='*')
                         a[i]+=a[i-2]*15;
                     if(f>='0' && f<='6')
                         a[i]+=a[i-2]*2;
                     if(f>='7' && f<='9')
                          a[i]+=a[i-2]*1;
                }
                else if(s=='1')
                {
                    if(f=='*')
                        a[i]+=a[i-2]*9;
                    if(f>='0' && f<='9')
                        a[i]+=a[i-2];
                }
                else if(s=='2')
                {
                    if(f=='*')
                        a[i]+=a[i-2]*6;
                    if(f>='0' && f<='6')
                        a[i]+=a[i-2];
                }
            }
            a[i]%=1000000007;
        }
    return (int)a[n]%1000000007;
    }