class Solution {
    HashMap<String,List<Integer>>hm;
    public List<Integer> diffWaysToCompute(String input) {
        hm=new HashMap<>();
        return find(input);
    }
    List<Integer> find(String s)
    {
        if(hm.containsKey(s))
            return hm.get(s);
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='+'||c=='-'||c=='*')
            {
                List<Integer>l=find(s.substring(0,i));
                List<Integer>r=find(s.substring(i+1));
                for(int j=0;j<l.size();j++)
                {
                    for(int k=0;k<r.size();k++)
                    {
                        if(c=='+')
                            ans.add(l.get(j)+r.get(k));
                        else if(c=='-')
                            ans.add(l.get(j)-r.get(k));
                        else
                            ans.add(l.get(j)*r.get(k));
                    }
                }
            }
        }
        if(ans.size()==0)
            ans.add(Integer.parseInt(s));
        hm.put(s,ans);
        return ans;
    }
}