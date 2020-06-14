class Solution {
    public int findMinArrowShots(int[][] a) {
     Arrays.sort(a,(p,q)->p[0]==q[0]?p[1]-q[1]:p[0]-q[0]);
     ArrayList<int[]>al=new ArrayList<>();
        int n=a.length;
        if(n==0)
            return 0;
        int l=a[0][0];
        int r=a[0][1];
        for(int i=1;i<n;i++)
        {
            if(a[i][0]<=r)
            {l=Math.max(l,a[i][0]);
            r=Math.min(r,a[i][1]);}
            else
            {
                al.add(new int[]{l,r});
                l=a[i][0];
                r=a[i][1];
            }
        }
        al.add(new int[]{l,r});
        return al.size();
    }
}