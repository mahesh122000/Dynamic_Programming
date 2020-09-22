class Solution {
    List<String>l;
    public List<String> ambiguousCoordinates(String s) {
        s=s.substring(1,s.length()-1);
        int n=s.length();
        l=new ArrayList<>();
        for(int i=1;i<n;i++)
        {
            String c1=s.substring(0,i);
            String c2=s.substring(i);
            List<String>l1=find(c1);
            if(l1.size()==0)
                continue;
            List<String>l2=find(c2);
            if(l2.size()==0)
                continue;
            merge(l1,l2);
        }
        return l;
    }
    void merge(List<String>l1,List<String>l2)
    {
        String start="(";
        String end=")";
        String mid=", ";
        for(String s1:l1)
        {
            for(String s2:l2)
            {
                StringBuilder sb=new StringBuilder();
                sb.append(start);
                sb.append(s1);
                sb.append(mid);
                sb.append(s2);
                sb.append(end);
                l.add(sb.toString());
            }
        }
    }
    List<String> find(String s)
    {
        List<String>al=new ArrayList<>();
        boolean isZero=false;
        if(s.charAt(0)=='0')
        {
            isZero=true;
        }
        if(s.length()>1)
        {
            int j=s.length()-1;
            if(s.charAt(j)=='0')
                j=0;
            for(int i=1;i<=j;i++)
            {
                String c1=s.substring(0,i);
                String c2=s.substring(i,j+1);
                al.add(c1+"."+c2);
                if(isZero)
                    break;
            }
        }
        if(isZero==false || s.length()==1)
        al.add(s);
        return al;
    }
}

