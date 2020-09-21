class Solution {
    public boolean carPooling(int[][] a, int capacity) {
        Arrays.sort(a,(p,q)->p[1]==q[1]?p[2]-q[2]:p[1]-q[1]);
        int val=a[0][0];
        PriorityQueue<int[]>pq=new PriorityQueue<>((p,q)->p[1]-q[1]);
        pq.add(new int[]{0,a[0][2]});
        for(int i=1;i<a.length;i++)
        {
                val+=a[i][0];
                pq.add(new int[]{i,a[i][2]});
            while(!pq.isEmpty() && pq.peek()[1]<=a[i][1])
            {
                val-=a[pq.peek()[0]][0];
                pq.poll();
            }
            if(val>capacity)
                    return false;
        }
        return true;
    }
}