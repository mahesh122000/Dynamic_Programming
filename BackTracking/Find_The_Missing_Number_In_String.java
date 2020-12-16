class GfG
{
    int ans;
	public int missingNumber(String s)
       {
           ans=0;
           int l=s.length();
           for(int i=0;i<l;i++)
           {
               if(i+1>=7)
               return -1;
               int k=convert(s.substring(0,i+1));
               if(check(k+1,s.substring(i+1)))
               {
                   //System.out.println(k+1);
                   if(find(k+1,s.substring(i+1)))
                   return ans;
               }
               else if(check(k+2,s.substring(i+1)))
               {
                   if(safe(k+2,s.substring(i+1)))
                   return k+1;
                   else
                   ans=-1;
               }
           }
           return ans;
       }
       int convert(String s)
       {
           return Integer.parseInt(s);
       }
       boolean check(int n,String s)
       {
           String c=Integer.toString(n);
           int l=c.length();
           if(s.length()<l)
           return false;
           return s.startsWith(c);
       }
       boolean safe(int n,String s)
       {
           String c=Integer.toString(n);
           int l=c.length();
           if(s.length()==l)
           return true;
           s=s.substring(l);
           if(check(n+1,s))
           return safe(n+1,s);
           else
           return false;
       }
       boolean find(int n,String s)
       {
           String c=Integer.toString(n);
           int l=c.length();
           s=s.substring(l);
           if(check(n+1,s))
           return find(n+1,s);
           else if(check(n+2,s))
           {
               if(safe(n+2,s))
               {
                   ans=n+1;
                   return true;
               }
               else
               {
                   ans=-1;
                   return false;
               }
           }
           else
           {
               ans=-1;
               return false;
           }
       }
}