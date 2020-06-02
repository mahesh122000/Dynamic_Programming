class Solution {
    static HashMap<String,List<String>>hm;
    static HashSet<String>hs;
    public List<String> wordBreak(String s, List<String> wordDict) {
        hm=new HashMap<>();
        hs=new HashSet<>();
        for(String st:wordDict)
            hs.add(st);
        return find(s);
    }
     public List<String> find(String s)
     {
         List<String>l=new ArrayList<>();
         int n=s.length();
         if(n==0)
             return l;
         if(hm.containsKey(s))
             return hm.get(s);
         for(int i=1;i<=n;i++)
         {String c1=s.substring(0,i);
         if(hs.contains(c1))
         {String c2=s.substring(i,n);
         List<String>ll=find(c2);
         if(ll.isEmpty())
         {if(i==n)
         {l.add(c1);
         }}
         else
         {for(String w:ll)
          l.add(c1+" "+w);}}}
         hm.put(s,l);
         return l;
     }
}