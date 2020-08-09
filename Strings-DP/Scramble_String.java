class Solution {
    static HashMap<String,Boolean>hm;
    public boolean isScramble(String s1, String s2) {
        int n=s1.length();
        hm=new HashMap<>();
        if(n==0)
            return false;
        return find(s1,s2);
    }
    public boolean find(String a,String b)
    {
        if(a.equals(b))
            return true;
        if(a.length()<=1 || b.length()<=1)
            return false;
        String c=a+"$"+b;
        if(hm.containsKey(c))
            return hm.get(c);
        boolean flag=false;
        int n=b.length();
        for(int i=1;i<n;i++)
        {
            if((find(a.substring(0,i),b.substring(n-i,n)) && find(a.substring(i,n),b.substring(0,n-i)))||
              (find(a.substring(0,i),b.substring(0,i)) && find(a.substring(i,n),b.substring(i,n))))
            {
                flag=true;
                break;
            }
        }
        hm.put(c,flag);
        return flag;
    }
}


    