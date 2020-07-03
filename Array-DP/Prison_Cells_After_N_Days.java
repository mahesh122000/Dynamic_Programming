class Solution {
    public int[] prisonAfterNDays(int[] a, int n) {
        n=(n%14==0)?14:n%14;
        for(int i=1;i<=n;i++)
        {
            int b[]=new int[8];
            for(int j=1;j<=6;j++)
            {
                if((a[j-1]^a[j+1])==0)
                {
                    b[j]=1;
                }
            }
            a=b;
        }
        return a;
    }
}