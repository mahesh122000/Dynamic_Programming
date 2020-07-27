class Solution {
    public int triangleNumber(int[] a) {
        int n=a.length;
        int ans=0;
        Arrays.sort(a);
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                int k=a[i]+a[j];
                int p=j+1;
                while(p<n && a[p]<k)
                {
                    ans++;
                    p++;
                }
            }
        }
        return ans;
    }
}