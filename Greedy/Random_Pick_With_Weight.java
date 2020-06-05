class Solution {
    TreeMap<Integer,Integer>tm;
    int sum;
    Random ran;
    public Solution(int[] w) {
       sum=0;
       ran=new Random();
       tm=new TreeMap<>();
       for(int i=0;i<w.length;i++)
       {sum+=w[i];
        tm.put(sum-1,i);
       }
    }
    
    public int pickIndex() {
        int k=ran.nextInt(sum);
        return (int)tm.ceilingEntry(k).getValue();
    }
}