class Solution {
    String ans;
    public String strWithout3a3b(int n, int m) {
        if(n<m)
        {
            String c=fill(m,n);
            StringBuilder s=new StringBuilder();
            for(char d:c.toCharArray())
            {
                s.append(d=='a'?"b":"a");
            }
            return s.toString();
        }
        return fill(n,m);
    }
    String fill(int n,int m)
    {
        StringBuilder s=new StringBuilder();
        int k=Math.min(m,n-m);
        for(int i=0;i<k;i++)
            s.append("aab");
        n-=2*k;
        m-=k;
        if(m<=0 && n>0)
        {
            if(n==1)
                s.append("a");
            else
                s.append("aa");
        }
        else
        {
            for(int i=0;i<m;i++)
                s.append("ab");
        }
        return s.toString();
    }
}