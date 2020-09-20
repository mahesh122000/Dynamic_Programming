class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] a) {
        int n=a.length;
        int count=0;
        int val=startFuel;
        int i=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>((p,q)->q-p);
        while(true)
        {
            if(val>=target)
                return count;
            while(i<n && a[i][0]<=val)
            {
                pq.add(a[i++][1]);
            }
            if(pq.isEmpty())
                return -1;
            val+=pq.poll();
            count++;
        }
    }
}