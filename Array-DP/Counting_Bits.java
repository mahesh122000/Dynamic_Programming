class Solution {
    public int[] countBits(int num) {
        int a[]=new int[num+1];
        a[0]=0;
        for(int i=1;i<=num;i++)
        {
            a[i]=a[(i&(i-1))]+1;
        }
            return a;
    }
}