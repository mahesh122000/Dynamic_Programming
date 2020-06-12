class Solution {
    static List<List<Integer>>al;
    HashSet<List<Integer>>hs;
    public List<List<Integer>> findSubsequences(int[] nums) {
        int n=nums.length;
        al=new ArrayList<>();
        hs=new HashSet<>();
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add(nums[i]);
            find(nums,nums[i],i+1,1,l);
            l.remove(l.size()-1);
        }
        return al;
    }
    public void find(int a[],int v,int i,int k,List<Integer>l)
    {
        if(k>=2)
        {List<Integer>ll=new ArrayList<>();
        ll.addAll(l);
        if(!hs.contains(ll))
        {al.add(ll);hs.add(ll);}
        }
        if(i>=a.length)
            return;
        for(int j=i;j<a.length;j++)
        {if(a[j]>=v)
        {l.add(a[j]);
        find(a,a[j],j+1,k+1,l);
        l.remove(l.size()-1);}}
    }
}