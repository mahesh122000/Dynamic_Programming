class Solution {
    public boolean isAdditiveNumber(String num) {
        int n=num.length();
        for(int i=1;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                String a=num.substring(0,i);
                String b=num.substring(i,j);
                String c=num.substring(j,n);
                if(check(a,b,c))
                    return true;
            }
        }
        return false;
    }
    public boolean check(String a,String b,String c)
    {
        if((a.length()>1 && a.charAt(0)=='0')||(b.length()>1 && b.charAt(0)=='0'))
            return false;
        if(c.length()==0)
            return true;
        String d=sum(a,b);
        return c.startsWith(d) && check(b,d,c.substring(d.length()));
    }
    public String sum(String a,String b)
    {
        StringBuilder sb=new StringBuilder();
        int ad=0;
        for(int i=0;i<Math.max(a.length(),b.length());i++)
        {
            int ia=a.length()-i-1;
            int ib=b.length()-i-1;
            int va=0,vb=0;
            if(ia>=0)
                va=a.charAt(ia)-'0';
            if(ib>=0)
                vb=b.charAt(ib)-'0';
            int vc=va+vb+ad;
            sb.append(vc%10);
            ad=vc/10;
        }
        if(ad>0)
            sb.append(ad);
        return sb.reverse().toString();
    }
}

