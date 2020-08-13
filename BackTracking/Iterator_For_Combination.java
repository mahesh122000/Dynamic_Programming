class CombinationIterator {

    String s;
    int n;
    ArrayList<String>al;
    public CombinationIterator(String characters, int combinationLength) {
        s=characters;
        al=new ArrayList<>();
        int n=combinationLength;
        fill("",0,s,n);
    }
    
    public String next() {
        String ans=al.get(0);
        al.remove(0);
        return ans;
    }
    
    public boolean hasNext() {
        return al.size()>0;
    }
    
    void fill(String c,int i,String s,int n)
    {
        if(c.length()==n)
        {
            al.add(c);
            return ;
        }
        for(int j=i;j<s.length();j++)
        {
            c+=s.charAt(j);
            fill(c,j+1,s,n);
            c=c.substring(0,c.length()-1);
        }
    }
}

