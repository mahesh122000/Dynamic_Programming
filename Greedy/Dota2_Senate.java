class Solution {
    public String predictPartyVictory(String s) {
        int n=s.length();
        char c[]=s.toCharArray();
        int count=0;
        char cur=c[0];
        while(true)
        {
            for(int i=0;i<n;i++)
            {
                if(c[i]=='0')
                    continue;
                if(c[i]==cur)
                {
                    count++;
                }
                else
                {
                    count--;
                    if(count<0)
                    {
                        count=1;
                        cur=c[i];
                    }
                    else
                    {
                        c[i]='0';
                    }
                }
            }
            int r=0,d=0;
            for(int i=0;i<n;i++)
            {
                if(c[i]=='R')
                    r++;
                else if(c[i]=='D')
                    d++;
            }
            if(r==0)
                return "Dire";
            else if(d==0)
                return "Radiant";
        }
    }
}




