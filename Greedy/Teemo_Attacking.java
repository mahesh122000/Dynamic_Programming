class Solution {
    public int findPoisonedDuration(int[] t, int d) {
        int n=t.length;
        if(n==0)
            return 0;
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            a[i][0]=t[i];
            a[i][1]=a[i][0]+d-1;
        }
        Arrays.sort(a,(p,q)->p[0]==q[0]?p[1]-q[1]:p[0]-q[0]);
        ArrayList<int[]>al=new ArrayList<>();
        int l=a[0][0];
        int h=a[0][1];
        int val=0;
        for(int i=1;i<n;i++)
        {
            if(a[i][0]<=h)
            {
                h=Math.max(h,a[i][1]);
            }
            else
            {
               val+=h-l+1;
                l=a[i][0];
                h=a[i][1];
            }
        }
        val+=h-l+1;
        return val;
    }
}