class Solution {
    static List<List<Integer>>al;
    public List<List<Integer>> combinationSum3(int k, int n) {
       al=new ArrayList<>();
       List<Integer>l=new ArrayList<>();
       for(int i=1;i<=9;i++)
       {if(n>=i)
       {l.add(i);
       find(1,i,n-i,k,l);
       l.remove(l.size()-1);
       }}
       return al;
    }
    public void find(int i,int j,int n,int k,List<Integer>l)
    {
        if(i==k && n==0)
        {List<Integer>ll=new ArrayList<>();
        ll.addAll(l);
        al.add(ll);}
        if(i>k | n<0)
            return;
        for(int p=j+1;p<=9;p++)
        {if(n>=p)
        {l.add(p);
        find(i+1,p,n-p,k,l);
        l.remove(l.size()-1);
        }}
    }
}