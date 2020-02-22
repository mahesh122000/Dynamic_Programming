public int numberOfSubstrings(String s) {
        int n=s.length();
        int a[]=new int[256];
        a['a']=1;
        a['b']=1;
        a['c']=1;
        int left=0;
        int count=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {if(--a[s.charAt(i)]>=0)
         count++;
        while(count==3)
        {ans+=n-i;
        if(++a[s.charAt(left)]>0)
         count--;
        left++;}}
        return ans;
    }