class Solution {
    
    public int[] findRightInterval(int[][] a) {
        int n=a.length;
        TreeMap<Integer,Integer>tm=new TreeMap<>();
        for(int i=0;i<n;i++)
        {tm.put(a[i][0],i);}
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            Integer idx=tm.ceilingKey(a[i][1]);
            b[i]= idx == null ? -1 : tm.get(idx);
        }
        return b;
    }
}
 