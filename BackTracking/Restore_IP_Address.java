class Solution {
    static List<String>l;
    public List<String> restoreIpAddresses(String s) {
        l=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<Math.min(n,3);i++)
        {
            if(poss(s.substring(0,i+1)))
            {
                String c=s.substring(0,i+1)+'.'+s.substring(i+1,n);
                find(c,i+2,1);
            }
        }
        return l;
    }
    public boolean poss(String s)
    {
        if(s.length()>3|s.length()==0)
            return false;
        if(s.charAt(0)=='0' && s.length()>1)
            return false;
        int v=Integer.parseInt(s);
        if(v<=255)
            return true;
        return false;
    }
    public void find(String s,int i,int k)
    {
        if(i==s.length()|k>=4)
            return;
        int n=s.length();
        for(int j=i;j<Math.min(n,i+3);j++)
        {
            if(poss(s.substring(i,j+1)))
            {
                String c=s.substring(0,j+1)+'.'+s.substring(j+1,n);
                if(k==2 && poss(s.substring(j+1,n)))
                    l.add(c);
                else if(k==1)
                    find(c,j+2,2);
            }
        }
    }
}