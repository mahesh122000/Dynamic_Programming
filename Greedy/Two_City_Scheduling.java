class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n=costs.length;
        int a[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
            a[i][0]=costs[i][0];
            a[i][1]=costs[i][1];
            a[i][2]=a[i][0]-a[i][1];
        }
        Arrays.sort(a,(p,q)->p[2]-q[2]);
        int sum=0;
        for(int i=0;i<n;i++)
        {if(i<n/2)
         sum+=a[i][0];
        else
         sum+=a[i][1];}
        return sum;
    }
}