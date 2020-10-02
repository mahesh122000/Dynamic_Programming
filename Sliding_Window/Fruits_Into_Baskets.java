class Solution {
    public int totalFruit(int[] tree) {
        int n=tree.length;
        int start=0,end=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        HashSet<Integer>hs=new HashSet<>();
        hm.put(tree[0],0);
        hs.add(tree[0]);
        int max=0;
        for(end=1;end<n;end++)
        {
            if(hm.containsKey(tree[end]))
                hm.put(tree[end],end);
            else if(hm.size()==1)
            {
                hm.put(tree[end],end);
                hs.add(tree[end]);
            }
            else
            {
                int pre=-1;
                Iterator<Integer>it=hs.iterator();
                while(it.hasNext())
                {
                    int k=it.next();
                    if(k!=tree[end-1])
                        pre=k;
                }
                start=hm.get(pre);
                hm.remove(pre);
                hs.remove(pre);
                start++;
                hs.add(tree[end]);
                hm.put(tree[end],end);
            }
            max=Math.max(max,end-start+1);
        }
        max=Math.max(max,end-start);
        return max;
    }
}