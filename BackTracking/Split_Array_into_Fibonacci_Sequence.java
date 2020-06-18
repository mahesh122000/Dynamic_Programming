class Solution {
    static List<Integer>al;
    public List<Integer> splitIntoFibonacci(String s) {
        al=new ArrayList<>();
        int n=s.length();
        for(int i=1;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                String a=s.substring(0,i);
                String b=s.substring(i,j);
                String c=s.substring(j,n);
                if(a.length()>10||b.length()>10)
                    break;
                if((Long.valueOf(a) > Integer.MAX_VALUE)||(Long.valueOf(b) > Integer.MAX_VALUE))
                    break;
                al.add(Integer.parseInt(a));
                al.add(Integer.parseInt(b));
                if(check(a,b,c))
                    return al;
                al.remove(al.size()-1);
                al.remove(al.size()-1);
            }
        }
        return al;
    }
    public boolean check(String a,String b,String c)
    {
        if((a.length()>1 && a.charAt(0)=='0')||(b.length()>1 && b.charAt(0)=='0'))
            return false;
        if(c.length()==0)
            return true;
        String d=sum(a,b);
        if(d.length()>10)
            return false;
        if(Long.valueOf(d) > Integer.MAX_VALUE)
            return false;
        if(c.startsWith(d))
        {
            al.add(Integer.parseInt(d));
            if(check(b,d,c.substring(d.length())))
                return true;
            al.remove(al.size()-1);
        }
        return false;
    }
    public String sum(String a,String b)
    {
        StringBuilder sb=new StringBuilder();
        int ad=0;
        for(int i=0;i<Math.max(a.length(),b.length());i++)
        {
            int ia=0,ib=0,va=0,vb=0;
            ia=a.length()-i-1;
            ib=b.length()-i-1;
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