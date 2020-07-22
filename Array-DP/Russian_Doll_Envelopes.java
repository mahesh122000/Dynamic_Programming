class Solution {
    public int maxEnvelopes(int[][] a) {
        Arrays.sort(a,(p,q)->p[0]==q[0]?p[1]-q[1]:p[0]-q[0]);
        int n=a.length;
        int b[]=new int[n];
        Arrays.fill(b,1);
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i][0]>a[j][0] && a[i][1]>a[j][1] && b[i]<b[j]+1)
                    b[i]=b[j]+1;
            }
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,b[i]);
        }
        return max;
    }
}