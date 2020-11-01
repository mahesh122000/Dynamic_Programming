class Solution {
    public int minIncrementForUnique(int[] A) {
        HashSet<Integer>hs=new HashSet<>();
        Arrays.sort(A);
        if(A.length==0)
            return 0;
        hs.add(A[0]);
        int count=0;
        int max=A[0]+1;
        for(int i=1;i<A.length;i++)
        {
            if(hs.contains(A[i]))
            {
                count+=max-A[i];
                hs.add(max);
                max++;
            }
            else
            {
                hs.add(A[i]);
                max=Math.max(max,A[i]+1);
            }
        }
        return count;
    }
}