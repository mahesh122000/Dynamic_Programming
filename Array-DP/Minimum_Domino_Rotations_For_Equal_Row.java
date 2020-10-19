class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int n=A.length;
        int a[]=new int[7];
        int b[]=new int[7];
        int c[]=new int[7];
        for(int i=0;i<n;i++)
        {
            a[A[i]]++;
            b[B[i]]++;
            if(A[i]==B[i])
                c[A[i]]++;
        }
        for(int i=1;i<=6;i++)
        {
            if(a[i]+b[i]-c[i]>=n)
                return n-Math.max(a[i],b[i]);
        }
        return -1;
    }
}