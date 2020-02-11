 public String longestPalindrome(String s) {
        int n=s.length();
        if(n==0)
            return "";
        int max=1;
        int start=0,low=0,high=0;
        for(int i=1;i<n;i++)
        {
        low=i-1;
        high=i;
        while(low>=0 && high<n && s.charAt(low)==s.charAt(high))
        {if(max<high-low+1)
        {max=high-low+1;
        start=low;}
        low--;
        high++;}
        low=i-1;
        high=i+1;
        while(low>=0 && high<n && s.charAt(low)==s.charAt(high))
        {if(max<high-low+1)
        {max=high-low+1;
        start=low;}
        low--;
        high++;}    
        }
        return s.substring(start,start+max);
    }