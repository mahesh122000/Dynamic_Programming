class Solution {
    public int videoStitching(int[][] c, int t) {
        int a[]=new int[101];
        for(int i=0;i<c.length;i++)
            a[c[i][0]]=Math.max(a[c[i][0]],c[i][1]);
        for(int i=1;i<=t;i++)
            a[i]=Math.max(a[i],a[i-1]);
        int count=0,start=0;
        while(true)
        {
            if(a[start]<=start)
                return -1;
            start=a[start];
            count++;
            if(start>=t)
                return count;
        }
    }
}