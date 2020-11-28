class Solution {
    public int longestArithSeqLength(int[] a) {
        int n=a.length;
        ArrayList<HashMap<Integer,Integer>>al=new ArrayList<>();
        int max=0;
        for(int i=0;i<n;i++)
        {
            al.add(new HashMap<>());
            for(int j=0;j<i;j++)
            {
                int k=a[i]-a[j];
                int p=1;
                if(al.get(j).containsKey(k))
                    p=al.get(j).get(k);
                if(al.get(i).containsKey(k))
                {
                    max=Math.max(max,Math.max(al.get(i).get(k),p+1));
                    al.get(i).put(k,Math.max(al.get(i).get(k),p+1));
                }
                else
                {
                    al.get(i).put(k,p+1);
                    max=Math.max(max,p+1);
                }
            }
        }
        return max;
    }
}