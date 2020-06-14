class Solution {
    public int eraseOverlapIntervals(int[][] a) {
     Arrays.sort(a,(p,q)->p[0]-q[0]);
     int n=a.length;
        if(n==0)
            return 0;
      int r=a[0][1];
      int count=0;
      for(int i=1;i<n;i++)
      {
          if(a[i][0]<r)
          {count++;
          r=Math.min(r,a[i][1]);}
          else
          {
          r=a[i][1];}
      }
        return count;
    }
}